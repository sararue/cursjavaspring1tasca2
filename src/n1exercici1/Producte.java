package n1exercici1;

public class Producte {
	
	//Atributs
	
	private String nom;
	private int preu;
	
	//Constructor
	
	public Producte (String nom, int preu) {
		this.nom=nom;
		this.preu=preu;
	}
	
	//Getters
	
	public int getPreu() {
	return preu;
	}
	
	public String getNom() {
		return nom;
	}


}
