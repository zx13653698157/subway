package com.subway.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.subway.entity.User;
import com.subway.entity.vo.UserLogin;

import java.util.HashMap;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张小岚
 * @since 2021-04-09
 */
public interface UserService extends IService<User> {
    public HashMap findUser(UserLogin userLogin);
}
