package ejercicio90_UpDownCasting;

public class Animal {

	private String nombre;
	private double peso;
	private double estatura;
	
	

	public Animal(String nombre, double peso, double estatura) {
		setNombre(nombre);
		setPeso(peso);
		setEstatura(estatura);
	}
	
	public void mensaje() {
		System.out.println("Soy un animal");
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public double getEstatura() {
		return estatura;
	}

}
