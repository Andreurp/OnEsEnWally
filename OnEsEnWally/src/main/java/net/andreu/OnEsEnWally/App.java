package net.andreu.OnEsEnWally;

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
		try {
			System.out.println(p.llegirFitxer(arxiu));
		} catch (FitxerExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
