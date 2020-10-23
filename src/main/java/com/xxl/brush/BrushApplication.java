package com.xxl.brush;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 《人工智能中心》
 *
 *
 */
@SpringBootApplication
@EnableSwagger2
@EnableScheduling
@EnableAsync
public class BrushApplication {
	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(BrushApplication.class);
 		builder.headless(false)
 				.run(args);
	}



}


