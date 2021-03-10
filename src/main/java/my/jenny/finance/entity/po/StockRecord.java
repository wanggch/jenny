package my.jenny.finance.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import my.jenny.base.api.BasePO;

import java.math.BigDecimal;
import java.util.Date;

/**
* @description 股票交易记录
* @author wanggc
* @date 2020/11/5 4:25 下午
*/
@Data
@TableName("t_stock_record")
public class StockRecord extends BasePO {

    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * 股票编码
     */
    private String stockCode;

    /**
     * 股票详情
     */
    private String stockName;

    /**
     * 价格（单价）
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 成交金额
     */
    private BigDecimal turnover;

    /**
     * 交易时间
     */
    private Date transactionTime;

    /**
     * 交易类型
     */
    private String transactionType;

    /**
     * 佣金
     */
    private BigDecimal commission;

    /**
     * 印花税
     */
    private BigDecimal stampDuty;

    /**
     * 过户费
     */
    private BigDecimal transferFee;
}
