package com.t3h.day1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.t3h.day1.model.FirstBean;

@Configuration
public class ConfigCommon {

	@Bean
	public FirstBean getBean() {
		return new FirstBean();
	}
}
