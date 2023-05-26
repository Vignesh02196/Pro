package com.onesofts.day13_Dataabstract;

public abstract class Worker {
	String name;
	int id;
	int workingHoour;
	int salaryPerhour;
	public abstract void getWork(String job);
	public abstract void calcualteSalary(int workingHour,int salaryPerDay);
    
}
