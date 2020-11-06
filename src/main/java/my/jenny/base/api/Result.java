package my.jenny.base.api;

import lombok.Data;

import java.io.Serializable;

/**
* @description 
* @author wanggc
* @date 2020/9/16 8:04 下午
*/
@Data
public class Result<T> implements Serializable {
    private Boolean success;
    private Integer status;
    private T data;
    private String msg;
}
