package com.onesofts.com.day14_CollectionArrayList;

import java.util.*;

public class UseEmployee {

	public static void main(String args[]) {
		Employee e1 = new Employee("VIKI", 1101, 25000, "SENIOR", true);
		Employee e2 = new Employee("PRATHP", 1102, 30000, "Developer", true);
		Employee e3 = new Employee("KARTHIK", 1099, 45000, "Manager", true);
		Employee e4 = new Employee("SELVI", 1111, 25000, "SENIOR", false);
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		  for(int i=0;i<emp.size();i++) { System.out.println(emp.get(i)); } for(int
		  i=emp.size()-1;i>0;i--) { System.out.println(emp.get(i)); } for(Employee
		  e:emp) { System.out.println(e); }
		  
		  emp.forEach(z->System.out.println(z)); Employee tem=emp.get(0); for(int
		  i=0;i<emp.size();i++) { if(emp.get(i).getid()>tem.getid()) { tem=emp.get(i);
		  } } System.out.println(tem);
		 

		for (Employee x : emp) {
			if (x.getisMale()==false) {
				System.out.println(x);
			}
		
		emp.forEach(z->{
			if(x.getsalary()>30000) {
				System.out.println(z);
			}
		
		});
		
		for(int i=0;i<emp.size();i++)
		{ 
			if(emp.get(i).getrole().equalsIgnoreCase("Manager"))
			{
				System.out.println(emp.get(i).getname()+","+emp.get(i).getsalary());
				
			}
			}
		ArrayList<Employee>femaleList=new ArrayList<>();
		emp.forEach(y->{
			if(x.getisMale()==false) {
				femaleList.add(y);
			}
		});
		System.out.println(femaleList);
		femaleList.forEach(y->System.out.println(y));
		
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).getisMale()==false) {
				femaleList.add(emp.get(i));
			}
			
		}
		System.out.println(femaleList);
	}

ArrayList <Employee> deve= new ArrayList<>();
emp.forEach(x->{
	if(x.getrole().equalsIgnoreCase("Developer")) {
		deve.add(x);
	}
});
System.out.println(deve);
deve.forEach(y->System.out.println(y));

	}
}

