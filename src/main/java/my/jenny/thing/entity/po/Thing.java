package my.jenny.thing.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import my.jenny.base.api.BasePO;

/**
* @description 物品
* @author wanggc
* @date 2020/11/9 5:28 下午
*/
@Data
@TableName("t_thing")
public class Thing extends BasePO {

    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * 物品名称
     */
    private String name;

    /**
     * 类别ID
     */
    private String categoryId;

    /**
     * 类别名称
     */
    private String categoryName;

    /**
     * 状态
     */
    private String status;
}
