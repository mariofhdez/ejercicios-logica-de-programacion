//Ejercicio sobre matriz, para rellenar una matriz de forma automática
//se usa una serie que aumenta de 5 en 5.
//Al final la matriz se imprime.
package ejercicio25_Matriz3x3Serie;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[]Args) {
		
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int serie = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				serie += 5;
				matriz[i][j] = serie;
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			System.out.println("\n");
			for(int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]+ "\t");
			}
		}
	}

}
