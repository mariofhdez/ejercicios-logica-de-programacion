/*
 * programa en Java, que permita ingresar número de 3 dígitos, 
 * almacenar cada dígito en la posición de un array, 
 * y al final  mostrar cuál es el mayor de esos 3 dígitos.
 */

package ejercicio74_DigitoMayor;

import java.util.Scanner;

public class DigitoMayor {
	
	public static void main(String[]args) {
		int num, max = 0;
		String cadena;
		int digitos[] = new int[3];
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Ingrese un número de 3 dígitos: ");
			num = sc.nextInt();
			cadena = String.valueOf(num);
		} while (cadena.length() != 3);
		
		for(int i = 0; i<cadena.length(); i++) {
			digitos[i] = Integer.parseInt(cadena.substring(i, i+1));
			if(digitos[i]>max)max=digitos[i];
		}		
		
		System.out.println("El dígito mayor es: " + max);
		sc.close();
	}

}
