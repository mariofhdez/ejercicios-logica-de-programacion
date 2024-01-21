package ejercicio89_Casting;

public class Auxiliar extends Empleado{
	
	private double horasExtra;

	public Auxiliar(String nombre, int edad, double sueldo) {
		super(nombre, edad, sueldo);
	}

	public double getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(double horasExtra) {
		if(horasExtra>0 && horasExtra <= 20) {
			this.horasExtra = horasExtra;			
		} else {
			this.horasExtra = 0;
		}
	}
	
	public double getSueldo() {
		return super.getSueldo() + (horasExtra * 20);
		
	}

}
