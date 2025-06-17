package org.example.nacos_quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosQuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosQuickstartApplication.class, args);
    }

}
