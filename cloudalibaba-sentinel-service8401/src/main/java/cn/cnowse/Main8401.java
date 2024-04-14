package cn.cnowse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jeong Geol 2024-4-12
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main8401 {

    public static void main(String[] args) {
        SpringApplication.run(Main8401.class, args);
    }

}