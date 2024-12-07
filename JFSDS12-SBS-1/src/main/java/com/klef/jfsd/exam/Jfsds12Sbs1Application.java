package com.klef.jfsd.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Jfsds12Sbs1Application {

	public static void main(String[] args) {
		SpringApplication.run(Jfsds12Sbs1Application.class, args);
	}

}
