package com.example.demo;

import com.example.demo.entity.Goods;
import com.example.demo.entity.Student;
import com.example.demo.service.GoodsService;
import com.example.demo.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

    @Autowired
    private GoodsService goodsService;
    @Autowired
    private StudentService studentService;
    @Test
    public void contextLoads() {
        Goods iphonexs = new Goods("iphonexs", 8800);
        int iphone = goodsService.addGoods(iphonexs);

        System.out.println(iphone+":"+iphonexs.getId());
//        int zs = studentService.addStudent(new Student("zs", "123", 19));
//        System.out.println(zs);
    }

}
