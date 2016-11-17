package net.andreu.OnEsEnWally;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 * 
 */
public class App {
	
	private String arxiu = "src/main/resources/fitxer.txt";
	Procesa p;

	public static void main(String[] args) {
		App a = new App();
		a.inici();
	}

	private void inici() {
		llegirFitxer();

	}
	
	private void llegirFitxer() {
		BufferedReader br = null;
		int n_linia = 0;

		try {
			br = new BufferedReader(new FileReader(arxiu));
			String linia;
			p = new Procesa();
			while ((linia = br.readLine()) != null) {
				n_linia ++;
				p.procesaFitxer(linia, n_linia);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
