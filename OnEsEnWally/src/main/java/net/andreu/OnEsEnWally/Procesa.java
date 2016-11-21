package net.andreu.OnEsEnWally;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Procesa {
	
	String paraula = "Wally";
	int trovat = 0;
	
	public void procesaFitxer(String linia, int n_linia){
		
		if (linia.indexOf("Wally") != -1) {
			trovat ++;
			Pattern p = Pattern.compile("(([\\s|\\\\.|\\\\,]" + paraula + ")|^" + paraula + ")([\\s|\\\\.|\\\\,]|$)");
			@SuppressWarnings("unused")
			Matcher m = p.matcher(linia);
			
	        if (trovat > 1) {
	        	System.out.println("FITXER INCORRECTE");
	        }else{
	        	System.out.println("En Wally esta en la linia " + n_linia);
	        }
			
		} else {
			System.out.println("No hi ha en Wally");
		}
	}
}
