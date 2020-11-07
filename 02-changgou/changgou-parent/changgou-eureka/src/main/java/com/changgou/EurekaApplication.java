package com.changgou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: ChromeChen
 * @Description: 注册中心服务
 * @Date: Created in 18:03 2020/11/7 0007
 * @Modified By:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        System.out.println("################ Eureka 注册中心启动成功  ################");
    }
}
