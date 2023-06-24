package com.xingyu.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xingyu.mapper.GoodsMapper;
import com.xingyu.pojo.Goods;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService extends ServiceImpl<GoodsMapper, Goods> {
    @Resource
    private GoodsMapper goodsMapper;

    public List<Goods> selectGoodsList() {
        return goodsMapper.selectGoodsList();
    }
}
