package com.jianpeng.business.feign;

import com.jianpeng.order.pojo.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author jianpeng
 * @version 1.0
 * @description: TODO
 * @date 2022/8/29 15:31
 */
@Component
@FeignClient(name = "order-service")
public interface OrderFeign {
    @PostMapping("/feign/addOrder")
    void addOrder(@RequestBody Order order);
}
