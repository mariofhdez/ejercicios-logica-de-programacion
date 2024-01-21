//En este ejercicio se le pide al usuario que ingrese la nota de los estudiantes
//Se valida cada nota registrada y se clasifica entre excelente, aprobados y reprobados
//Al final se muestra el total por cada uno
package ejercicio10_NotasEstudiantes;

import java.util.Scanner;

public class NotasDeEstudiantes {
	
	public static void main(String[]Args) {
		
		int contAprobados = 0, contReprobados = 0, contExcelente = 0;
		float calificacion;
		int estudiante = 1;
		Scanner sc = new Scanner(System.in);
		
		while(estudiante <= 6) {
			System.out.println("Ingrese la nota del esdiante n°" + estudiante);
			calificacion = sc.nextFloat();
			
			if(calificacion>9) {
				contExcelente++;
			} else if(calificacion > 6) {
				contAprobados++;
			} else {
				contReprobados++;
			}
			estudiante++;
		}
		
		System.out.println("La cantidad de alumnos con notas excelentes es: " + contExcelente);
		System.out.println("La cantidad de alumnos con notas aprobadas es: " + contAprobados);
		System.out.println("La cantidad de alumnos con notas reprobados es: " + contReprobados);
	}

}
