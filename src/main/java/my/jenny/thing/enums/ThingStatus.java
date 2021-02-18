package my.jenny.thing.enums;

import lombok.AllArgsConstructor;

import java.util.Objects;

/**
* @description 物品状态
* @author wanggc
* @date 2020/11/9 7:19 下午
*/
@AllArgsConstructor
public enum ThingStatus {

    /**
     * 正常
     */
    NORMAL("1", "正常"),

    /**
     * 废弃
     */
    DESTROY("99", "废弃");

    /**
     * 状态编码
     */
    private String code;

    /**
     * 状态名称
     */
    private String name;

    /**
     * 根据编码获取物品状态
     * @param code 状态编码
     * @return 物品状态
     */
    public static ThingStatus getByCode(String code) {
        for(ThingStatus status : ThingStatus.values()) {
            if (Objects.equals(code, status.code)) {
                return status;
            }
        }
        return null;
    }
}
