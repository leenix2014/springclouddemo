package com.sdf;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CallerApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CallerApp.class).web(true).run(args);
    }
}
