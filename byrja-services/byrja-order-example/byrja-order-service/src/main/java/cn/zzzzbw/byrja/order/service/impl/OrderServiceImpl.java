package cn.zzzzbw.byrja.order.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.zzzzbw.byrja.order.entity.Order;
import cn.zzzzbw.byrja.order.service.OrderService;
import cn.zzzzbw.model.dto.OrderDto;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author by zzzzbw
 * @since 2021/8/8 16:09
 */
@Service
public class OrderServiceImpl implements OrderService {

    // 模拟数据库数据
    private static final Map<String, Order> ORDER_MAP = new HashMap<>(16);

    static {
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setOrderId(String.valueOf(i));
            order.setTime(new Date());
            ORDER_MAP.put(order.getOrderId(), order);
        }
    }


    @Override
    public Order getOrder(String orderId) {
        return ORDER_MAP.get(orderId);
    }

    @Override
    public OrderDto getOrderDto(String orderId) {
        Order order = getOrder(orderId);
        if (null == order) {
            return null;
        }
        return BeanUtil.copyProperties(order, OrderDto.class);
    }
}
