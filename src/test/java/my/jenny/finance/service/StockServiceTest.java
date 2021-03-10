package my.jenny.finance.service;

import my.jenny.finance.entity.po.Stock;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class StockServiceTest {

    @Resource
    private StockService stockService;

    @Test
    public void testAdd() {
        List<Stock> stockList = new ArrayList<>();
        stockList.add(new Stock("000001", "平安银行"));
        stockList.add(new Stock("002405", "四维图新"));
        stockList.add(new Stock("002149", "西部材料"));
        stockList.add(new Stock("600966", "博汇纸业"));
        stockList.forEach(stock -> stockService.add(stock));
    }

}
