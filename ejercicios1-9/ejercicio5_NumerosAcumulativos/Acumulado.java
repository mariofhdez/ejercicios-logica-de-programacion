//Este ejercicio suma los números ingresados por el usuario.
//Se detiene al ingresar cero mostrando el acumulado en consola.
package ejercicio5_NumerosAcumulativos;

import java.util.Scanner;

public class Acumulado {
	
	public static void main (String[]Args) {
		
		int num = 0, suma = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese un número:");
			num = sc.nextInt();
			suma = suma + num;
		} while (num!=0);
		System.out.println("La suma es: "+suma);
	}

}
