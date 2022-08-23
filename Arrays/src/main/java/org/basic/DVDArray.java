package org.basic;

public class DVDArray {

static DVD[] dvdCollection = new DVD[15];

DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");

DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");

//dvdCollection[7] = avengersDVD;


public static void main(String[] args) {
	
	
	
	System.out.println(dvdCollection[7]);
	System.out.println(dvdCollection[10]);
	System.out.println(dvdCollection[3]);
	
}




}


