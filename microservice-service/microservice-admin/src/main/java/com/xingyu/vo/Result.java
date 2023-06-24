package com.xingyu.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result<T> {
    private boolean status;
    private Integer code;
    private String message;
    private T data;
}
