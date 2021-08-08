package cn.zzzzbw.byrja.order.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author by zzzzbw
 * @since 2021/8/8 16:03
 */
@Data
public class Order {

    private String orderId;

    private Date time;
}
