package cn.zzzzbw.user.controller;

import cn.zzzzbw.model.dto.OrderDto;
import cn.zzzzbw.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return userService.getUserOrder(orderId);
    }


    @PostMapping("order")
    public void addOrder(@RequestBody OrderDto order) {
        // userService.addOrder(order);
    }
}
