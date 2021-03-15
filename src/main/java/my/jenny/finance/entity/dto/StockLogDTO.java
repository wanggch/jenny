package my.jenny.finance.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class StockLogDTO {
    /**
     * 主键
     */
    private String id;
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
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal marketValue;
    /**
     * 盈亏（金额）
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal pl;
    /**
     * 盈亏（百分比）
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
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
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal cost;
    /**
     * 现价
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal currentPrice;

    /**
     * 盈利标识
     * @return true - 盈利；false - 亏损
     */
    public boolean getFlag() {
        return this.getPl().compareTo(new BigDecimal(0)) == 1;
    }
}
