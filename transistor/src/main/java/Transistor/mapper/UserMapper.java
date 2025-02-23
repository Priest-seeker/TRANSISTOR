package Transistor.mapper;

import Transistor.entity.account.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author：菜包头子
 * @Package：Transistor.mapper
 * @Project：Code_v2
 * @name：UserMapper
 * @Date：2025/2/23 20:01
 * @Filename：UserMapper
 * @Description:
 */
@Mapper
public interface UserMapper{
    // queryAll
    @Select("select * from tb_user")
    List<User> queryAllUser();

    // insert
    @Insert("insert into tb_user (username,password,role) values (#{username},#{password},#{role})")
    int insertUser_basic(User user);

    // delete
    @Select("delete from tb_user where id = #{id}")
    int deleteUser(int id);
}
