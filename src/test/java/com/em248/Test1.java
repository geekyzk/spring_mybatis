package com.em248;

import com.em248.dao.PhotoMapper;
import com.em248.pojo.Photo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by tian on 2017/5/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试

@ContextConfiguration("classpath:spring/spring-dao.xml") //加载配置文件
public class Test1

{
    @Autowired
    PhotoMapper photoMapper;


    @Test
    public void test() {

        Photo photo = photoMapper.selectByPrimaryKey("4fcd1a6d-67f7-4929-8b60-e446c8c015be");
        System.out.println(photo.getName());
    }
}
