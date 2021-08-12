package cn.zzzzbw.byrja.order.api;

import cn.zzzzbw.byrja.order.model.dto.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author by zzzzbw
 * @since 2021/8/8 22:14
 */
@FeignClient(value = "byrja-order-service", path = "order")
public interface OrderApi {

    @GetMapping("{orderId}")
    OrderDto get(@PathVariable(name = "orderId") String orderId);
}
