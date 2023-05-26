package Homework;

public class Addit {
	public static void main(String args[])
	{
		int [] marks= {100,85,100,100,88};
		int max=0;
		int avg=0;
		for(int i=0;i<marks.length;i++)
		{
			max=marks[i]+max;
			avg=max/5;
		}
		System.out.println(avg);	
	}
	

}
