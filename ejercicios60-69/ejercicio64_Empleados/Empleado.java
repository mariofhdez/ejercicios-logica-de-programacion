package ejercicio64_Empleados;

public class Empleado {
	
	private String nombre;
	private int edad;
	private double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo;
	}
	
	

}
