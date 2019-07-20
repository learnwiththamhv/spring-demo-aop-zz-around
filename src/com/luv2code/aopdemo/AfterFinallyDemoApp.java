package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterFinallyDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		List<Account> theAccounts = null;

		try {
			// add a boolean flag to simulate exceptions
			boolean tripWire = false;
			theAccountDAO.findAccounts(tripWire);
		} catch (Exception exc) {
			System.out.println("\n\nMain Program ... caught exception: " + exc);
		}

		System.out.println("\n\nMain Program: AfterThrowingDemoApp");
		System.out.println("----");

		System.out.println(theAccounts);

		System.out.println("\n");

		context.close();
	}

}
