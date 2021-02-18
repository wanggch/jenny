package my.jenny.finance.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import my.jenny.base.api.BasePO;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 银证转账记录
 * @author: wanggc
 */
@Data
@TableName("t_transfer_log")
public class TransferLog extends BasePO {
    /**
     * 主键
     */
    private String id;
    /**
     * 转账金额
     */
    private BigDecimal amount;
    /**
     * 转账时间
     */
    private Date transferTime;
    /**
     * 转账类型
     */
    private Integer transferType;
}
