//Crearemos dos arrays, "a" y "b", y almacenaremos 10 números en cada uno. 
//Posteriormente, en un tercer arreglo "c", guardaremos los números del arreglo "a" 
//y el arreglo "b", en este orden: El primero de a, el primero de b, el segundo de a, 
//el segundo de b, el tercero de a, el tercero de b, etc.
package ejercicio15_CombinarArrays;

import java.util.Scanner;

public class CombinarArrays {
	
	public static void main (String[]Args) {
		
		int contador_1 = 0, contador_2 = 0;
		
		int arr_1[] = new int[5];
		int arr_2[] = new int[5];
		int arr_3[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr_1.length; i++) {
			System.out.println("Ingrese un número para el arreglo n° 1");
			arr_1[i] = sc.nextInt();
		}
		
		for(int j = 0; j < arr_2.length; j++) {
			System.out.println("Ingrese un número para el arreglo n° 2");
			arr_2[j] = sc.nextInt();
		}
		
		for(int k = 0; k < arr_3.length; k++) {
			if(k%2 == 0)
			{
				arr_3[k] = arr_1[contador_1];
				contador_1++;
			} else {
				arr_3[k] = arr_2[contador_2];
				contador_2++;
			}
		}
		
		System.out.println("El arreglo n° 3:");
		for(int m = 0; m < arr_3.length; m++) {
			System.out.println(arr_3[m]);
		}
	}

}
