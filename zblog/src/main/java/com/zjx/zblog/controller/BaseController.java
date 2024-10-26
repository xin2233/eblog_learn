package com.zjx.zblog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjx.zblog.service.CommentService;
import com.zjx.zblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestUtils;

import javax.servlet.http.HttpServletRequest;

public class BaseController {
    @Autowired
    HttpServletRequest req;

    @Autowired
    PostService postService;

    @Autowired
    CommentService commentService;

    public Page getPage() {
        // pn 是page number , 页面信息，分页信息
        int pn = ServletRequestUtils.getIntParameter(req, "pn",1);
        int size = ServletRequestUtils.getIntParameter(req, "size", 2);

        Page page = new Page(pn, size);

        return page;
    }
}
