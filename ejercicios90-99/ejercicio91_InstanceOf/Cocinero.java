package ejercicio91_InstanceOf;

public class Cocinero extends Empleado{
	
	private String area;
	
	

	public Cocinero(String nombre, int edad, double sueldo, String area) {
		super(nombre, edad, sueldo);
		this.area = area;
	}

	public Cocinero(String nombre, int edad, double sueldo) {
		super(nombre, edad, sueldo);
	}

	public void metodoCocinero() {
		System.out.println("Soy un cocinero.");
	}

	@Override
	public String datosEmpleado() {
		return super.datosEmpleado()+ ", del área: " + area;
	}
	
	
}
