/*
 * Crearemos primero una matriz de 4x4. 
 * Con un ciclo for iremos llenando esa matriz sólo con ceros y unos, 
 * pero los unos se encontrarán en la diagonal principal. 
 * Vamos a usar a  Arrays.toString para imprimir cada elemento de la matriz.
 */

package ejercicio57_Matriz4x4;

import java.util.Arrays;

public class Matriz4x4 {
	
	public static void main(String[]args) {
		int matriz[][] = new int[4][4];
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz.length; j++) {
				if(i==j) {
					matriz[i][j] = 1;					
				} else {
					matriz[i][j] = 0;
				}
			}
		}
		
		for(int i = 0; i<matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
	}

}
