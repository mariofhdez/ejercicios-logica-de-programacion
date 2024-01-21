//Ejercicio rellenar una matriz de 3 filas y 3 columnas, y posteriormente imprimir los datos.
package ejercicio24_Matriz3x3;

import java.util.Scanner;

public class Matriz {
	
	public static void main (String[]Args) {
		
		int matriz[][] = new int [3][3];
		Scanner sc = new Scanner(System.in);
		
		//Rellenar matriz
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				System.out.println("Ingrese un número:");;
				matriz[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("Matriz:");
		for(int i = 0; i < matriz.length; i++) {
			System.out.println("\n");
			for(int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");;
			}
		}
		
	}

}
