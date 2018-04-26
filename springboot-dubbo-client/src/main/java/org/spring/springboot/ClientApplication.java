package org.spring.springboot;

import com.alibaba.dubbo.config.annotation.Reference;
import org.spring.springboot.dubbo.CityDubboConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot 应用启动类
 *
 * Created by bysocket on 16/4/26.
 */
// Spring Boot 应用的标识
@SpringBootApplication
@RestController
public class ClientApplication {

    @Autowired
    private CityDubboConsumerService classityService;

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
//        CityDubboConsumerService classityServicesityService = run.getBean(CityDubboConsumerService.class);
//        classsityService.printCity();
    }


    @RequestMapping(value = "/")
    String index(){
        return classityService.printCity();

    }
}
