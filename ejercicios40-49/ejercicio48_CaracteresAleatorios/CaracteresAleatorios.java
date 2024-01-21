/*
 * Primero se almacenan los caracteres de una palabra, en un array de tipo String. 
 * Posteriormente, con la ayuda del método random, de la clase Math, 
 * obtendremos números aleatorios, los cuales redondearemos con el método round de la clase Math, 
 * y haremos un casting a int, para almacenarlo en una variable, 
 * la cual nos permitirá mediante un ciclo for, ir accediendo a diferentes posiciones del arreglo.
 */

package ejercicio48_CaracteresAleatorios;

import java.util.Scanner;

public class CaracteresAleatorios {
	
	public static void main(String[]Args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una palabra");
		String cadena = sc.next();
		
		System.out.println(cadena.length());
		
		String[] parts = cadena.split("");

		for(int i = 0; i <= cadena.length(); i++) {
			int pos = randomNumber(0, cadena.length()-1);
			System.out.println(parts[pos]);
		}
		
		sc.close();

	}
	
	public static int randomNumber(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
}
