package com.xingyu.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Goods{
    private long id;
    private String goodsName;
    private String goodsTitle;
    private String goodsImg;
    private String goodsDetail;
    private BigDecimal goodsPrice;
    private String goodsStock;
}
