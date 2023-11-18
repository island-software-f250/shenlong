package com.islandsoftwaref250.shenlong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ShenlongApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShenlongApplication.class, args);
	}

}
