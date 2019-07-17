package com.example.api.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JinXing
 * @date 2019/7/17 14:18
 */

@RestController
@RequestMapping("/user")
public class UserApi {


    /**
     * localhost:8090/user/getUserInfo
     */
    @GetMapping("/getUserInfo")
    public String getUserInfo() {
        return "张三";
    }


}
