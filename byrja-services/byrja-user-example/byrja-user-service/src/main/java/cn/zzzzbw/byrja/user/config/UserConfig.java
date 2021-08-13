package cn.zzzzbw.byrja.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author by ZHANGBOWEN469
 * @since 2021/8/10 10:46
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "byrja.user")
public class UserConfig {

    private String name;

    private int age;
}
