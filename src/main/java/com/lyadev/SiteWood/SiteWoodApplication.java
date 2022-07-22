package com.lyadev.SiteWood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.lyadev.SiteWood.api"})
public class SiteWoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiteWoodApplication.class, args);
	}

}
