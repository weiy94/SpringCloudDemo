package cn.weisoftware.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean//就是spring的applicationContext.xml中的<bean id="" class="">,用注解实现的方式，把对象注入至spring容器中
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
