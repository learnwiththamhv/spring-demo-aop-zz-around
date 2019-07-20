package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		Account theAccount = new Account("Bob", "Platinum");

		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		theAccountDAO.addAccount(theAccount, true);

		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

		theMembershipDAO.addSillyMember();

		theAccountDAO.doWork();

		theAccountDAO.setName("foobar");
		theAccountDAO.setServiceCode("Silver");

		String name = theAccountDAO.getName();
		String code = theAccountDAO.getServiceCode();

		theMembershipDAO.goToSleep();

		context.close();
	}

}
