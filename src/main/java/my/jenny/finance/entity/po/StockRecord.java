package my.jenny.finance.entity.po;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
* @description 股票交易记录
* @author wanggc
* @date 2020/11/5 4:25 下午
*/
@Data
public class StockRecord {

    private String id;
    private String stockCode;
    private String stockName;
    private BigDecimal price;
    private Integer amount;
    private BigDecimal turnover;
    private Date transactionTime;
    private String transactionType;
    private BigDecimal commission;
    private BigDecimal stampDuty;
    private BigDecimal transferFee;
    private Date createTime;
}
