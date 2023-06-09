package top.yumoyumo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: yumo
 * @Description: TODO
 * @DateTime: 2023/5/3 13:20
 **/
@SpringBootApplication
@EnableEurekaClient
public class OrderMain10080 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain10080.class,args);
    }
}