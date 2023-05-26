package Homework;

public class UseCar {
	public static void main(String args[]) {
		Car car1=new Car();
		car1.brand="AUDI";
		car1.distance=2500;
		car1.price=1200000;
		
		Car car2=new Car();
		car2.brand="Benz";
		car2.distance=6500;
		car2.price=1200000;
		
		Car car3=new Car();
		car3.brand="BMW";
		car3.distance=9000;
		car3.price=1200000;
		
		Car[] threecars= {car1,car2,car3};
		
		Car dis=threecars[0];
		
		for(int i=0;i<threecars.length;i++) {
			if(threecars[i].distance>dis.distance)
			{
				dis=threecars[i];
		}
			
	}
		int pri=0;
		for(int i=0;i<threecars.length;i++)
		{
		 if(threecars[i].price>0)
		 {
			 pri=pri+threecars[i].price;
		 }
		}
		System.out.println("Total distance="+dis.distance+","+" Total Price="+pri);
	}
}
