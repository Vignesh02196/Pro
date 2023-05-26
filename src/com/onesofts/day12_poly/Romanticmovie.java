package com.onesofts.day12_poly;

public class Romanticmovie extends Movie {
	public String findrating(int fight) {
		if(fight==5){
			return "Average";
		}
		else if(fight==4) {
			return "Okay";
		}
		else if(fight==3) {
			return "Good";
		}
		else {
			return "Very Good";
		}
		}

}
