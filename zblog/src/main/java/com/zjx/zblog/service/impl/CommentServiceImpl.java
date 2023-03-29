package com.zjx.zblog.service.impl;

import com.zjx.zblog.entity.Comment;
import com.zjx.zblog.mapper.CommentMapper;
import com.zjx.zblog.service.CommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
