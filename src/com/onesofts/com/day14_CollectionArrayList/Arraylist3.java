package com.onesofts.com.day14_CollectionArrayList;
import java.util.*;
public class Arraylist3 {
	
		
		public static void main(String args[]) {
			ArrayList<Integer>lmsIds=new ArrayList<>();
			lmsIds.add(570);
			lmsIds.add(1101);
			lmsIds.add(1102);
			lmsIds.add(1099);
		
	     
	        for(Integer x:lmsIds) {
	        	if(x%2==0) {
	        		System.out.println("Even");	
	        	}
	        	else
	        	{
	        		System.out.println("ODD");
	        	}
	        	
	        }
	        
	       		

	}
	}



