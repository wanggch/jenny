package my.jenny.base.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
* @description MyBatis配置
* @author wanggc
* @date 2020/11/6 2:35 下午
*/
@Configuration
@ComponentScan("my.jenny.*.dao")
public class MybatisConfig {
}
