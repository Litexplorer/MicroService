package com.chen.hello.spring.cloud.alibaba.nacos.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 22:12 2020/11/1 0001
 * @Modified By:
 */
@Component
public class NacosConsumerConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
