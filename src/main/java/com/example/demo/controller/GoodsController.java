package com.example.demo.controller;


import com.example.demo.entity.Goods;
import com.example.demo.entity.Student;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("findAll")
    public List<Goods> findAll(){
        return goodsService.findAll();
    }

    @RequestMapping("delid")
    public int deleteById(int id){
        return goodsService.deleteById(id);
    }

    @PostMapping("addGoods")
    public int addGoods(Goods goods){
        return goodsService.addGoods(goods);
    }

}
