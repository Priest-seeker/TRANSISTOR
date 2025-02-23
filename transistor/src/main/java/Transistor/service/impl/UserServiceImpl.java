package Transistor.service.impl;

import Transistor.entity.account.User;
import Transistor.mapper.UserMapper;
import Transistor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author：菜包头子
 * @Package：Transistor.service.impl
 * @Project：Code_v2
 * @name：UserviceServiceImpl
 * @Date：2025/2/23 20:02
 * @Filename：UserviceServiceImpl
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper mapper;

    @Override
    public List<User> queryAllUser() {
        return mapper.queryAllUser();
    }

    @Override
    public int insertUser_basic(User user) {
        return mapper.insertUser_basic(user);
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }
}
