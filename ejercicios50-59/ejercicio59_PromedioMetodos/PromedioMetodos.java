/*
 * Se nos pide un programa que mediante métodos realice algunas operaciones. 
 * Un método para llenar el arreglo, otro método para obtener el promedio, 
 * otro método para saber cuántos aprobaron y cuántos reprobaron, 
 * y un método para saber el porcentaje de aprobados.
 */
package ejercicio59_PromedioMetodos;

import java.util.Scanner;

public class PromedioMetodos {

	public static void main(String[] args) {
		Scanner sc;
		int cantEst, option;

		sc = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de estudiantes del cusro:");
		cantEst = sc.nextInt();
		double notas[] = new double[cantEst];
		rellenarArreglo(notas);
		porcentajeAprobados(notas);

		do {
			System.out.println("Seleccione el número de la acción que desea ejecutar:"
					+ "\n 1. Consultar las notas de los estudiantes."
					+ "\n 2. Consultar el promedio de los estudiantes."
					+ "\n 3. Consultar la cantidad de estudiantes aprobados."
					+ "\n 4. Consultar la cantidad de estudiantes reprobados."
					+ "\n 5. Consultar el porcentaje de aprobados." 
					+ "\n 0. Para Salir");
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Las notas de los estudiantes son: ");
				listarNotas(notas);
				System.out.println("Selecciones una opción: "
						+ "\n 1. Volver al menú anterior "
						+ "\n 0. Para salir");
				option = sc.nextInt();
				if(option==1) {
					break;					
				} else {
					break;
				}
			case 2:
				System.out.println("El promedio de los estudiantes es: " + promedio(notas));
				System.out.println("Selecciones una opción: "
						+ "\n 1. Volver al menú anterior "
						+ "\n 0. Para salir");
				option = sc.nextInt();
				if(option==1) {
					break;					
				} else {
					break;
				}
			case 3:
				System.out.println("La cantidad total de estudiantes aprobados es: "+ aprobados(notas));
				System.out.println("Selecciones una opción: "
						+ "\n 1. Volver al menú anterior "
						+ "\n 0. Para salir");
				option = sc.nextInt();
				if(option==1) {
					break;					
				} else {
					break;
				}
			case 4:
				System.out.println("La cantidad total de estudiantes reprobados es: "+ reprobados(notas));
				System.out.println("Selecciones una opción: "
						+ "\n 1. Volver al menú anterior "
						+ "\n 0. Para salir");
				option = sc.nextInt();
				if(option==1) {
					break;					
				} else {
					break;
				}
			case 5:
				System.out.println("El procentaje de estudiantes aprobados es: "+ porcentajeAprobados(notas)+"%");
				System.out.println("Selecciones una opción: "
						+ "\n 1. Volver al menú anterior "
						+ "\n 0. Para salir");
				option = sc.nextInt();
				if(option==1) {
					break;					
				} else {
					break;
				}
			}
		} while (option != 0);

		sc.close();

	}

	public static void rellenarArreglo(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = randomNumber(1, 10);
		}
	}

	public static void listarNotas(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static double randomNumber(int min, int max) {
		return (double) Math.round((Math.random() * (max - min + 1) + min) * 10) / 10;
	}

	public static double promedio(double[] arr) {
		double suma = 0;
		for (int i = 0; i < arr.length; i++) {
			suma = suma + arr[i];
		}
		return Math.round(suma / arr.length)*100/100;
	}
	
	public static int aprobados(double[] arr) {
		int aprobados = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>6) aprobados++;
		}
		return aprobados;
	}
	
	public static int reprobados(double[] arr) {
		int reprobados = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<6) reprobados++;
		}
		return reprobados;
	}
	
	public static double porcentajeAprobados (double[]arr) {
		double porcentaje = (double) aprobados(arr) / arr.length * 100;
		return Math.round(porcentaje)*100/100;	
	}
}
