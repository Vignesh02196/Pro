package com.onesofts.com.day14_CollectionArrayList;

public class Employee {

	
		private String name;
		private int id;
		private int salary;
		private String role;
		private boolean isMale;
		
		public void setname(String name) {
			this.name=name;
		}
		public String getname(){
			return name;
		}
		public void setid(int id) {
			this.id=id;
		}
		public int getid(){
			return id;
		}
		public void setsalary(int salary) {
			this.salary=salary;
		}
		public int getsalary(){
			return salary;
		}
		public void setrole(String role) {
			this.role=role;
		}
		public String getrole(){
			return role;
		}
		public void setisMale(boolean isMale) {
			this.isMale=isMale;
		}
		public boolean getisMale(){
			return isMale;
		}
		
		public Employee(String name,int id,int salary,String role,boolean isMale) {
			this.name=name;
			this.id=id;
			this.salary=salary;
			this.role=role;
			this.isMale=isMale;
			
		}
		public String toString() {
			return "NAME: "+name+","+"ID: "+id+","+"Salary:"+salary;
		}
	}


