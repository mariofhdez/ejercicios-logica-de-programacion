/*
 * El programa consiste en crear una matriz de 3 filas y 4 columnas (3x4), 
 * en la cual almacenaremos una serie numérica( los números del 0 al 44, de 4 en 4). 
 * Recorreremos la matriz con ciclos for anidados.
 */
package ejercicio56_Matriz3x4For;

public class Matriz3x4For {
	
	public static void main(String[]args) {
		
		int matriz[][] = new int[3][4];
		int serie = 0;
		
		for(int i = 0; i<3; i++) {
			for(int j= 0; j<4; j++) {
				matriz[i][j] = serie;
				System.out.print("|"+matriz[i][j]);
				serie+=4;
			}
			System.out.println();
		}
	}

}
