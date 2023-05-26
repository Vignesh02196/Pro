package Homework;

public class UseAc {
	public static void main(String []args) {
		Compressor c=new Compressor("TATA",3522,3.2f);
		Ac a=new Ac("SAMSUNG",3433,true,c);
		System.out.println(a +","+c);
		
		
	}

}
