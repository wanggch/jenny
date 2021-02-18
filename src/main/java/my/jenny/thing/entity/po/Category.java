package my.jenny.thing.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import my.jenny.base.api.BasePO;

/**
* @description 类别
* @author wanggc
* @date 2020/11/9 5:27 下午
*/
@Data
@TableName("t_category")
public class Category extends BasePO {

    /**
     * 主键
     */
    @TableId
    private String id;

    /**
     * 类别名称
     */
    private String name;

    /**
     * 上级类别ID
     */
    private String parentId;

    /**
     * 上级类别名称
     */
    private String parentName;
}
