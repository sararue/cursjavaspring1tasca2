package n1exercici1;

public class App {
	
	public static void main (String [] args) {
		
		//creem variables
		
		Venda venda1 = new Venda();
		Producte producte1 = new Producte("formatge",4);
		Producte producte2 = new Producte ("pa", 2);
		Producte producte3 = new Producte ("pernil", 5);
		
		// calculem el preu total dels productes amb llista buida
		try {
			venda1.calcularTotal();
		}catch (VendaBuidaException e) {
			System.out.println(e.getErrorMessage());		
		}
		
		//afegim elements llista
		
		venda1.AfegirLlistaProductes(producte1);
		venda1.AfegirLlistaProductes(producte2);
		venda1.AfegirLlistaProductes(producte3);
		
		// calculem el preu total dels productes amb llista plena
		
		try {
			System.out.println("El preu de venda de tots els productes és de " + (venda1.calcularTotal()) + "€");
		}catch (VendaBuidaException e) {
			System.out.println(e.getErrorMessage());			
		}
		
		//Anem a buscar posicio a la llista per generar error
		
		//aqui fuciona
		try {
			System.out.println("Hi ha un producte a la llista que es diu " + (venda1.getLlistaProductes().get(2).getNom()));
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Estas recorrent una llista amb masses posicions");
		}
		
		
		//aqui no fuciona
		try {
			System.out.println("Hi ha un producte a la llista que es diu " + (venda1.getLlistaProductes().get(0).getNom()));
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Estas recorrent una llista amb masses posicions");
		}
		
	
	}


}
