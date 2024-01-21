package ejercicio88_Polimorfismo;

public class Alumno extends Persona {

	private int idAlumno;
	private double promedio;

	public Alumno(String nombre, int edad, char sexo, int idAlumno, double promedio) {
		super(nombre, edad, sexo);
		this.idAlumno = idAlumno;
		this.promedio = promedio;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	@Override
	public void muestraMensaje() {
		System.out.println("Soy un alumno");
	}

	@Override
	public String toString() {
		String datos = super.toString();
		return datos + "\nEl id del Alumno es " + idAlumno + 
				"\nEl promedio es " + promedio;
	}
	
	

}
