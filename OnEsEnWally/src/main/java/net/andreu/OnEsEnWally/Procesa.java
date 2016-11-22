package net.andreu.OnEsEnWally;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Procesa {
	
	String paraula = "Wally";
	List<Posicio> pocsicions = new ArrayList<>();
	
	@SuppressWarnings("resource")
	public Posicio llegirFitxer(String arxiu) throws FitxerExeption {
		BufferedReader br = null;
		Pattern p = Pattern.compile("(([\\s|\\\\.|\\\\,]" + paraula + ")|^" + paraula + ")([\\s|\\\\.|\\\\,]|$)");
		int n_linia = 0;
		int n_columne = 0;

		try {
			br = new BufferedReader(new FileReader(arxiu));
			String linia;
			while ((linia = br.readLine()) != null) {
				if ((n_columne = procesaLinia(linia, p)) != -1) {
                	pocsicions.add(new Posicio(n_linia, n_columne));
                } 
			}
			n_linia ++;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (pocsicions.isEmpty()) {
			throw new FitxerExeption("No hi és");
		}
		if (pocsicions.size() > 1) {
			throw new FitxerExeption("FITXER INCORRECTE");
		}
		return pocsicions.get(0);
	}
	
	public int procesaLinia(String linia, Pattern p){
		
		Matcher m = p.matcher(linia);
		
		if(m.find()) {
			return (linia.indexOf(paraula, m.start()));
		}
		return -1;
	}
}
