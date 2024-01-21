/*
 * El programa nos pedirá ingresar un número, que tenga 4 dígitos como mínimo y 12 dígitos como máximo. 
 * Si ingresas un número con menos de 4 dígitos o más de 12 dígitos, 
 * el programa te pedirá de nuevo ingresar otro número. Pero además, deben de ser dígitos pares, 
 * como 4 dígitos, 6 dígitos, 8 dígitos, 10 dígitos o 12 dígitos. Si ingresas un número de 3 dígitos, 
 * 5 dígitos, etc., te rechazará ese número y te pedirá otro número. 
 * El do while te obligará a ingresar números válidos. Cada dígito del número que ingresaste, 
 * lo guardará en un array. Es decir, cada dígito va una posición del array. 
 * Al final se te mostrarán en pantalla, los dos dígitos del centro de ese número. 
 * Ejemplos:
 * Ingresaste: 12345678
 * Se te mostrará: 45
 * Ingresaste: 4567899422
 * Se te mostrará: 89
 * Usaremos algunos métodos de la clase String. length, substirng, valueOf, etc.
 */

package ejercicio71_Digitos;

import java.util.Scanner;

public class Digitos {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		long num;
		String cadena;
		
		do {
			System.out.println("Ingrese un número entre 4 y 12 dígitos");
			num = sc.nextLong();
			cadena = String.valueOf(num);
			
		} while(cadena.length() < 4 && cadena.length() > 12 && cadena.length()%2!=0);
		
		int digitos[] = new int[cadena.length()];
		
		for(int i=0; i<cadena.length();i++) {
			digitos[i] = Integer.parseInt(cadena.substring(i,i+1));
		}
		
		for(int i=(digitos.length/2-1); i<=digitos.length/2;i++) {
			System.out.println("Posicion "+(i+1)+": "+digitos[i]);
		}
		sc.close();
	}

}
