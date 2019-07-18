package com.example.demo.service.impl;

import com.example.demo.dao.smbms.GoodsMapper;
import com.example.demo.entity.Goods;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired(required = false)
    private GoodsMapper goodsMapper;


    public List<Goods> findAll() {
        return goodsMapper.findAll();
    }

    @Override
    public int deleteById(int id) {
        return goodsMapper.deleteById(id);
    }

    @Override
    @Transactional(transactionManager = "masterTransactionManager")
    public int addGoods(Goods goods) {
       /* for (int i=0;i<3;i++){
            goods.setName(goods.getName()+i);
            goodsMapper.addGoods(goods);
            if(i==2){
                throw new RuntimeException("test");
            }
        }*/
        return goodsMapper.addGoods(goods);
    }
}
