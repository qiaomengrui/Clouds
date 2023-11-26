package com.loman.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qmr
 * @date 2023/11/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;
    private String message;
    private T data;

    public static CommonResult valueOf(Integer code, String message){
        return new CommonResult(code, message);
    }

    public static <T> CommonResult valueOf(Integer code, String message, T data){
        return new CommonResult(code, message, data);
    }

    public static CommonResult success() {
        return new CommonResult(200, "success");
    }

    public static <T> CommonResult success(T data) {
        return new CommonResult(200, "success", data);
    }
}
