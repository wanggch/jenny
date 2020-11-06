package my.jenny.note.entity.po;

import lombok.Data;
import my.jenny.base.api.BasePO;

/**
* @description 笔记
* @author wanggc
* @date 2020/9/10 7:17 下午
*/
@Data
public class Note extends BasePO {

    /**
     * 笔记ID
     */
    private Long noteId;
    /**
     * 笔记名称
     */
    private String noteName;
    /**
     * 笔记发布地址
     */
    private String noteUrl;
    /**
     * 笔记说明
     */
    private String noteMemo;
}
