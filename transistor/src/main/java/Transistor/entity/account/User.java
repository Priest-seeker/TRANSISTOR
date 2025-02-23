package Transistor.entity.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author：菜包头子
 * @Package：Transistor.entity.account
 * @Project：Code_v2
 * @name：User
 * @Date：2025/2/23 19:57
 * @Filename：User
 * @Description:
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class User extends Account{
}
