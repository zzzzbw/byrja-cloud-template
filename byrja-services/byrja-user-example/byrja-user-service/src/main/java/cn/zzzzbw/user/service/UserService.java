package cn.zzzzbw.user.service;

import cn.zzzzbw.model.dto.OrderDto;

/**
 * @author by zzzzbw
 * @since 2021/8/8 22:31
 */
public interface UserService {
    OrderDto getUserOrder(String orderId);
}
