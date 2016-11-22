package net.andreu.OnEsEnWally;

public class FitxerExeption extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5732574028664607172L;
	
	private String error;
	
	public FitxerExeption(String error){
		this.setError(error);
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
