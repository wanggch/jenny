package my.jenny.finance.service;

import lombok.extern.slf4j.Slf4j;
import my.jenny.finance.dao.StockLogDao;
import my.jenny.finance.entity.po.Stock;
import my.jenny.finance.entity.po.StockLog;
import my.jenny.finance.entity.query.StockLogParam;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class StockLogService {

    @Resource
    private StockService stockService;
    @Resource
    private StockLogDao stockLogDao;

    public void add(StockLog stockLog) {
        Stock stock = stockService.findByName(stockLog.getStockName());
        stockLog.setStockCode(stock.getStockCode());
        // 检查今天是否已经添加股票记录
        if (exist(stockLog.getHoldDate(), stockLog.getStockName())) {
            throw new RuntimeException("股票记录已存在，请勿重复提交！");
        }
        stockLogDao.insert(stockLog);
    }

    public boolean exist(String holdDate, String stockCode) {
        StockLogParam param = new StockLogParam();
        param.setStockCode(stockCode);
        param.setHoldDate(holdDate);
        List<StockLog> list = stockLogDao.query(param);
        return list.size() > 0;
    }

}
