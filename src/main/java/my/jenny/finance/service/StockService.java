package my.jenny.finance.service;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import my.jenny.finance.dao.StockDao;
import my.jenny.finance.entity.po.Stock;
import my.jenny.finance.entity.query.StockParam;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class StockService {

    @Resource
    private StockDao stockDao;

    public void add(String stockCode, String stockName) {
        Stock stock = new Stock(stockCode, stockName);
        if (exist(stockCode)) {
            throw new RuntimeException("股票信息已存在！");
        }
        stockDao.insert(stock);
    }

    public void add(Stock stock) {
        stockDao.insert(stock);
    }

    public Stock findByCode(String stockCode) {
        StockParam param = new StockParam();
        param.setStockCode(stockCode);
        List<Stock> resultList = stockDao.query(param);
        if (resultList.size() == 0) {
            log.error("Can not find stock. param={}", new Gson().toJson(param));
            throw new RuntimeException("股票信息尚未录入！");
        }
        return resultList.get(0);
    }

    public Stock findByName(String stockName) {
        StockParam param = new StockParam();
        param.setStockName(stockName);
        List<Stock> resultList = stockDao.query(param);
        if (resultList.size() == 0) {
            log.error("Can not find stock. param={}", new Gson().toJson(param));
            throw new RuntimeException("股票信息尚未录入！");
        }
        return resultList.get(0);
    }

    public boolean exist(String stockCode) {
        StockParam param = new StockParam();
        param.setStockCode(stockCode);
        List<Stock> resultList = stockDao.query(param);
        return resultList.size() > 0;
    }
}
