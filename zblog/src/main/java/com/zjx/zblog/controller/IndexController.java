package com.zjx.zblog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjx.zblog.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController {
    @RequestMapping({"", "/", "/index"})
    public String index() {

        // 1.分页信息，2分类信息，3用户信息，4置顶信息，5 精选，6排序
        IPage results = postService.paging(getPage(), null, null, null, null, "created");
        req.setAttribute("pageData", results);

        /*
          设置index界面的id 是 0
         */
        req.setAttribute("currentCategoryId", 0);
        return "index";
    }
}
