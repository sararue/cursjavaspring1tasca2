package n1exercici1;

public class VendaBuidaException extends Exception{
	
	//Atributs
	String errorMessage;
	
	//Constructors

	public VendaBuidaException () {
		errorMessage = "Per fer una venda primer has de afegir productes";
		
	}
	
	//Getter
	
	public String getErrorMessage () {
		return errorMessage;
	}
	
	
	

}


/*L’excepció personalitzada VendaBuidaException ha de ser filla de la classe 
 * Exception. Al seu constructor li hem de passar el missatge 
 *  “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció, 
 *  l’hem de mostrar per pantalla amb el mètode getMessage() de l’excepció.
 */

