//Este ejercicio consiste en que sl usuario ingresa 10 numeros que componen un arreglo
//Se va a recorrer el arreglo en un orden especifico: primero, ultimo, segundo, penultimo
package ejercicio14_RecorrerArray;

import java.util.Scanner;

public class RecorrerArray {
	
	public static void main(String []Args) {
		
		int arr[] = new int [10];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Ingrese el número de la posición "+(i+1));
			arr[i] = sc.nextInt();
		}
		
		for(int j=0; j < arr.length; j++) {
			if(j%2 == 0) {
				System.out.println(arr[j]);
			} else {
				System.out.println(arr[arr.length-j]);
			}
		}
	}

}
