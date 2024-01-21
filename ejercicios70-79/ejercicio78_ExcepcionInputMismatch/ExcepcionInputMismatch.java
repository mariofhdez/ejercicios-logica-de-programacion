/*
 * Programa que nos pedirá dos números enteros, para sumarlos. 
 * Si ponemos un dato que NO sea numérico, como un String, 
 * eso generará la excepción InputMismatchException, 
 * la cual trataremos con los bloques try  y catch.
 */

package ejercicio78_ExcepcionInputMismatch;

import java.util.InputMismatchException;
import java.util.Scanner;
	
public class ExcepcionInputMismatch {
	
	public static void main(String[]args) {
		
		int num1, num2, suma;
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Ingrese el primer número");
			num1 = sc.nextInt();
			System.out.println("Ingrese el segundo número");
			num2 = sc.nextInt();
			suma = num1 + num2;
			System.out.println("El resultado de la suma es: " + suma);
		} catch (InputMismatchException e) {
			System.out.println("Introduce un valor numérico");
		}
		sc.close();
	}

}
