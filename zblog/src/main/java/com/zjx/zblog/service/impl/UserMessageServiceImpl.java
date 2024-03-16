package com.zjx.zblog.service.impl;

import com.zjx.zblog.entity.UserMessage;
import com.zjx.zblog.mapper.UserMessageMapper;
import com.zjx.zblog.service.UserMessageService;
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
public class UserMessageServiceImpl extends ServiceImpl<UserMessageMapper, UserMessage> implements UserMessageService {

}
