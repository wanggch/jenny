package my.jenny.finance.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import my.jenny.base.api.BasePO;

import java.math.BigDecimal;

/**
 * 持股日志
 * @author: wanggc
 */
@Data
@NoArgsConstructor
@TableName("t_stock_log")
public class StockLog extends BasePO {
    /**
     * 主键
     */
    @TableId
    private String id;
    /**
     * 持有日期
     */
    private String holdDate;
    /**
     * 股票编码
     */
    private String stockCode;
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

    public StockLog(String holdDate, String stockName, BigDecimal marketValue, BigDecimal pl, BigDecimal plPercent,
                    Integer position, Integer availableNum, BigDecimal cost, BigDecimal currentPrice) {
        this.holdDate = holdDate;
        this.stockName = stockName;
        this.marketValue = marketValue;
        this.pl = pl;
        this.plPercent = plPercent;
        this.position = position;
        this.availableNum = availableNum;
        this.cost = cost;
        this.currentPrice = currentPrice;
    }
}
