package com.jianpeng.business.controller;

import com.jianpeng.business.pojo.User;
import com.jianpeng.business.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 *
 * @author jianpeng
 * @date 2022/8/26 16:20
 */
@RestController
public class BuyController {

    @Autowired
    private BuyService buyService;

    @PostMapping("/buy")
    public String buy (User user) {
        System.out.print(user);
        buyService.buy(user);
        return "新增成功";
    }

}
