package com.dailycodework.LikeSdehotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages="com.dailycodework.LikeSdehotel.model")
public class LikeSdeHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(LikeSdeHotelApplication.class, args);
	}

}
