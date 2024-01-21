/*
 * Tenemos una matriz de 3x4, es decir, de 3 filas, y 4 columnas. 
 * Vamos a utilizar un ciclo while y un ciclo for, para recorrer la matriz, 
 * y así ir mostrando en pantalla cada uno de sus números almacenados.
 */
package ejercicio55_Matriz3x4;

public class Matriz3x4 {
	
	public static void main(String[]args) {
		
		int matriz[][] = {{0,2,4,6},{8,10,12,14},{1,3,5,7}};
		
		int i = 0;
		while (i<3) {
			for(int j = 0; j<4; j++) {
				System.out.print("|"+matriz[i][j]+"|");
			}
			System.out.println();
			i++;
		}
	}

}
