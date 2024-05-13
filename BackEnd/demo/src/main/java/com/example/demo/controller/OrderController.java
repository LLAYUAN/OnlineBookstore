package com.example.demo.controller;

import com.example.demo.pojo.orderdata;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {
    @RequestMapping("/getListOrderInfo")
    public List <orderdata> getListOrderInfo() {
        System.out.println("orderOK");
        List <orderdata> orderdatalist = new ArrayList<>();
        orderdata data1 = new orderdata();
        orderdata data2 = new orderdata();
        data1.setId("Threebody");
        data1.setName("三体：全三册");
        data1.setNumber(1);
        data1.setPrice(100);
        data1.setTime("2024-4-15T14:34:00");
        data2.setId("CSAPP");
        data2.setName("深入理解计算机系统：第三版");
        data2.setNumber(2);
        data2.setPrice(176);
        data2.setTime("2024-4-15T14:35:02");
        orderdatalist.add(data1);
        orderdatalist.add(data2);

        return orderdatalist;
    }
}
