package com.gmd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@MapperScan("com.gmd.mapper")
@Controller
public class TalentApplication {

    public static void main(String[] args) {
        SpringApplication.run(TalentApplication.class, args);
    }

}
