package cn.zzzzbw.byrja.user.service.impl;

import cn.zzzzbw.byrja.order.api.OrderApi;
import cn.zzzzbw.byrja.order.model.dto.OrderDto;
import cn.zzzzbw.byrja.user.config.UserConfig;
import cn.zzzzbw.byrja.user.model.dto.UserDto;
import cn.zzzzbw.byrja.user.model.dto.UserOrderDto;
import cn.zzzzbw.byrja.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author by zzzzbw
 * @since 2021/8/8 22:31
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserConfig userConfig;

    @Autowired
    private OrderApi orderApi;

    @Override
    public UserOrderDto getUserOrderDto(String orderId) {

        UserOrderDto userOrderDto = new UserOrderDto();
        userOrderDto.setUsername(getUserConfig().getName());

        OrderDto orderDto = orderApi.get(orderId);
        if (null != orderDto) {
            userOrderDto.setOrderId(orderDto.getOrderId());
            userOrderDto.setTime(orderDto.getTime());
        }

        return userOrderDto;
    }

    @Override
    public UserDto getUserConfig() {
        UserDto userDto = new UserDto();
        userDto.setName(userConfig.getName());
        return userDto;
    }
}
