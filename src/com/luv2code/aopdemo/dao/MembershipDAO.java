package com.luv2code.aopdemo.dao;

public class MembershipDAO {

	public boolean addSillyMember() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADD");
		return true;
	}

	public void goToSleep() {

		System.out.println(getClass() + ": I'm going to sleep now...");
	}

}
