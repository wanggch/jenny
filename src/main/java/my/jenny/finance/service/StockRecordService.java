package my.jenny.finance.service;

import my.jenny.finance.dao.StockRecordDao;
import my.jenny.finance.entity.po.StockRecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @description 股票交易记录Service
* @author wanggc
* @date 2020/11/5 8:00 下午
*/
@Service
public class StockRecordService {

    @Resource
    private StockRecordDao stockRecordDao;

    public List<StockRecord> findAllStockRecords() {
        return stockRecordDao.findAllStockRecords();
    }
}
