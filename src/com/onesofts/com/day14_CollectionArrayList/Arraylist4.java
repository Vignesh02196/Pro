package com.onesofts.com.day14_CollectionArrayList;
import java.util.*;
public class Arraylist4 {
public static void main(String args[]) {
ArrayList<String>states=new ArrayList<>();
states.add("chin");
states.add("paksitan");
states.add("us");
states.add("u");
states.add("italy");
states.add("isdanbul");
/*for(String s:states)
{
	if(s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u")) {
		System.out.println("Contains Vowls");
	}
	else
	{
		System.out.println("Not Contains Vowls");
	}
	
}

for(int i=0;i<states.size();i++)
{
	if(states.get(i).endsWith("a"))
	{	
	System.out.println(states.get(i));	
	}
	else
	{
		System.out.println(states.get(i));
	}
}
String tem=states.get(0);
for(String d:states)
{
  if(d.length()<tem.length()) {
	  
	  tem=d;
  }
  
}
System.out.println(tem);

}
}*/

for(int i=0;i<states.size();i++) {
	
		
		System.out.println(states.get(i).charAt(states.get(i).length()-1));
}		
	}
	

}
