package com.zjx.zblog;

import com.zjx.zblog.entity.User;
import com.zjx.zblog.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = {ZblogApplication.class})
public class ZblogApplicationTests {

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        User user = userService.getById(1L);
        System.out.println(user.toString());
    }

//    @Test
//    public void contextLoads() {
//        System.out.println("=====1\n");
//    }
}
