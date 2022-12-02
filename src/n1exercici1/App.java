package n1exercici1;

public class App {
	
	public static void main (String [] args) {
		
		Venda venda1 = new Venda();
		Producte producte1 = new Producte("formatge",4);
		Producte producte2 = new Producte ("pa", 2);
		Producte producte3 = new Producte ("pernil", 5);
		
		
		try {
			venda1.calcularTotal();
		}catch (VendaBuidaException e) {
			System.out.println(e.getErrorMessage());		
		}
		
		venda1.AfegirLlistaProductes(producte1);
		venda1.AfegirLlistaProductes(producte2);
		venda1.AfegirLlistaProductes(producte3);
		
		try {
			System.out.println("El preu de venda de tots els productes és de " + (venda1.calcularTotal()) + "€");
		}catch (VendaBuidaException e) {
			System.out.println(e.getErrorMessage());			
		}
		
		try {
			
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Estas recorrent una llista amb masses posicions");
		}
		
		try {
			System.out.println("El producte de la posició num 3 és " );
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Estas recorrent una llista amb masses posicions");
		}
		
		
		
		
	
	}


}
