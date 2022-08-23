package org.basic;

public class DVD {


public  String  name;
public  int     releaseYear;
public  String  director;


public DVD(String name, int releaseYear, String director) {
	this.name = name;
	this.releaseYear = releaseYear;
	this.director = director;
}

@Override
public String toString() {
	return "DVD{" +
			       "name='" + name + '\'' +
			       ", releaseYear=" + releaseYear +
			       ", director='" + director + '\'' +
			       '}';
}
}
