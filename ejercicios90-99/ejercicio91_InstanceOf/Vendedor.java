package ejercicio91_InstanceOf;

public class Vendedor extends Empleado{
	
	private double comision;

	public Vendedor(String nombre, int edad, double sueldo, double comision) {
		super(nombre, edad, sueldo);
		this.comision = comision;
	}
	
	public void metodoVendedor() {
		System.out.println("Soy un vendedor");
	}
	
	public String datosEmpleado() {
		return super.datosEmpleado() + ", con comisión: $" +comision;
		
	}

}
