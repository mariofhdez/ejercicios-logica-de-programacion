//Ingresaremos 5 números enteros en un arreglo de tamaño de 10, 
//ordenados y de manera creciente. Posteriormente, ingresaremos un número, 
//y éste se insertará en el lugar adecuado, para que el arreglo continúe ordenado, 
//números de menor a mayor.
package ejercicio18_OrdenarNumeroArray;

import java.util.Scanner;

public class OrdenarArreglo {
	
	public static void main (String[]Args) {
		
		int arr[] = new int [10];
		int num, pos_num, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese 5 números en orden creciente:");
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Ingrese un número entero:");
		num = sc.nextInt();
		
		pos_num = 0;
		j = 0;
		while(arr[j] < num && j <= 4) {
			pos_num++;
			j++;
		}
		for(int i = 4; i >= pos_num; i--) {
			arr[i+1] = arr[i];
		}
		arr[pos_num] = num;
		
		for(int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
		
		
		
	}

}
