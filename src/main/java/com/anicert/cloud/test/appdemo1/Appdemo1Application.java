package com.anicert.cloud.test.appdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


// 适配华为云istio，注释掉服务发现注解
//@EnableDiscoveryClient
@SpringBootApplication
public class Appdemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Appdemo1Application.class, args);
    }

    // 适配华为云istio，注释掉ribbon的负载均衡注释
    @Bean
//    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
