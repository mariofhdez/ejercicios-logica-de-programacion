package ejercicio91_InstanceOf;

public class Empleado {
	private String nombre;
	private int edad;
	private double sueldo;

	public Empleado(String nombre, int edad, double sueldo) {
		setNombre(nombre);
		setEdad(edad);
		setSueldo(sueldo);
	}
	
	public Empleado(String nombre, double sueldo) {
		setNombre(nombre);
		setSueldo(sueldo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad >= 25 && edad <= 80) {
			this.edad = edad;
		} else {
			this.edad = 0;
		}
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		if (sueldo >= 2500 && sueldo <= 10000) {
			this.sueldo = sueldo;
		} else {
			this.sueldo = 0;
		}
	}

	public String datosEmpleado() {
		return "El nombre es: " + nombre + ", la edad es: " + edad + " años, el sueldo es: $" + sueldo;
	}

}
