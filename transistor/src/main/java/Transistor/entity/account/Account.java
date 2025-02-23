package Transistor.entity.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author：菜包头子
 * @Package：Transistor.entity
 * @Project：Code_v2
 * @name：Account
 * @Date：2025/2/23 19:54
 * @Filename：Account
 * @Description: The father class of account and admin
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class Account {
    private String username;
    private String password;
    private int role;
}
