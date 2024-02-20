package com.zjx.zblog.controller;

import com.zjx.zblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class BaseController {
    @Autowired
    HttpServletRequest req;

    @Autowired
    PostService postService;
}
