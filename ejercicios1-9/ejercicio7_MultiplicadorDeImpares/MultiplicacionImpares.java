//En este ejercicio se multiplicarán los 10 primeros números negativos.
package ejercicio7_MultiplicadorDeImpares;

public class MultiplicacionImpares {
	
	public static void main (String[]Args) {
		
		long mult = 1;
		
		for(int i = 1; i <= 19; i+=2) {
			mult = mult * i;
			
		};
		System.out.println("El resultado de la multiplicación es: "+mult);
		
	}

}
