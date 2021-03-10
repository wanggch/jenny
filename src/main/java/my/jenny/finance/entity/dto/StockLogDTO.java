package my.jenny.finance.entity.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class StockLogDTO {
    /**
     * 持有日期
     */
    private String holdDate;
    /**
     * 股票名称
     */
    private String stockName;
    /**
     * 市值
     */
    private BigDecimal marketValue;
    /**
     * 盈亏（金额）
     */
    private BigDecimal pl;
    /**
     * 盈亏（百分比）
     */
    private BigDecimal plPercent;
    /**
     * 持仓
     */
    private Integer position;
    /**
     * 可用数量
     */
    private Integer availableNum;
    /**
     * 成本
     */
    private BigDecimal cost;
    /**
     * 现价
     */
    private BigDecimal currentPrice;
}
