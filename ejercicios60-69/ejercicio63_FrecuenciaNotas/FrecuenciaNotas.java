/*
 * En este programa tenemos un arreglo de calificaciones, y sabremos cuántas veces se repite cada calificación,
 * Las calificaciones irán del 0 al 5, habrá métodos para rellenar las notas, y saber su frecuencia.
 */

package ejercicio63_FrecuenciaNotas;

import java.util.Arrays;
import java.util.Scanner;

public class FrecuenciaNotas {

	public static void main(String[] args) {
		Scanner sc;
		int estudiantes;

		sc = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de estudiantes del curso:");
		estudiantes = sc.nextInt();
		int notas[] = new int[estudiantes];
		registrarNotas(notas);
		frecuenciaNota(notas);

		sc.close();
	}

	public static void registrarNotas(int[] notas) {
		for (int i = 0; i < notas.length; i++) {
			notas[i] = crearNota(0, 5);
			System.out.println(notas[i]);
		}
	}

	public static int crearNota(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}

	public static void frecuenciaNota(int[] notas) {
		Arrays.sort(notas);
		int cont = 0;
		int aux = notas[0];

		for (int i = 0; i < notas.length; i++) {
			if (aux == notas[i]) {
				cont++;
			} else {
				System.out.println("La nota " + aux + " se repite " + cont + " veces.");
				cont = 1;
				aux = notas[i];
			}
		}
		System.out.println("La nota " + aux + " se repite " + cont + " veces.");
	}

}
