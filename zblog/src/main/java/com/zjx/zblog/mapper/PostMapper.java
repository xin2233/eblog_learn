package com.zjx.zblog.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjx.zblog.entity.Post;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjx.zblog.vo.PostVo;
//import io.lettuce.core.dynamic.annotation.Param;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author superXin
 * @since 2023-03-30
 */
@Component
public interface PostMapper extends BaseMapper<Post> {

    IPage<PostVo> selectPosts(Page page, @Param(Constants.WRAPPER) QueryWrapper wrapper);
}
