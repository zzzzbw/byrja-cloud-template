package cn.zzzzbw.byrja.order.controller;

import cn.zzzzbw.byrja.order.service.OrderService;
import cn.zzzzbw.model.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by zzzzbw
 * @since 2021/8/8 16:02
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("{orderId}")
    public OrderDto get(@PathVariable String orderId) {
        return orderService.getOrderDto(orderId);
    }
}
