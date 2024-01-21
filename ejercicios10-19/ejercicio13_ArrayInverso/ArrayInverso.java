// Se pide al usuario 5 números enteros para ser incluidos en un array
// El array se imprime de forma inversa a la que fue ingresada
package ejercicio13_ArrayInverso;

import java.util.Scanner;

public class ArrayInverso {
	
	public static void main (String[]Args) {
		
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Introduzca un número en la posición "+ (i+1));
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Los números en orden inverso son: ");
		
		for (int i = 4; i >= 0; i--) {
			System.out.println(arr[i]);
		};
	}

}
