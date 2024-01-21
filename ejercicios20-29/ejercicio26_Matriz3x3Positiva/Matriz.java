//Este ejercicio propone Rellenar matriz de 3 x 3 con sólo números positivos.
package ejercicio26_Matriz3x3Positiva;

import java.util.Scanner;

public class Matriz {
	
	public static void main (String[]Args) {
		
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int num;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length;) {
				System.out.println("Ingrese un número");
				num = sc.nextInt();
				while(num<0) {
					System.out.println("El número ingresado no es un valor positivo.\n"
							+ "Por favor inténtelo de nuevo!!!");
					num = sc.nextInt();
				}
				matriz[i][j] = num;
				j++;
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
