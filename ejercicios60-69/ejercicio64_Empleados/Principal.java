/*
 * Se creó una clase, y posteriormente, en el método main, se crean instancias de esa clase, 
 * que serán guardados dentro de un arreglo de n posiciones. 
 * Después se imprimirá la información de los atributos de ese objeto en la pantalla, 
 * usando el método toString( ), ya que este método muestra la representación en String de ese objeto.
 */

package ejercicio64_Empleados;

public class Principal {
	
	public static void main(String[]args) {
		
		Empleado empleados[] = {new Empleado ("Pepe",45,2000),
				new Empleado ("Ana",20,1000),
				new Empleado ("Maria",39,1800),
				new Empleado ("Kelly",18,800),
				new Empleado ("Juan",38,1900),
				new Empleado ("Alma",48,1000)
		};
		
		for(int i=0; i<empleados.length; i++) {
			System.out.println(empleados[i]);
		}
	}

}
