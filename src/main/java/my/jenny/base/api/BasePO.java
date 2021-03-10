package my.jenny.base.api;

import java.util.Date;

/**
* @description 基础PO
* @author wanggc
* @date 2020/11/6 2:36 下午
*/
public abstract class BasePO extends BaseEntity {
    /**
     * 创建时间
     */
    protected Date createTime;

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }
}
