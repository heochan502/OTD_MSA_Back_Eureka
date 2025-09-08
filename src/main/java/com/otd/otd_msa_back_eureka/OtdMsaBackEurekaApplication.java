package com.otd.otd_msa_back_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer // 추가된 부분
@SpringBootApplication
public class OtdMsaBackEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OtdMsaBackEurekaApplication.class, args);
    }

}
