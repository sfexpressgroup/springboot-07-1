package com.ht;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ht.dao")
public class Springboot071Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot071Application.class, args);
	}

}
