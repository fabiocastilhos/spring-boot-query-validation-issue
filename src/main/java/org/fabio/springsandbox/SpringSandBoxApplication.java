package org.fabio.springsandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class SpringSandBoxApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSandBoxApplication.class, args);
    }

}
