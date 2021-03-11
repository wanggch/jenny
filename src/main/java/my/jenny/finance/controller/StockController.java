package my.jenny.finance.controller;

import lombok.extern.slf4j.Slf4j;
import my.jenny.finance.entity.po.Stock;
import my.jenny.finance.service.StockService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/stock")
public class StockController {
    @Resource
    private StockService stockService;
    @RequestMapping("/add")
    public void add(String stockCode, String stockName) {
        log.info("stockCode: {}, stockName: {}", stockCode, stockName);
        stockService.add(stockCode, stockName);
    }
    @RequestMapping("/all")
    public List<Stock> all() {
        return stockService.all();
    }
}
