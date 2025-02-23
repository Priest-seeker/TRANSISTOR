package Transistor.service;

import Transistor.entity.account.User;

import java.util.List;

/**
 * @Author：菜包头子
 * @Package：Transistor.service
 * @Project：Code_v2
 * @name：UserService
 * @Date：2025/2/23 20:01
 * @Filename：UserService
 * @Description:
 */
public interface UserService {
    // selectAllUser
    List<User> queryAllUser();

    // add
    int insertUser_basic(User user);

    // delete
    int deleteUser(int id);

}
