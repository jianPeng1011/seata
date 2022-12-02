package com.jianpeng.business.service;

import com.jianpeng.business.dao.UserDao;
import com.jianpeng.business.feign.OrderFeign;
import com.jianpeng.business.pojo.User;
import com.jianpeng.order.pojo.Order;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyServiceImpl implements BuyService{

    @Autowired
    private UserDao userDao;
    @Autowired
    private OrderFeign orderFeign;

    @Override
    //@GlobalTransactional
    public void buy(User user) {
        userDao.addUser(user);
        Order order = new Order();
        order.setOrderId(1000 + user.getId());
        order.setOrderNode("这笔订单是由 用户："+user.getName() + " 购买的！");
        orderFeign.addOrder(order);
    }
}
