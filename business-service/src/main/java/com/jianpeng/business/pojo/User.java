package com.jianpeng.business.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors //链式写法
public class User {
    private int id;
    private String name;
}
