package net.andreu.OnEsEnWally;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.processing.FilerException;

public class Procesa {

	List<Integer> resultats = new ArrayList<>();
	
	public void procesaFitxer(String linia, int n_linia) throws FilerException {
		
		String paraula = "Wally";
		
		if (linia.indexOf("Wally") != -1) {
			Pattern p = Pattern.compile("(([\\s|\\\\.|\\\\,]" + paraula + ")|^" + paraula + ")([\\s|\\\\.|\\\\,]|$)");
			@SuppressWarnings("unused")
			Matcher m = p.matcher(linia);
			
	        if (resultats.size() > 1) {
	        	throw new FilerException("FITXER INCORRECTE");
	        }else{
	        	System.out.println("En Wally esta en la linia " + n_linia);
	        }
				
		} else {
			System.out.println("No hi ha en Wally");
		}
	}
}
