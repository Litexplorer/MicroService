package com.changgou.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: ChromeChen
 * @Description: 商品微服务
 * @Date: Created in 18:15 2020/11/7 0007
 * @Modified By:
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.changgou.goods.dao"})
public class GoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class, args);
        System.out.println("################ 商品微服务启动完成  ################");
    }
}
