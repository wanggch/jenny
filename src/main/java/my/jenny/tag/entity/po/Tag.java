package my.jenny.tag.entity.po;

import lombok.Data;
import my.jenny.base.api.BasePO;

/**
* @description 标签
* @author wanggc
* @date 2020/9/10 7:21 下午
*/
@Data
public class Tag extends BasePO {
    /**
     * 标签ID
     */
    private Long tagId;
    /**
     * 标签名称
     */
    private String tagName;
    /**
     * 标签说明
     */
    private String tagMemo;

}
