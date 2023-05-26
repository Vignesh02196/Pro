	package com.onesofts.com.day14_CollectionArrayList;

import java.util.*;

//import.java.util;
public class Arraylist {
	
	public static void main(String args[]) {
		ArrayList<Integer>lmsIds=new ArrayList<>();
		lmsIds.add(570);
		lmsIds.add(1101);
		lmsIds.add(1102);
		lmsIds.add(1099);
		//System.out.println(lmsIds.get(1));
        //lmsIds.set(2, 11000);
        //System.out.println(lmsIds.get(2));
        //lmsIds.remove(0);
        //System.out.println(lmsIds.get(0));
        /*for(int i=0;i<lmsIds.size();i++)
        {
        	System.out.println(lmsIds.get(i));
        }
     
        for(Integer x:lmsIds) {
        	System.out.println(x);
        }*/
        
        lmsIds.forEach(z->System.out.println(z));
	}

}
