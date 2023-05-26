package Homework;

public class UsePrinter {
	public static void main(String [] args)
	{
		Printer printer1=new Printer();
		printer1.brand="HP";
		printer1.isCoolprinter=true;
		printer1.price=15300;
		
		Printer printer2=new Printer();
		printer2.brand="Canon";
		printer2.isCoolprinter=false;
		printer2.price=13000;
		
		Printer printer3=new Printer();
		printer3.brand="EPSON";
		printer3.isCoolprinter=true;
		printer3.price=19000;
		
		Printer[]threeprinters= {printer1,printer2,printer3};
		
		for(int i =0;i<threeprinters.length;i++)
		{
			System.out.println(threeprinters[i].brand +" "+threeprinters[i].price+" "+threeprinters[i].isCoolprinter);
		}
		
	}

}
