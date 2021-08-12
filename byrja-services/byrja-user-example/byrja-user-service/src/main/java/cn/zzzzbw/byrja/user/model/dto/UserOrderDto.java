package cn.zzzzbw.byrja.user.model.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author by ZHANGBOWEN469
 * @since 2021/8/10 10:50
 */
@Data
public class UserOrderDto {
    private String username;

    private String orderId;

    private Date time;
}
