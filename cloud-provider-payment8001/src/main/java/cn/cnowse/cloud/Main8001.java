package cn.cnowse.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Jeong Geol 2024-3-3
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.cnowse.cloud.mapper") // import tk.mybatis.spring.annotation.MapperScan;
public class Main8001 {

    public static void main(String[] args) {
        SpringApplication.run(Main8001.class, args);
    }

}
