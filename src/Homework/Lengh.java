package Homework;

public class Lengh {
	public static void main(String []args)
	{
		String word=args[0];
		String[] a=word.split(",");
		String n1=a[0];
		String n2=a[1];
		String n3=a[3];
		String n4=a[3];
		String [] values= {n1,n2,n3,n4};
		String tem="";
		for (int i=0;i<values.length;i++)
		{
			if(values[i].length()>6)
			{
				tem=values[i].toUpperCase();	
			}
		}
		System.out.println(tem);
	}

}
