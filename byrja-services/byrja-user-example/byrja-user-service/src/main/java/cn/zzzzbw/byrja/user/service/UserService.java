package cn.zzzzbw.byrja.user.service;

import cn.zzzzbw.byrja.order.model.dto.OrderDto;
import cn.zzzzbw.byrja.user.model.dto.UserDto;

/**
 * @author by zzzzbw
 * @since 2021/8/8 22:31
 */
public interface UserService {
    OrderDto getUserOrderDto(String orderId);

    UserDto getUserConfig();
}
