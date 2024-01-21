/*
 * En este programa creamos dos métodos, un método para validar las calificaciones, 
 * el cual nos devolverá un dato de tipo boolean, 
 * indicándonos si esa calificación ingresada es válido o no, o sea, 
 * si se encuentra dentro del rango establecido, de 5 a 10. 
 * El otro método nos calculará el promedio, y lo devolverá, 
 * por lo que será un método que nos retorne un dato de tipo double.
 */

package ejercicio62_ValidacionNotas;

import java.util.Scanner;

public class ValidacionNotas {
	
	public static void main(String[]args) {
		
		Scanner sc;
		int cantNotas;
		double nota;
		
		sc = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de notas del curso:");
		cantNotas = sc.nextInt();
		
		double notas[] = new double[cantNotas];
		
		for(int i=0; i<notas.length; i++) {
			System.out.print("Ingrese la nota no. "+(i+1)+": ");;
			nota = sc.nextDouble();
			if(validarNota(nota)) {
				notas[i]=nota;
			} else {
				System.out.println("Ingrese una nota válida entre 1 y 10");
				i--;
			}
		}
		
		System.out.println("El promedio de notas del estudiante es: "+promedio(notas));
		
		sc.close();
	}
	
	private static double promedio(double[] notas) {
		double suma = 0;
		for(int i=0; i<notas.length; i++) {
			suma = suma + notas[i];
		}
		return suma / notas.length;
	}

	public static boolean validarNota(double nota) {
		return (nota>=1&&nota<=10)?true:false;
	}

}
