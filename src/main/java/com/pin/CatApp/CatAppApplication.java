package com.pin.CatApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class CatAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatAppApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext appCtx){
		return args -> {
			System.out.println("Inspecting system beans");

			String[] beanNames = appCtx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String name: beanNames) {
				System.out.println(name);
			}
		};
	}*/
}
