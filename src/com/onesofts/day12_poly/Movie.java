package com.onesofts.day12_poly;

public class Movie {


	public String findrating(int fight) {
	if(fight==5){
		return "Very Good";
	}
	else if(fight==4) {
		return "Good";
	}
	else if(fight==3) {
		return "Okay";
	}
	else {
		return "Poor";
	}
	}
	
}
