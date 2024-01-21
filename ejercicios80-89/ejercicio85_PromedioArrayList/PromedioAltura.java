/*
 * Se crea un programa que inserte n alturas de alumnos en un ArrayList.
 * Se usarán  diferentes métodos para realizar determinadas acciones.
 * Un método que nos lea las alturas por teclado, y las almacene en el ArrayList.
 * Otro método que nos calcule la media de esas alturas del ArrayList, y nos devuelve esa media.
 * Otro método que nos devuelva en pantalla las alturas.
 * Al final el programa nos dirá cualés alturas son superior a la media,
 * Y cuáles son inferior.
 */

package ejercicio85_PromedioArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class PromedioAltura {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int cantAlumnos() {
		int cant;
		do {
			System.out.print("Introduce la cantidad de alumnos a registrar: ");
			cant = sc.nextInt();
		} while(cant < 1);
		return cant;
	}
	
	public static void leerAlturas(ArrayList<Double> arr, int n) {
		double altura;
		for(int i = 1; i <= n; i++) {
			do {
				System.out.print("Alumno "+i+" altura: ");
				altura = sc.nextDouble();
			} while (altura<=0);
			arr.add(altura);
		}
	}

	public static double calcularMedia(ArrayList<Double> arr) {
		double media = 0;
		for(Double dato:arr) {
			media = media + dato;
		}
		return media / arr.size();
	}

	public static void mostrarResultados(ArrayList<Double> arr, double media) {
		int superior = 0, inferior = 0;
		System.out.println("Alturas registradas: ");
		System.out.println(arr);
		for(Double dato:arr) {
			if(dato>media) {
				superior++;
			} else if(dato<media) {
				inferior++;
			}
		}
		System.out.printf("Media: %.2f %n", media);
		System.out.println("Hay "+superior+" más altos que la media");
		System.out.println("Hay "+inferior+" más bajos que la media");
		
	}

}
