package Homework;

public class UseBag {
	public static void main(String[]args)
	{
		Bag bag1=new Bag();
		bag1.brand="rubeen".toUpperCase();
		bag1.color="black".toUpperCase();
		bag1.price=700;
		
		Bag bag2=new Bag();
		bag2.brand="Fastrack".toUpperCase();
		bag2.color="red".toUpperCase();
		bag2.price=300;
		
		Bag bag3=new Bag();
		bag3.brand="safari".toUpperCase();
		bag3.color="red".toUpperCase();
		bag3.price=200;
		
		Bag []threebag= {bag1,bag2,bag3};
		
		for(int i=0;i<threebag.length;i++)
		{
			if(threebag[i].price>500)
			{
				System.out.println("BRAND="+threebag[i].brand+ ","+" COLOR="+threebag[i].color+","+" PRICE="+threebag[i].price);
			}
			else
			{
				System.out.println("NO");
			}
		}
		
	}

}
