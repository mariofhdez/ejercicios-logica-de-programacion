//Ejercicio para calcular el promedio de números positivos ingresados por el usuario
//Si el usuario ingresa cero o un número negativo, el proceso se detiene mostrando el resultado.
package ejercicio6_PromedioNumerosPositivos;

import java.util.Scanner;

public class Promedio {
	
	public static void main (String[]Args) {
		
		int cantidad = 0;
		double num = 0, prom = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa un número:");
		num = sc.nextDouble();
		
		while(num>0) {
			sum = sum + num;
			cantidad++;
			System.out.println("Ingresa otro número:");
			num = sc.nextDouble();
		}
		if(cantidad == 0) {
			System.out.println("El promedio no pudo ser calculado, no se ingresaron valores!");
		} else {
			prom = sum / cantidad;
			System.out.println("El promedio es: " + prom);
		}
		
		
		
		
	}

}
