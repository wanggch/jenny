package my.jenny.finance.controller;

import lombok.RequiredArgsConstructor;
import my.jenny.finance.entity.po.StockRecord;
import my.jenny.finance.service.StockRecordService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* @description 股票交易记录Controller
* @author wanggc
* @date 2020/11/5 8:04 下午
*/
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/stockRecord")
public class StockRecordController {

    @Resource
    private StockRecordService stockRecordService;

    @RequestMapping(value = "/findAllStockRecords", method = RequestMethod.GET)
    public List<StockRecord> findAllStockRecords() {
        return stockRecordService.findAllStockRecords();
    }
}
