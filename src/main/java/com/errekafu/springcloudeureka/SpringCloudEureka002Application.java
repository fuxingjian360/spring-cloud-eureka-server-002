package com.errekafu.springcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEureka002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEureka002Application.class, args);
    }

}
