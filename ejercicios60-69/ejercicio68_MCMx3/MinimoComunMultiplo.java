/*
 *  obtener el mínimo común múltiplo de 3 números, en Java.
 */

package ejercicio68_MCMx3;

import java.util.Scanner;

public class MinimoComunMultiplo {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, max, mcm;
		
		System.out.print("Ingrese el primer número: ");
		num1 = sc.nextInt();
		System.out.print("Ingrese el segundo número: ");
		num2 = sc.nextInt();
		System.out.print("Ingrese el tercer número: ");
		num3 = sc.nextInt();
		
		max = (num1>num2&&num1>num3)?num1:(num2>num3)?num2:num3;
		
		mcm = max;
		
		while((mcm%num1!=0)||(mcm%num2!=0)||(mcm%num3!=0)) {
			mcm++;
		}
		
		System.out.println("El mínimo común multiplo entre "+num1+", "+num2+" y "+num3+" es: "+mcm);
		
		sc.close();
	}

}
