package com.jianpeng.order.api;

import com.jianpeng.order.pojo.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author jianpeng
 * @version 1.0
 * @description: TODO
 * @date 2022/8/29 17:28
 */
public interface OrderAPI {

    @PostMapping("/feign/addOrder")
    void addOrder(@RequestBody Order order);
}
