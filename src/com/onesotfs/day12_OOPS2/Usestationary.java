package com.onesotfs.day12_OOPS2;

public class Usestationary {
	public static void main(String args[]) {
		Note n1=new Note("Collegemate",150,"Black",true);
		Note n2=new Note("ATLAS",170,"white",false);
		Note n3=new Note("ALAN",160,"Blue",true);
		Note n4=new Note("Colle",140,"Red",false);
		
		Note notes[]={n1,n2,n3,n4};
		
		for(int i=0;i<notes.length;i++) {
			System.out.println(notes[i]);
		}
		
	}

}
