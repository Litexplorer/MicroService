package com.chen.hello.spring.cloud.alibaba.nacos.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 22:16 2020/11/1 0001
 * @Modified By:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerFeignApplication.class, args);
    }
}
