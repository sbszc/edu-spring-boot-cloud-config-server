package com.sbszc.eduspringbootcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EduSpringBootCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduSpringBootCloudConfigServerApplication.class, args);
    }

}
