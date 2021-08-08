package cn.zzzzbw.feign;

import cn.zzzzbw.model.dto.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author by zzzzbw
 * @since 2021/8/8 22:14
 */
@FeignClient("byrja-order-service")
public interface OrderProvider {

    @GetMapping("order/{orderId}")
    OrderDto get(@PathVariable(name = "orderId") String orderId);
}
