package com.assignment.bird;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken {
	
	public static Map<String,String> myLanguages=new HashMap<String,String>();
	static {
		myLanguages.put("English", "Cock-a-doodle-doo");
		myLanguages.put("Danish", "kykyliky");
		myLanguages.put("Dutch", "kukeleku");
		myLanguages.put("Finnish", "kukko kiekuu");
		myLanguages.put("French", "cocorico");
		myLanguages.put("German", "kikeriki");
		myLanguages.put("Greek", "kikiriki");
		myLanguages.put("Hebrew", "coo-koo-ri-koo");
		myLanguages.put("Hungarian", "kukuriku");
		myLanguages.put("Italian", "chicchirichi");
		myLanguages.put("Japanese", "ko-ke-kok-ko-o");
        myLanguages.put("Portuguese", "cucurucu");
        myLanguages.put("Russian", "kukareku");
        myLanguages.put("Swedish", "kuckeliku");
        myLanguages.put("Turkish", "kuk-kurri-kuuu");
        myLanguages.put("Urdu", "kuklooku");
	}
	
	@Override
	public boolean sing() {
		System.out.println("Cock-a-doodle-doo");
		return true;
	}
	
	public boolean sing(String language) {
		if(null== language || language.isEmpty())
		   {
			   //default as english
		  System.out.println("Cock-a-doodle-doo");
		   }
		   else
		   {
			   System.out.println(myLanguages.get(language));
		   }

		return true;
		
	}

}
