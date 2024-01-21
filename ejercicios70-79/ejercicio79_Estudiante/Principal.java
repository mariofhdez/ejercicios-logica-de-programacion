/*
 * Se creará una clase llamada Estudiante, que contendrá los siguientes atributos: 
 * nombre(String), edad(int), y aprobado(boolean).
 * Estos atributos estarán como private, por lo tanto usaremos los métodos 
 * setters  para asignarle valores, y getters, para mostrar la información.
 */

package ejercicio79_Estudiante;

public class Principal {
	
	public static void main(String[]args) {
		
		Estudiante estudiantes[] = {new Estudiante("Mario",9,true),new Estudiante("Juan",6,false),
				new Estudiante("Luisa",8,false),new Estudiante("Leticia",8,true),new Estudiante("Felipe",10,true)};
		
		for(int i = 0; i<estudiantes.length; i++) {
			System.out.println("El estudiante "+estudiantes[i].getNombre()
					+" ha "+((estudiantes[i].isAprobado()?"aprobado":"reprobado")+" el curso."));
		}
		
	}

}
