package com.zjx.zblog.service.impl;

import com.zjx.zblog.entity.Post;
import com.zjx.zblog.mapper.PostMapper;
import com.zjx.zblog.service.PostService;
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
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {

}
