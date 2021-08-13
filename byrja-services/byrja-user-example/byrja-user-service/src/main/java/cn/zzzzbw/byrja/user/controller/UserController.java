package cn.zzzzbw.byrja.user.controller;


import cn.zzzzbw.byrja.order.model.dto.OrderDto;
import cn.zzzzbw.byrja.user.model.dto.UserDto;
import cn.zzzzbw.byrja.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by zzzzbw
 * @since 2021/8/8 22:31
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("order/{orderId}")
    public OrderDto getUserOrder(@PathVariable String orderId) {
        return userService.getUserOrderDto(orderId);
    }


    @GetMapping
    public UserDto addOrder() {
        return userService.getUserConfig();
    }
}
