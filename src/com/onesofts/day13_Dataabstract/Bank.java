package com.onesofts.day13_Dataabstract;

public abstract class Bank {
	public abstract void accNum(long acno);
	public abstract void pin(int pin);
	public void branch(String branch) {
		System.out.println(branch);
	}
	public void isPublic(boolean isPublic) {
		System.out.println(isPublic);
	}

}
