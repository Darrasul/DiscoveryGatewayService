package com.example.discoverygatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DiscoveryGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryGatewayServiceApplication.class, args);
    }

}
