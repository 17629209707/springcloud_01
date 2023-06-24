package com.xingyu.service.impl;

import com.xingyu.mapper.GoodsMapper;
import com.xingyu.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class GoodsServiceImplTest {
    @Resource
    private GoodsServiceImpl GoodsServiceImpl;

    @Resource
    private GoodsMapper goodsMapper;

    @Test
    public void selectGoodsList(){
        List<Goods> goods = GoodsServiceImpl.lambdaQuery().list();
        for (Goods good : goods) {
            System.out.println(good);
        }
    }
}