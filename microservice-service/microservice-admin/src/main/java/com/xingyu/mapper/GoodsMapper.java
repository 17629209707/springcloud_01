package com.xingyu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xingyu.pojo.Goods;

import java.util.List;

public interface GoodsMapper extends BaseMapper<Goods>{
    List<Goods> selectGoodsList();
}
