package ejercicio89_Casting;

public class Empleado {

	private String nombre;
	private int edad;
	private double sueldo;
	private int id, inasistencias;
	private static int siguienteId = 1000;
	
	

	public Empleado(String nombre, int edad, double sueldo) {
		setNombre(nombre);
		setEdad(edad);
		setSueldo(sueldo);
		id = siguienteId;
		siguienteId++;
	}

	public String getNombre() {
		return nombre + " con id " +id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad >= 18 && edad <= 75) {
			this.edad = edad;
		} else {
			this.edad = 0;
		}

	}

	public double getSueldo() {
		return sueldo - (Math.round((sueldo/7*inasistencias * 0.5)*100)/100);
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void setInasistencias(int inasistencias) {
		if(inasistencias<=7) {
			this.inasistencias = inasistencias;			
		} else {
			this.inasistencias = 0;
		}
	}
	
	
}
