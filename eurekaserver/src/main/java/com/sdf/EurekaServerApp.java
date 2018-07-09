package com.sdf;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String profile = scanner.nextLine();
        new SpringApplicationBuilder(EurekaServerApp.class).profiles(profile).web(true).run(args);
    }
}
