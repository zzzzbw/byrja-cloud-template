package cn.zzzzbw.byrja.order.service;

import cn.zzzzbw.byrja.order.entity.Order;
import cn.zzzzbw.model.dto.OrderDto;

/**
 * @author by zzzzbw
 * @since 2021/8/8 16:09
 */
public interface OrderService {
    Order getOrder(String orderId);

    OrderDto getOrderDto(String orderId);
}
