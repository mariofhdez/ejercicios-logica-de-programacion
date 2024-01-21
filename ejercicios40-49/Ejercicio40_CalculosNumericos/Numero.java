/* Desarrolla un programa que tenga las siguientes funcionalidades:
 * Debe solicitar el usuario cuántos valores numéricos desea introducir
 * A continuación, debe ir solicitando por pantalla cada uno de esos valores
 * Para ese conjunto de valores debe realizar los siguientes cálculos y deben codificarse mediante funciones
 * 
 * -> Sumatoria
 * -> Media aritmética
 * -> Valor máximo
 * -> Valor mínimo
 * 
 * Debe mostrar por pantalla los cálculos realizados
 */
package Ejercicio40_CalculosNumericos;


import java.util.Scanner;

public class Numero {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la cantidad de números:");
		int cantidad = sc.nextInt();
		int numeros[] = new int[cantidad];
		System.out.println("Introduce los números del arreglo:");
		for(int i = 0; i < cantidad; i++) {
			numeros[i] = sc.nextInt();
		}
		
		Numero n = new Numero();
		
		int suma = n.sumatoria(numeros);
		double media = n.media(suma, numeros);
		
		System.out.println("La suma es " +suma);
		System.out.println("El promedio es " +media);
		System.out.println("El número máximo es " +n.maximo(numeros));
		System.out.println("El número mínimo es " +n.minimo(numeros));
	
		
		
	}
	
	public int sumatoria (int arr[]) {
		int suma = 0;
		for(int i = 0; i<arr.length; i++) {
			suma+=arr[i];
		}
		return suma;
	}
	
	public double media (int sum, int arr[]) {		
		return sum / arr.length;
	}
	
	public int maximo (int arr[]) {
		int maximo = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]>maximo) maximo = arr[i];
		}
		return maximo;
	}
	
	public int minimo (int arr[]) {
		int minimo = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]<minimo) minimo = arr[i];
		}
		return minimo;
	}

}
