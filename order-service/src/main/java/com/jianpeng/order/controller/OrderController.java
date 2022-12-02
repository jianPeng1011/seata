package com.jianpeng.order.controller;

import com.jianpeng.order.pojo.Order;
import com.jianpeng.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/addOrder")
    public String addOrder (Order order) {
        System.out.print(order);
        orderService.addOrder(order);
        return "新增成功";
    }
}
