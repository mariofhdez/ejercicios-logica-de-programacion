package ejercicio80_Medico;

public class Medico {
	
	private String nombres;
	private String apellidos;
	private int edad;
	private boolean estadoCivil;
	private boolean esEspecialista;
	
	public Medico(String nombres, String apellidos, int edad, boolean estadoCivil, boolean esEspecialista) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.estadoCivil = estadoCivil;
		this.esEspecialista = esEspecialista;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public boolean getEstadoCivil() {
		return estadoCivil;
	}

	public boolean isEsEspecialista() {
		return esEspecialista;
	}
	
	
	

}
