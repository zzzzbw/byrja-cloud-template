package cn.zzzzbw.user.service.impl;

import cn.zzzzbw.feign.OrderProvider;
import cn.zzzzbw.model.dto.OrderDto;
import cn.zzzzbw.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author by zzzzbw
 * @since 2021/8/8 22:31
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private OrderProvider orderProvider;

    @Override
    public OrderDto getUserOrder(String orderId) {
        return orderProvider.get(orderId);
    }
}
