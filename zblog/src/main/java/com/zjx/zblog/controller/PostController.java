package com.zjx.zblog.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zjx.zblog.entity.Comment;
import com.zjx.zblog.entity.Post;
import com.zjx.zblog.vo.CommentVo;
import com.zjx.zblog.vo.PostVo;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.zjx.zblog.controller.BaseController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author superXin
 * @since 2023-03-30
 */
@Controller
//@RestController
//@RequestMapping("/post")
public class PostController extends BaseController {
    /**
     * @param id \\d* 是指定id参数为数字类型
     * @return
     */
    @GetMapping("/category/{id:\\d*}")
    public String category(@PathVariable(name = "id") Long id) {
        Integer pn = ServletRequestUtils.getIntParameter(req, "pn", 1);

        req.setAttribute("currentCategoryId", id);
        req.setAttribute("pn", pn);

        /*
          这个字符串是 Spring MVC 的视图名（view name），它的作用是告诉 Spring：
            Spring 的 FreeMarkerViewResolver 会把它拼成
            classpath:/templates/post/category.ftl
          所以控制器这句话等价于：
          “把 /templates/post/category.ftl 这套 FreeMarker 模板渲染完，把结果作为 HTML 返回给浏览器。”
         */
        return "post/category";
    }

    /**
     * @param id
     * @return
     */
    @GetMapping("/post/{id:\\d*}")
    public String detail(@PathVariable(name = "id") Long id) {

        PostVo vo = postService.selectOnePost(new QueryWrapper<Post>().eq("p.id", id));
        Assert.notNull(vo, "文章已被删除");

        IPage<CommentVo> results = commentService.paging(getPage(), vo.getId(), null, "created");

        req.setAttribute("commentData", results);
        req.setAttribute("currentCategoryId", vo.getCategoryId());
        req.setAttribute("post", vo);

        return "post/detail";
    }
}
