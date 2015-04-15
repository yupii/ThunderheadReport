package org.yupii.thunderheadtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Thunderhead Reporting tool
 *
 * Author : VivekM - YourPartnersInIT - 1/23/15 - 4:49 PM
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
    public static void main(String[] args){
        final ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for(String beanName : beanNames){
            System.out.println(beanName);
        }
    }
}
