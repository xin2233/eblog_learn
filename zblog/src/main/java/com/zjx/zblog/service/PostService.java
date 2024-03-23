package com.zjx.zblog.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjx.zblog.entity.Post;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjx.zblog.vo.PostVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author superXin
 * @since 2023-03-30
 */
public interface PostService extends IService<Post> {

    IPage paging(Page page, Long categoryId, Long userId, Integer level, Boolean recommend, String order);
    PostVo selectOnePost(QueryWrapper<Post> wrapper);
}
