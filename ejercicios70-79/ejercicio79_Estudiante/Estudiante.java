package ejercicio79_Estudiante;

public class Estudiante {
	
	private String nombre;
	private int edad;
	private boolean aprobado;
	
	public Estudiante(String nombre, int edad, boolean aprobado) {
		this.nombre = nombre;
		this.edad = edad;
		this.aprobado = aprobado;
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
		if(edad >= 6 && edad <=12) {
			this.edad = edad;			
		} else {
			this.edad = 0;
		}
		
	}
	public boolean isAprobado() {
		return aprobado;
	}
	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}
	
	

}
