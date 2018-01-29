package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:consumer.xml"}) // 使用 providers.xml 配置；
public class DubboConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run= SpringApplication.run(DubboConsumerApplication.class, args);
        System.out.println("============开始消费========");

        TestService testService=run.getBean(TestService.class);
       String str= testService.sayHello("你好");
        System.out.println(str);

    }
}  