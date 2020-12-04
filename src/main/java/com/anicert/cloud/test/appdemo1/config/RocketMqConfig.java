//package com.anicert.cloud.test.appdemo1.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//@Configuration
//@Component
//public class RocketMqConfig {
//
//    @Value("${rocketmq.namesrv}")
//    public String nameServer;
//
//    @Value("${rocketmq.consumer.group}")
//    public String consumerGroup;
//
//    @Value("${rocketmq.message.topic}")
//    public String messageTopic;
//
//    public String getNameServer() {
//        return nameServer;
//    }
//
//    public void setNameServer(String nameServer) {
//        this.nameServer = nameServer;
//    }
//
//    public String getConsumerGroup() {
//        return consumerGroup;
//    }
//
//    public void setConsumerGroup(String consumerGroup) {
//        this.consumerGroup = consumerGroup;
//    }
//
//    public String getMessageTopic() {
//        return messageTopic;
//    }
//
//    public void setMessageTopic(String messageTopic) {
//        this.messageTopic = messageTopic;
//    }
//}
