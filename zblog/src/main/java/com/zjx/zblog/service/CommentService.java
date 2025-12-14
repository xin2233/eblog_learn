package com.zjx.zblog.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjx.zblog.entity.Comment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjx.zblog.vo.CommentVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author superXin
 * @since 2023-03-30
 */
public interface CommentService extends IService<Comment> {
    IPage<CommentVo> paging(Page page, Long postId, Long userId, String order);
}
