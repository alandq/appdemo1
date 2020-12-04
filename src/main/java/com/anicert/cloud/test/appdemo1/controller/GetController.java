package com.anicert.cloud.test.appdemo1.controller;

//import com.alibaba.csp.sentinel.annotation.SentinelResource;
//import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.anicert.cloud.test.appdemo1.config.NacosConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class GetController {

    @Autowired
    private NacosConfig nacosConfig;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getstring")
//    @SentinelResource(value = "getString",blockHandler = "blockHandlerForGetString")
    public String getString(){

        String rtn ="";
        // 获取1到10之间的随机数
        int random=(int)(Math.random()*10+1);
        log.info("本次获取的随机数为" + random);
        switch (random){
            case 1:
                rtn = nacosConfig.getTest1();
                break;
            case 2:
                rtn = nacosConfig.getTest2();
                break;
            case 3:
                rtn = nacosConfig.getTest3();
                break;
            case 4:
                rtn = nacosConfig.getTest4();
                break;
            case 5:
                rtn = nacosConfig.getTest5();
                break;
            case 6:
                rtn = nacosConfig.getTest6();
                break;
            case 7:
                rtn = nacosConfig.getTest7();
                break;
            case 8:
                rtn = nacosConfig.getTest8();
                break;
            case 9:
                rtn = nacosConfig.getTest9();
                break;
            case 10:
                rtn = nacosConfig.getTest10();
                break;
        }
        return rtn;
    }

    // blockHandler 函数，原方法调用被限流/降级/系统保护的时候调用
//    public String blockHandlerForGetString(BlockException ex) {
//        return "触发流控或熔断";
//    }

    @GetMapping("/getdbstring")
    public String getDBString(){
        String url = "http://appdemo2/getdbstring";

        ResponseEntity<String> response = restTemplate.getForEntity(url,String.class);
        return response.getBody();
    }

    @GetMapping("/testperformance")
    public String testPerformance(){
        String url = "http://appdemo2/testperformance";

        ResponseEntity<String> response = restTemplate.getForEntity(url,String.class);
        return response.getBody();
    }

}
