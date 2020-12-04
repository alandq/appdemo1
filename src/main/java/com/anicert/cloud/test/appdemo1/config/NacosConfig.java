package com.anicert.cloud.test.appdemo1.config;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
//@RefreshScope
public class NacosConfig {

    @Value("${test.test1}")
    String test1;

    @Value("${test.test2}")
    String test2;

    @Value("${test.test3}")
    String test3;

    @Value("${test.test4}")
    String test4;

    @Value("${test.test5}")
    String test5;

    @Value("${test.test6}")
    String test6;

    @Value("${test.test7}")
    String test7;

    @Value("${test.test8}")
    String test8;

    @Value("${test.test9}")
    String test9;

    @Value("${test.test10}")
    String test10;

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    public String getTest3() {
        return test3;
    }

    public void setTest3(String test3) {
        this.test3 = test3;
    }

    public String getTest4() {
        return test4;
    }

    public void setTest4(String test4) {
        this.test4 = test4;
    }

    public String getTest5() {
        return test5;
    }

    public void setTest5(String test5) {
        this.test5 = test5;
    }

    public String getTest6() {
        return test6;
    }

    public void setTest6(String test6) {
        this.test6 = test6;
    }

    public String getTest7() {
        return test7;
    }

    public void setTest7(String test7) {
        this.test7 = test7;
    }

    public String getTest8() {
        return test8;
    }

    public void setTest8(String test8) {
        this.test8 = test8;
    }

    public String getTest9() {
        return test9;
    }

    public void setTest9(String test9) {
        this.test9 = test9;
    }

    public String getTest10() {
        return test10;
    }

    public void setTest10(String test10) {
        this.test10 = test10;
    }
}
