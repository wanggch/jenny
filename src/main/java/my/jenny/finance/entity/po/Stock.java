package my.jenny.finance.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import my.jenny.base.api.BasePO;

/**
 * 股票信息
 * @author: wanggc
 */
@Data
@NoArgsConstructor
@TableName("t_stock")
public class Stock extends BasePO {
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
     * 股票名称
     */
    private String stockName;

    public Stock(String stockCode, String stockName) {
        this.stockCode = stockCode;
        this.stockName = stockName;
    }
}
