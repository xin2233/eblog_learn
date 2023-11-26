package com.zjx.zblog.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjx.zblog.entity.Category;
import com.zjx.zblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import java.util.List;

@Component
public class ContextStartup implements ApplicationRunner, ServletContextAware {

    @Autowired
    CategoryService categoryService;

    ServletContext servletContext;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        在网站刚开始的时候，就将数据库的分类的数据读到缓存中，这样不用频繁读数据库
        List<Category> categories = categoryService.list(new QueryWrapper<Category>()
                .eq("status", 0)
        );

//        System.out.println("%s", categories);

//        将读到的数据注入到 页面中的变量里
        servletContext.setAttribute("categoryS", categories);
    }


    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
}
