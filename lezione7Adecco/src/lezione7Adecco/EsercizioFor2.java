package lezione7Adecco;

/**
 * 
 * 
 * Dato un vettore gia' inizializzato
 * int[] vett = {3 , 4 , 6 , 8 , 15};

 * sovrascrivere tutti gli elementi del vettore
 * moltiplicando gli elementi per 2
 * 
 * 
 * 
 * 				{ 6 , 8 , 12 , 16 , 30 }
 * 
 *  stampare il vettore
 * 
 * @author mr
 *
 */



public class EsercizioFor2 {

	public static void main(String[] args) {
		
		
		int index = 0;
		
		
		int[] vett = {3 , 4 , 6 , 8 , 15};
		
		
		System.out.println(vett.length);
		
		
		for (int i = 0; i < vett.length; i++) {
			
			System.out.println(vett[i]);
		}
		
		
	}
	
	
}
