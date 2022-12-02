package com.jianpeng.order.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors //链式写法
public class Order {

    private int orderId;

    private String orderNode;
}
