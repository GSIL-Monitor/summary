package com.summary.summary;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/*@SpringBootApplication
@MapperScan("com.summary.summary.mapper")
public class SummaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SummaryApplication.class, args);
	}
}*/
@SpringBootApplication
@MapperScan("com.summary.summary.mapper")
public class SummaryApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SummaryApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(SummaryApplication.class, args);
	}
}
