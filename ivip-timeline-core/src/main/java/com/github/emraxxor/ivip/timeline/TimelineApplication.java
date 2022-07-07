package com.github.emraxxor.ivip.timeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.github.emraxxor")
@EnableJpaRepositories(basePackages = "com.github.emraxxor")
@EntityScan(basePackages = "com.github.emraxxor")
public class TimelineApplication {
    public static void main(String[] args) {
        SpringApplication.run(TimelineApplication.class,args);
    }
}
