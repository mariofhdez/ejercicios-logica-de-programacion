/*
 * un programa en Java, para obtener el mínimo común múltiplo de dos números.
 */

package ejercicio67_MinimoComunMultiplo;

import java.util.Scanner;

public class MinimoComunMultiplo {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, max, mcm;
		
		System.out.print("Ingrese el primer número: ");
		num1 = sc.nextInt();
		System.out.print("Ingrese el segundo número: ");
		num2 = sc.nextInt();
		
		max = (num1>num2)?num1:num2;
		
		mcm = max;
		
		while((mcm%num1!=0)||(mcm%num2!=0)) {
			mcm++;
		}
		
		System.out.println("El mínimo común multiplo entre "+num1+" y "+num2+" es: "+mcm);
		
		sc.close();
	}

}
