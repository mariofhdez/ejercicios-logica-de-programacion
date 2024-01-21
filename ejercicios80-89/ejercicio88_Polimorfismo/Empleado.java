package ejercicio88_Polimorfismo;

public class Empleado extends Persona {

	private int numEmpleado;
	private String areaEmpleado;
	private String cargoEmpleado;

	public Empleado(String nombre, int edad, char sexo, int numEmpleado, String areaEmpleado, String cargoEmpleado) {
		super(nombre, edad, sexo);
		this.numEmpleado = numEmpleado;
		this.areaEmpleado = areaEmpleado;
		this.cargoEmpleado = cargoEmpleado;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getAreaEmpleado() {
		return areaEmpleado;
	}

	public void setAreaEmpleado(String areaEmpleado) {
		this.areaEmpleado = areaEmpleado;
	}

	public String getCargoEmpleado() {
		return cargoEmpleado;
	}

	public void setCargoEmpleado(String cargoEmpleado) {
		this.cargoEmpleado = cargoEmpleado;
	}

	@Override
	public String toString() {
		String datos = super.toString();
		return datos + "\nEl numero de Empleado es " + numEmpleado + 
				"\nEl area del Empleado es " + areaEmpleado + 
				"\nEl cargo del Empleado es "+ cargoEmpleado;
	}
	
	@Override
	public void muestraMensaje() {
		super.muestraMensaje();
		System.out.println("Soy un empleado");
	}
	
}
