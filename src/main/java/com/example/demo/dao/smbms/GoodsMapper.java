package com.example.demo.dao.smbms;

import com.example.demo.entity.Goods;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface GoodsMapper {
    @Select("select * from goods")
      List<Goods> findAll();

    @Delete("delete from goods where id = #{id}")
      int deleteById(@Param("id") int id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into goods(name,price) value(#{name},#{price})")
      int addGoods(Goods goods);
}
