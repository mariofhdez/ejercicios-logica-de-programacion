package ejercicio88_Polimorfismo;

public class Persona {
	
	private String nombre;
	private int edad;
	private char sexo;
	
	
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public void muestraMensaje() {
		System.out.println("Soy una persona");
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
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "El nombre es " + nombre + 
				"\nLa edad es " + edad + 
				"\nEl sexo es " + sexo;
	}

	
	
	
	

}
