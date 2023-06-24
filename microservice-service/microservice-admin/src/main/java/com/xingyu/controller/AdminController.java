package com.xingyu.controller;

import com.xingyu.pojo.Goods;
import com.xingyu.service.GoodsService;
import com.xingyu.vo.Result;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("adminController")
@Slf4j
public class AdminController {
    @Resource
    private GoodsService goodsService;

    @GetMapping("getGoods")
    public Result<Object> getGoods(){
        log.info("getGoods start");
        List<Goods> goodsList = goodsService.list();
        log.info("getGoods end");
        return Result.builder().status(true).code(200).data(goodsList).build();
    }
}
