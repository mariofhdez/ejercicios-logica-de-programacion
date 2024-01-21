/*
 * programa que nos pida ingresar un número de 8 dígitos, y que cada dígito del número, 
 * sea guardado en cada posición de un array. 
 * Al final, se mostrarán sólo los 4 valores del centro de ese número. 
 * Ejemplo:
 * Número ingresado: 12345678
 * Números mostrados: 3456
 * Usaremos algunos métodos de la clase String: valueOf, length y substring.
 * Con el ciclo do while vamos a validar que los números que ingresemos sean exclusivamente de 8 dígitos.
 */

package ejercicio70_DigitosDeUnNumero;

import java.util.Scanner;

public class DigitosDeUnNumero {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String cadena;
		int digitos[] = new int[8];
		
		do {
			System.out.println("Ingrese un número de 8 dígitos");
			num = sc.nextInt();
			cadena = String.valueOf(num);
		} while(cadena.length() != 8);
		
		for(int i=0; i<cadena.length();i++) {
			digitos[i] = Integer.parseInt(cadena.substring(i,i+1));
		}
		
		for(int i=2; i<digitos.length-2;i++) {
			System.out.println("Posicion "+(i+1)+": "+digitos[i]);
		}
		sc.close();
	}

}
