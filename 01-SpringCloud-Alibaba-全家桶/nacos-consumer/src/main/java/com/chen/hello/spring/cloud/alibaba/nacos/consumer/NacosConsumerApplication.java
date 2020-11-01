package com.chen.hello.spring.cloud.alibaba.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: ChromeChen
 * @Description: Nacos 服务消费者，让消费者去调用服务提供者
 * @Date: Created in 22:10 2020/11/1 0001
 * @Modified By:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerApplication.class, args);
    }
}
