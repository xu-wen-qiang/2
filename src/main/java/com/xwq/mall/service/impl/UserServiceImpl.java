package com.xwq.mall.service.impl;

import com.xwq.mall.entity.User;
import com.xwq.mall.mapper.UserMapper;
import com.xwq.mall.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lx
 * @since 2020-11-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
