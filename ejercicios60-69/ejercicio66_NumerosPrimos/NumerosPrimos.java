/*
 * Se almacenan números en un arreglo, y posteriormente se recorre para saber cuáles y cuántos son primos.
 * 
 */


package ejercicio66_NumerosPrimos;

import java.util.Scanner;

public class NumerosPrimos {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de elementos del arreglo: ");
		int cant = sc.nextInt();
		int arr[] = new int[cant];
		
		rellenarArreglo(arr);
		
		int cont = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int div = 0;
			for(int j = 1; j <= arr[i]; j++) {
				if(arr[i]%j == 0) {
					div++;
				}
			}
			if(div==2) {
				System.out.println("Número primo: "+arr[i]);
				cont++;
			}
		}
		System.out.println("Cantidad de números primos: "+cont);
		
		sc.close();
	}
	
	private static void rellenarArreglo(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int num = numeroAleatorio(1, 99);
			if(!validarRepetidos(num, arr)) {
				arr[i]=num;
			} else {
				i--;
			}
			System.out.println(arr[i]);
		}
	}

	private static int numeroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
	
	private static boolean validarRepetidos(int num, int[]arr) {
		boolean esRepetido = false;
		//if(arr.length!=0) {
			for(int i = 0; i<arr.length; i++) {
				esRepetido = (num==arr[i])?true:false;
	//		}
		}
		return esRepetido;
	}

}
