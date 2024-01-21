//Otro ejercicio usando arreglos. Rellenaremos dos arreglos, A y B, 
//con 6 números enteros cada uno. Y pondremos en un tercer arreglo C esos números, 
//pero de manera especial: 3 números de A, luego 3 números de B. 
//Luego, otros 3 números de A, luego otros 3 números de B... etc.
package ejercicio16_CombinarArrays2;

import java.util.Scanner;

public class CombinarArrays {
	
	public static void main (String[]Args) {
		
		int contadorA = 0, contadorB = 0, contadorC = 0;
		
		int Arr_A[] = new int[6];
		int Arr_B[] = new int[6];
		int Arr_C[] = new int[12];
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		for(int a = 0; a < Arr_A.length; a++) {
			System.out.println("Ingrese un número en la posición " +(a+1)+ " para el Arreglo A:");
			Arr_A[a] = sc.nextInt();
		}
		
		for(int b = 0; b < Arr_B.length; b++) {
			System.out.println("Ingrese un número en la posición " +(b+1)+ " para el Arreglo B:");
			Arr_B[b] = sc.nextInt();
		}
		
		for(int c = 0; c < Arr_C.length; c++) {
			if(flag) {
				Arr_C[c] = Arr_A[contadorA];
				contadorA++;
			} else {
				Arr_C[c] = Arr_B[contadorB];
				contadorB++;
			}
			
			contadorC++;
			if(contadorC%3 == 0 && flag) flag = false;
			else if(contadorC%3 == 0 && !flag) flag = true;
		}
		
		System.out.println("El arreglo C tiene estos elementos:");
		for(int i = 0; i < Arr_C.length; i++) {
			System.out.println(Arr_C[i]);
		}
	}

}
