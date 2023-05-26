package com.onesofts.day13_Dataabstract;

public class TNGR extends CentralGR {
	public void diplaynumberplatevehicleType(String vehicle) {
		if(vehicle=="PRIVATE")
		{
			System.out.println("BLACK & WHITE");	
		}
		else if(vehicle=="PUBLIC")
		{
			System.out.println("BLUE & YELLOW");	
		}
		else if(vehicle=="ELECTRIC")
		{
			System.out.println("GREEN & WHITE");	
		}
		else 
		{
			System.out.println("INVALID DATA");	
		}
		
	}
	public void diplayStatetcode(String code)
	{
		System.out.println(code);
	}

}
