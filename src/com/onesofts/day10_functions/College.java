package com.onesofts.day10_functions;

public class College {
	String name;
	int fees;
	String location;
	char grade;
	
	public int findMaxfee(College[]a){
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i].fees>0)
			{
				max=a[i].fees;
			}
		}
		return max;
	}
	 public void findMincollege(College[]b)
	 {
		 College min=b[0];
		 for(int i=0;i<b.length;i++)
		 {
			 if(b[i].fees<=min.fees)
			 {
				 min=b[i];
			 }
		 }
		 System.out.println(min.name+","+min.location+","+min.fees+","+min.grade);
	 }

}
