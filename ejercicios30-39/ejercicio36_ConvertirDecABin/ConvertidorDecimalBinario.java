//El ejercicio le pedirá al usuario un número del sistema decimal, en un rango de 0 a 255, 
//y posteriormente nos mostrará en pantalla la conversión a binario.
package ejercicio36_ConvertirDecABin;

import java.util.Scanner;

public class ConvertidorDecimalBinario {
	
	public static void main(String[]args) {
		
		int array[] = new int[8];
		int cont, num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		
		if(num<0 || num>255) {
			System.out.println("El número está fuera de rango");
		} else {
			cont = 0;
			if(num == 0) {
				array[cont] = 0;
				cont++;
			}
			while(num != 0) {
				array[cont] = num%2;
				num = num/2;
				cont++;
			}
			System.out.println("En binario: ");
			
			for(int i = cont - 1; i >= 0; i--) {
				System.out.print(array[i]);
			}
		}
		
		
	}

}
