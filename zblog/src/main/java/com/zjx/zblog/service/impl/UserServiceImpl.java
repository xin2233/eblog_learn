package com.zjx.zblog.service.impl;

import com.zjx.zblog.entity.User;
import com.zjx.zblog.mapper.UserMapper;
import com.zjx.zblog.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
