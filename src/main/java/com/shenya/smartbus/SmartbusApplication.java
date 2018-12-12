package com.shenya.smartbus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shenya.smartbus.dao")
public class SmartbusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartbusApplication.class, args);
    }
}
