package org.yupii.thunderheadtools.web;

import org.yupii.thunderheadtools.service.Greeter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Thunderhead Reporting tool
 * Spring MVC Controller
 *
 * Author : VivekM - YourPartnersInIT - 1/23/15 - 4:21 PM
 */
@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return new Greeter().sayHello();
    }
}