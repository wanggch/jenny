package my.jenny.base.api;

import com.google.gson.Gson;

import java.io.Serializable;

/**
* @description 基础类
* @author wanggc
* @date 2020/9/10 7:08 下午
*/
public class BaseEntity implements Serializable {

    public String toJson() {
        return new Gson().toJson(this);
    }
}
