package my.jenny.base.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("my.jenny.*.dao")
public class MybatisConfig {
}
