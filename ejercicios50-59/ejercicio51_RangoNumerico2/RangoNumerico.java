/*
 * Declararemos una variable de tipo boolean, que nos va a decir si el número que introducimos por teclado, 
 * se encuentra en el rango de 1 al 10. Si no se encuentra en ese rango, 
 * se nos volverá a pedir introducir nuevamente el número; para eso usaremos un do while, 
 * para que se esté repitiendo cada vez que pongamos un número inválido. 
 * Si el número está fuera de rango, la variable de tipo boolean, estará en "false". 
 * Si el número está en el rango, la variable tipo boolean estará en "true".
 */

package ejercicio51_RangoNumerico2;

import java.util.Scanner;

public class RangoNumerico {
	
	public static void main(String[]Args) {
		boolean flag;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número");
			int num = sc.nextInt();
			flag = (num>=1 && num<=10);
			
		} while (!flag);
		
		sc.close();
	}

}
