package com.luv2code.aopdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import com.luv2code.aopdemo.service.TrafficFortuneService;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.luv2code.aopdemo")
public class DemoConfig {

	@Bean
	AccountDAO accountDAO() {
		return new AccountDAO();
	}

	@Bean
	MembershipDAO membershipDAO() {
		return new MembershipDAO();
	}

	@Bean
	TrafficFortuneService trafficFortuneService() {
		return new TrafficFortuneService();
	}
}
