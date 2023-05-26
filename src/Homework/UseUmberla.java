package Homework;

public class UseUmberla {
	public static void main(String[] args)
	{
		Umberla umberla1=new Umberla();
		umberla1.brand="Destino".toUpperCase();
		umberla1.color="Black".toUpperCase();
		umberla1.netPrice=900;
		
		Umberla umberla2=new Umberla();
		umberla2.brand="fendo".toUpperCase();
		umberla2.color="bule".toUpperCase();
		umberla2.netPrice=260;
		
		Umberla umberla3=new Umberla();
		umberla3.brand="innaya".toUpperCase();
		umberla3.color="multicolor".toUpperCase();
		umberla3.netPrice=460;
		
		Umberla [] threeumberla= {umberla1,umberla2,umberla3};
		
		for(int i=0;i<threeumberla.length;i++)
		{
			/*if(threeumberla[i].netPrice>0)
			{
				net=threeumberla[i].netPrice+100;
			}*/
			System.out.println("BRAND=" +threeumberla[i].brand +","+" COLOR="+threeumberla[i].color+","+" NETPRICE="+(threeumberla[i].netPrice+100));
		}
	}

}
