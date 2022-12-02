package com.jianpeng.order.controller;

import com.jianpeng.order.api.OrderAPI;
import com.jianpeng.order.pojo.Order;
import com.jianpeng.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述：
 *
 * @author jianpeng
 * @date 2022/8/29 18:23
 */
@RestController
public class OrderAPIController implements OrderAPI {


    public static void main(String[] args) {
        Map map = new HashMap();
        Object o = map.get(1);

    }

    @Autowired
    private OrderService orderService;

    @Override
    public void addOrder(Order order) {
        orderService.addOrder(order);
    }
}
