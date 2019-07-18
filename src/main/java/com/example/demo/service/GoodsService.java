package com.example.demo.service;


import com.example.demo.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> findAll();

    int deleteById(int id);

    int addGoods(Goods goods);
}
