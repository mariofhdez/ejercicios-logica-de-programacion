//Este ejercicio nos pide capturar las edades de los alumnos. 
//Si la edad de los alumnos está entre 8 y 13 años, y además, 
//el alumno tiene uno o más hermanos estudiando en la misma escuela, 
//recibirá en la inscripción un 50% de descuento.
//Si la edad está fuera de rango, automáticamente se descartará el descuento, 
//teniendo que pagarse la totalidad de la inscripción. O si cumple la edad, 
//pero no tiene hermanos, igual, tendrá que pagar el 100% de la inscripción.
package ejercicio37_DescuentoEstudiantil;

import java.util.Scanner;

public class DescuentoEstudiantil {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de estudiantes a registrar.");
		int cant = sc.nextInt();
		int edadEstudiantes[] = new int[cant];
		int tieneHermanos[] = new int[cant];
		double valorInscripcion[] = new double[cant];
		boolean descuento = false;
		double inscripcion = 1250;
		
		for(int i = 0; i < edadEstudiantes.length; i++) {
			System.out.println("Ingrese la edad del estudiante");
			edadEstudiantes[i] = sc.nextInt();
			System.out.println("Ingrese la cantidad de hermanos inscritos en la institución");
			tieneHermanos[i] = sc.nextInt();
		}
		
		for(int i = 0; i < edadEstudiantes.length; i++) {
			if(edadEstudiantes[i] < 13 && edadEstudiantes[i] > 8) {
				if(tieneHermanos[i] != 0) {
					descuento = true;
					valorInscripcion[i] = inscripcion * 0.5;
				} else {
					valorInscripcion[i] = inscripcion;
				}
			} else {
				valorInscripcion[i] = inscripcion;
			}
		}
		
		System.out.println("Inscripciones:");
		for(int i = 0; i < valorInscripcion.length; i++) {
			if(valorInscripcion[i]<inscripcion) {
				System.out.println("El estudiante no. "+ (i+1)+ " tiene el 50% de descuento.");
			} else {
				System.out.println("El estudiante no. "+ (i+1)+ " no tiene ningún descuento.");
			}
			System.out.println("Y pagará: "+valorInscripcion[i]);
		}
	}

}
