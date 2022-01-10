package com.petproject.sparkdatatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDataSparkTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDataSparkTestApplication.class, args);
        CriminalRepository rep = context.getBean(CriminalRepository.class);
        List<Criminal> byNumberBetween = rep.findByNumberBetween(0, 300);
        System.out.println(byNumberBetween);
    }

}
