/*
 * Crea una clase médico considerando los siguientes atributos
 * de clase: nombre (String), apellidos (String), edad (int), 
 * estado civil (enum), especialista (boolean).
 * Define un constructor que reciba los argumentos necesarios
 * para la inicialización, y los métodos para establecer y obtener
 * los valores de los atributos.
 * Compila el código para comprobar que no presenta errores
 * Crea un objeto y comprueba que se inicializa correctamente
 * consultando el valor de los atributos después de creado el objeto.
 */

package ejercicio80_Medico;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		//crear medico
		
		System.out.print("Ingrese los nombres del médico: ");
		String nombres = sc.next();
		System.out.print("Ingrese los apellidos del médico: ");
		String apellidos = sc.next();
		System.out.print("Ingrese la edad del médico: ");
		int edad = sc.nextInt();
		System.out.print("¿Está casado? Si/No: ");
		boolean estaCasado = (sc.next().equals("Si"))?true:false;
		System.out.print("¿Es especialista) Si/No: ");
		boolean esEspecialista = (sc.next().equals("Si"))?true:false;
		
		Medico med1 = new Medico(nombres, apellidos, edad, estaCasado, esEspecialista);
		
		System.out.println("El médico "+med1.getNombres()+" "+med1.getApellidos()
			+"\nTiene "+med1.getEdad()+" años"
			+"\n"+((med1.isEsEspecialista())?"Es especialista":"No es especialista")
			+"\n"+((med1.getEstadoCivil()?"Está casado":"Está soltero")));
		
		sc.close();
	}

}
