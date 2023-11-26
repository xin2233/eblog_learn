package com.zjx.zblog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.zjx.zblog.controller.BaseController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author superXin
 * @since 2023-03-30
 */
@Controller
//@RestController
//@RequestMapping("/post")
public class PostController extends BaseController {
    //    \\d* 是指定id参数为数字类型
    @GetMapping("/category/{id:\\d*}")
    public String category(@PathVariable(name = "id") Long id) {

        req.setAttribute("currentCategoryId", id);
        return "post/category";
    }

    @GetMapping("/post/{id:\\d*}")
    public String detail(@PathVariable(name = "id") Long id) {
        return "post/detail";
    }
}
