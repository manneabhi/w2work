package com.soup;

public class SoupMaker {
	private static VegSoup tomato = new TomatoSoup();
	private static VegSoup carrot = new CarrotSoup();

	private static NonVegSoup chickencorn = new ChickenCornSoup();
	private static NonVegSoup hotandsour = new HotAndSourSoup();

	public static SoupFactory getFactory(String choice){
        
        if("VegSoup".equalsIgnoreCase(choice)){
            return new NonVegSoupFactory();
        }
        else if("NonVegSoup".equalsIgnoreCase(choice)){
            return new vegSoupFactory();
        }
        
        return null;
    }
	public static void makeVegSoup()
	{
		tomato.prepare();
		carrot.prepare();
	}
	public static void makeNonVegSoup()
	{
		chickencorn.prepare();
		hotandsour.prepare();
	}
}
