//Este ejercicio va a capturar 10 números ingresados por el usuario.
//Estos números van a ser clasificados en positivos, negativos y cero.
//Al final se muestra el promedio hallado para los positivos, negativos y la cantidad de ceros.
package ejercicio8_ClasificadorDeNumeros;

import java.util.Scanner;

public class ClasificadorDeNumeros {
	
	public static void main (String[]Args) {
		
		int contPositivo = 0, contNegativo = 0, contCeros = 0, sumPositivo = 0, sumNegativo = 0, num;
		double promPositivo=0, promNegativo=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número:");
		num = sc.nextInt();
		
		for(int i = 0; i < 10; i++) {
			if(num>0) {
				contPositivo++;
				sumPositivo = sumPositivo + num;
				promPositivo = sumPositivo/contPositivo;
			} else if(num<0) {
				contNegativo++;
				sumNegativo = sumNegativo + num;
				promNegativo = sumNegativo/contNegativo;
			} else {
				contCeros++;
			}
			System.out.println("Ingrese otro número:");
			num = sc.nextInt();
		}
		
		
		if(contPositivo == 0)System.out.println("No se pudo realizar el promedio de los números positivos.");
		else {
			System.out.println("Promedio de números positvos: " + promPositivo);			
		}
		if(contNegativo == 0)System.out.println("No se pudo realizar el promedio de los números negativos.");
		else {
			System.out.println("Promedio de números negativos: " + promNegativo);			
		}
		System.out.println("Conteo de ceros: " + contCeros);
		
	}

}
