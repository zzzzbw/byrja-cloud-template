package cn.zzzzbw.byrja.order.controller;

import cn.zzzzbw.byrja.order.api.OrderApi;
import cn.zzzzbw.byrja.order.model.dto.OrderDto;
import cn.zzzzbw.byrja.order.service.OrderService;
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
public class OrderController implements OrderApi {

    @Autowired
    private OrderService orderService;

    public OrderDto get(String orderId) {
        return orderService.getOrderDto(orderId);
    }
}
