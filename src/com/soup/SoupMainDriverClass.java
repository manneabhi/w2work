package com.soup;

public class SoupMainDriverClass {
	
	
public static void main(String[] args) {   
		
	
	SoupMaker.getFactory("NonVegSoup");
	SoupMaker.getFactory("VegSoup");

	System.out.println("Non Vegetarian Soup");
	SoupMaker.makeNonVegSoup();
	
	System.out.println("Vegetarian Soup");
	SoupMaker.makeVegSoup();
   }    
}
