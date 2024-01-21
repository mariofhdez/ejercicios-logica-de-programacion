//Este ejercicio pide el valor de la venta diaria durante 7 días
//Esta información es usada para hallar el valor total de ventas de la semana.
package ejercicio1_VentaSemanal;

import java.util.Scanner;

public class VentaSemanal {
	
	public static void main (String[]Args) {
		
		Double ventas[] = new Double[7];
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el valor de las ventas de esta semana.");
		for(int i=0; i<ventas.length; i++){
			System.out.println("Ingrese la venta del día "+(i+1)+":");
			ventas[i] = sc.nextDouble();
		}
		int k = 0;
		double totalVentas = 0;
		
		while(k < ventas.length) {
			totalVentas = totalVentas + ventas[k];
			k++;
		}
		System.out.println("El total de las ventas de la semana es: "+totalVentas);
	}

}
