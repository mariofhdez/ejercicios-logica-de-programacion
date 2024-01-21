//Crearemos un arreglo de 10 posiciones, donde almacenaremos 10 números enteros, 
//y posteriormente, desplazaremos cada número una posición adelante.
package ejercicio17_DesplazarElementosArray;

import java.util.Scanner;

public class DesplazarArreglo {
	
	public static void main (String[]Args) {
		
		int arr[] = new int[10];
		int ultimo;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Ingrese un número en la posición " + (i+1));
			arr[i] = sc.nextInt();
		}
		
		ultimo = arr[9];
		
		for(int k = 8; k >= 0; k--) {
			arr[k+1] = arr[k];
		}
		arr[0] = ultimo;

		for(int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}

	}
}
