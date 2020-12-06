package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class ServiceTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService itemsService = (ItemsService)ac.getBean("itemsServiceImpl");
        Items items = new Items();
        items.setName("测试测试");
        itemsService.save(items);

    }
}
