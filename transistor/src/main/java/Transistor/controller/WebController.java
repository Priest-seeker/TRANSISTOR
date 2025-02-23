package Transistor.controller;

import Transistor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：菜包头子
 * @Package：Transistor.controller
 * @Project：Code_v2
 * @name：WebController
 * @Date：2025/2/23 20:03
 * @Filename：WebController
 * @Description:
 */
@RequestMapping
@RestController
public class WebController {
    @Autowired
    UserService userService;
}
