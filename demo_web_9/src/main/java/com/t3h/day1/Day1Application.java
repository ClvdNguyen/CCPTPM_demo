package com.t3h.day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.t3h.day1.model.FirstBean;

@SpringBootApplication
//@AutoConfiguration
public class Day1Application {

	public static void main(String[] args) {
		SpringApplication.run(Day1Application.class, args);
		
//		FirstBean fb = new FirstBean();
//		fb.printHello();
	}

}
