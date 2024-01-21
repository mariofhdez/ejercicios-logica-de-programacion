//Este ejercicio pide al usuario el valor de las ventas realizadas en los ultimos 7 días
//De esta información ubica el día que se obtuvo mayor valor en ventas.
package ejercicio2_MayorVenta;

import java.util.Scanner;

public class MayorVenta {
	
	public static void main (String[]Args) {
		double ventas[] = new double [7];
		Scanner sc = new Scanner(System.in);
		double mayorVenta = 0.0;
		int diaMayorVenta = 0;
		
		System.out.println("Ingrese el valor de las ventas de esta semana.");
		for(int i=0; i<ventas.length; i++){
			System.out.println("Ingrese la venta del día "+(i+1)+":");
			ventas[i] = sc.nextDouble();
		}
		
		for(int k=0; k<ventas.length; k++) {
			if(ventas[k] > mayorVenta) {
				mayorVenta = ventas[k];
				diaMayorVenta = k+1;
			}
		}
		System.out.println("El día con la venta más alta es el "+diaMayorVenta+" y el total fue: "+mayorVenta);
		
		
	}

}
