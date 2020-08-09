package com.jmd.goal.common;

import com.fasterxml.jackson.annotation.JsonView;
import com.jmd.goal.enums.ErrorEnum;

import java.io.Serializable;

/**
 * @author Jiang Mingdong
 * @desc
 * @date 2020/8/8
 */
@JsonView
public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private T data;
    private Integer code;
    private String msg;
    private ApiResult(){
    }
    private ApiResult(ErrorEnum errorEnum, T data){
        this.code = errorEnum.getValue();
        this.msg = errorEnum.getDesc();
        this.data = data;
    }

    public static <T> ApiResult<T> success(T data){

        System.out.println(new ApiResult(ErrorEnum.SUCCESS, data));
        return new ApiResult(ErrorEnum.SUCCESS, data);
    }
    public static <T> ApiResult<T> error(ErrorEnum errorEnum){
        return new ApiResult(errorEnum, null);
    }

    @Override
    public String toString() {
        return "ApiResult{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public T getData() {
        return data;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
