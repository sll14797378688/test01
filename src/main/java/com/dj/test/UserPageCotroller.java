package com.dj.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserPageCotroller
 * @Deacription TODO
 * @Author dj
 * @Date 2020/11/3 22:21
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user/")
public class UserPageCotroller {


    @RequestMapping("login")
    public String login(String userName) throws Exception{
        System.out.println(userName);
        return "user/login";
    }
}
