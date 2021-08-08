package cn.zzzzbw.model.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author by zzzzbw
 * @since 2021/8/8 22:15
 */
@Data
public class OrderDto {

    private String orderId;

    private Date time;
}
