package net.andreu.OnEsEnWally;

public class Procesa {

	public void procesaFitxer(String linia, int n_linia) {
		String[] paraules;
		//linia = " Wally sss;";
		if (linia.indexOf("Wally") != -1) {
			paraules = linia.split(" ");
			for (int i = 0; i < paraules.length; i++) {
				paraules[i].trim();
				int pos = paraules[i].indexOf("Wally");
				if (pos != -1) {
					if (pos - 1 >= 0) {
						if (paraules[i].charAt(pos - 1) == '.' || paraules[i].charAt(pos - 1) == ',') {
							if (pos + 5 < paraules[i].length()) {
								System.out.println("En Wally esta en la linia " + n_linia);
							}
						}
					}/*else{
						if (paraules[i].charAt(pos + 5) == '.' || paraules[i].charAt(pos + 5) == ','){
							if (pos + 5 < paraules[i].length()) {
								System.out.println("En Wally esta en la linia " + n_linia);
							}
						}
					}*/
				}
			}
		} else {
			System.out.println("No hi ha en Wally");
		}
	}
}
