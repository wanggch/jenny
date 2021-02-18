package my.jenny.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import my.jenny.finance.entity.po.TransferLog;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

public class Object2MapTest {

    public static void main(String[] args) {
        // 交易日志
        TransferLog transferLog = new TransferLog();
        transferLog.setId("1");
        transferLog.setTransferType(1);
        transferLog.setTransferTime(new Date());
        transferLog.setAmount(new BigDecimal("2310.00"));
        // 将object转成map
        Map<String, Object> map = new ObjectMapper().convertValue(transferLog, Map.class);
        // 转出转换结果
        System.out.println("## 转换结果 ##");
        System.out.println(new Gson().toJson(map));
    }
}
