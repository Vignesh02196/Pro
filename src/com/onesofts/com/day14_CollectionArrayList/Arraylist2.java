package com.onesofts.com.day14_CollectionArrayList;
import java.util.*;
public class Arraylist2 {
	public static void main(String args[]) {
		ArrayList<Integer>lmsIds=new ArrayList<>();
		lmsIds.add(570);
		lmsIds.add(1101);
		lmsIds.add(1102);
		lmsIds.add(1099);
		int max=lmsIds.get(0);
		for(int i=0;i<lmsIds.size();i++)
			
		{
			if(lmsIds.get(i)>max)
			{
			max=lmsIds.get(i);
		}
		}
		System.out.println(max);
		
		
	}
	}

