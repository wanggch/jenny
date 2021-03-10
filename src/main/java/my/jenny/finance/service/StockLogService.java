package my.jenny.finance.service;

import lombok.extern.slf4j.Slf4j;
import my.jenny.finance.dao.StockLogDao;
import my.jenny.finance.entity.po.Stock;
import my.jenny.finance.entity.po.StockLog;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
        stockLogDao.insert(stockLog);
    }

}
