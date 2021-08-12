package cn.zzzzbw.byrja.user.service;

import cn.zzzzbw.byrja.user.model.dto.UserDto;
import cn.zzzzbw.byrja.user.model.dto.UserOrderDto;

/**
 * @author by zzzzbw
 * @since 2021/8/8 22:31
 */
public interface UserService {
    UserOrderDto getUserOrderDto(String orderId);

    UserDto getUserConfig();
}
