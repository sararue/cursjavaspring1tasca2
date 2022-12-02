package n1exercici1;

import java.util.ArrayList;

public class Venda {

	// Atributs

	private ArrayList<Producte> llistaProductes;
	private int preuTotal;

	// Constructors

	public Venda() {
		preuTotal = 0;
		llistaProductes = new ArrayList<Producte>();
	}
	
	//getters
	
	public ArrayList<Producte> getLlistaProductes (){
		return llistaProductes;
	}

	// Mètodes

	public void AfegirLlistaProductes(Producte producte) {
		llistaProductes.add(producte);
	}

	public int calcularTotal() throws VendaBuidaException {

		if (llistaProductes.size() <= 0) {
			throw new VendaBuidaException();
		} else {
			for (int i = 0; i <= llistaProductes.size(); i++) {
				preuTotal += llistaProductes.get(i).getPreu();
			}

			return preuTotal;
		}
	}


	// Mètodes de la classe

	/*
	 * La classe "Venda", té un mètode anomenat calcularTotal() que llança
	 * l’excepció personalitzada VendaBuidaException i mostra per pantalla “Per fer
	 * una venda primer has d’afegir productes” si la col·lecció de productes està
	 * buida. Si la col·lecció té productes, llavors ha de recórrer la col·lecció i
	 * guardar la suma de tots els preus dels productes a l’atribut preu total de la
	 * venda.
	 */

}
