package Homework;

public class Home {
	public static void main(String[]args)

	{
		String[] names= {"Vignesh","Sathish"};
		for (int i=0;i<names.length;i++)
		{
			System.out.println(names[i].substring(names[i].length()/2,names[i].length()));
		}
	}
}
