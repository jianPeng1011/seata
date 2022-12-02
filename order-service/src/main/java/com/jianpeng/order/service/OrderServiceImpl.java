package com.jianpeng.order.service;

import com.jianpeng.order.dao.OrderDao;
import com.jianpeng.order.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public void addOrder(Order order) {
        int i = 100/0;
        orderDao.addOrder(order);
    }
}
