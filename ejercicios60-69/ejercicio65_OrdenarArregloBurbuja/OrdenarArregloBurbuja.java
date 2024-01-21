/*
 * Primero en tiempo de ejecución del programa, definimos de qué tamaño es el arreglo, 
 * es decir, cuántos números habrá en el arreglo. Después rellenamos el arreglo, 
 * y posteriormente, con el método de la búrbuja, ordenamos los números de menor a mayor.
 */
package ejercicio65_OrdenarArregloBurbuja;

import java.util.Scanner;

public class OrdenarArregloBurbuja {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int cant;
		
		System.out.println("Ingrese el tamaño del arreglo:");
		cant = sc.nextInt();
		int arr[] = new int[cant];
		
		rellenarArreglo(arr);
		ordenarArreglo(arr);
		
		sc.close();
	}

	private static void rellenarArreglo(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			arr[i] = numeroAleatorio(0,99);
		}
		
	}

	private static int numeroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
	
	private static void ordenarArreglo(int[]arr) {
		int aux = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					aux = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = aux;
				}
			}
		}
		
		int k=0;
		System.out.println("Números ordenados: ");
		while(k<arr.length) {
			System.out.print(arr[k]+" | ");
			k++;
		}
	}
	
	

}
