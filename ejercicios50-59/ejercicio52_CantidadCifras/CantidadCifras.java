/*
 * El programa nos pedirá por pantalla introducir un número entero. 
 * Al final,  nos dirá cuántas cifras tiene ese número. 
 * Para esto, vamos a usar un ciclo do while, y dentro un ciclo while.
 */
package ejercicio52_CantidadCifras;

import java.util.Scanner;

public class CantidadCifras {
	
	public static void main(String[]Args) {
		int num, cifras;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número");
		num = sc.nextInt();
		cifras = 0;
		
		do {
			while(num!=0) {
				num=num/10;
				cifras++;
			}
		}while(num!=0);
		
		System.out.println("La cantidad de cifras del numero son: "+cifras);
		
		sc.close();
	}

}
