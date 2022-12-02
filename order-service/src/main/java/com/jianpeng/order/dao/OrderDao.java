package com.jianpeng.order.dao;

import com.jianpeng.order.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface OrderDao {
    void addOrder(Order order);
}
