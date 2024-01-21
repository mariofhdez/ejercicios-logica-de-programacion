/*
 * Este ejercicio consiste en saber cuántas veces se repite cada número dentro de un arreglo. 
 * Es decir, vamos a conocer la frecuencia de los elementos de un array.
 */

package ejercicio58_FrecuenciaArray;

import java.util.Arrays;

public class FrecuenciaArray {
	
	public static void main (String[]args) {
		int[]arr = {0,5,6,8,2,4,5,7,1,0,2,5,6,7};
		
		Arrays.sort(arr);
		
		int contador = 0;
		int aux = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			if(aux==arr[i]) {
				contador++;
			} else {
				System.out.println("El número " + aux +" se repite "+contador+" veces");
				contador = 1;
				aux = arr[i];
			}
		}
		System.out.println("El número " + aux +" se repite "+contador+" veces");
	}

}
