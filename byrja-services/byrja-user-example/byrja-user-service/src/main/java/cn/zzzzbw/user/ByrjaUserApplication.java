package cn.zzzzbw.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author by zzzzbw
 * @since 2021/8/8 15:17
 */
@EnableFeignClients(basePackages = "cn.zzzzbw")
@SpringBootApplication
public class ByrjaUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ByrjaUserApplication.class, args);
    }
}
