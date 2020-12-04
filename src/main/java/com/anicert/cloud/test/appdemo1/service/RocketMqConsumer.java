package com.anicert.cloud.test.appdemo1.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Slf4j
@RocketMQMessageListener(nameServer = "192.168.0.7:9876", topic = "topic", consumerGroup = "testconsumer")
@Component
public class RocketMqConsumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String message) {
        System.out.println("顺序消费，收到消息:" + message);
        log.warn("从RocketMQ中收到的消息为:" + message);
    }

}
