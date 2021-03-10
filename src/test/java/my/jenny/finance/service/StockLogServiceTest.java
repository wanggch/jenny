package my.jenny.finance.service;

import my.jenny.finance.entity.po.StockLog;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class StockLogServiceTest {

    @Resource
    private StockLogService stockLogService;

    @Test
    public void testAdd() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = dateFormat.format(new Date());
        List<StockLog> stockLogList = new ArrayList<>();

        // 2021-03-05
//        stockLogList.add(new StockLog("2021-03-05", "平安银行",
//                new BigDecimal("8936.00"), new BigDecimal("-85.89"), new BigDecimal("-0.953"), 400,
//                400, new BigDecimal("22.555"), new BigDecimal("22.340")));
//        stockLogList.add(new StockLog("2021-03-05", "西部材料",
//                new BigDecimal("5456.00"), new BigDecimal("-384.96"), new BigDecimal("-6.595"), 400,
//                400, new BigDecimal("14.603"), new BigDecimal("13.640")));
//        stockLogList.add(new StockLog("2021-03-05", "四维图新",
//                new BigDecimal("3154.00"), new BigDecimal("-16.15"), new BigDecimal("-0.511"), 200,
//                200, new BigDecimal("15.851"), new BigDecimal("15.770")));
//        stockLogList.add(new StockLog("2021-03-05", "博汇纸业",
//                new BigDecimal("3112.00"), new BigDecimal("-129.73"), new BigDecimal("-4.004"), 200,
//                200, new BigDecimal("16.209"), new BigDecimal("15.560")));
        // 2021-03-08
//        stockLogList.add(new StockLog(currentDate, "平安银行",
//                new BigDecimal("8640.00"), new BigDecimal("-381.59"), new BigDecimal("-4.234"), 400,
//                400, new BigDecimal("22.555"), new BigDecimal("21.600")));
//        stockLogList.add(new StockLog(currentDate, "西部材料",
//                new BigDecimal("9016.00"), new BigDecimal("-854.02"), new BigDecimal("-8.659"), 700,
//                400, new BigDecimal("14.101"), new BigDecimal("12.880")));
//        stockLogList.add(new StockLog(currentDate, "博汇纸业",
//                new BigDecimal("5908.00"), new BigDecimal("-242.15"), new BigDecimal("-3.941"), 400,
//                200, new BigDecimal("15.376"), new BigDecimal("14.770")));
//        stockLogList.forEach(stockLog -> stockLogService.add(stockLog));
    }

}
