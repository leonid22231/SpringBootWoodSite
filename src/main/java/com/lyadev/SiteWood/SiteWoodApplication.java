package com.lyadev.SiteWood;

import com.lyadev.SiteWood.Storage.StorageProperties;
import com.lyadev.SiteWood.Storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication()
@EnableConfigurationProperties(StorageProperties.class)
public class SiteWoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiteWoodApplication.class, args);
	}
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.init();
		};}

}
