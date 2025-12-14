package com.zjx.zblog.service.impl;

import com.zjx.zblog.entity.Category;
import com.zjx.zblog.mapper.CategoryMapper;
import com.zjx.zblog.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author superXin
 * @since 2023-03-30
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
