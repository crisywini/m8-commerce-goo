package co.crisi.m8commercegoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class M8CommerceGooApplication {

    public static void main(String[] args) {
        SpringApplication.run(M8CommerceGooApplication.class, args);
    }

}
