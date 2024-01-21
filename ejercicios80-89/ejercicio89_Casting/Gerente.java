package ejercicio89_Casting;

public class Gerente extends Empleado{
	
	private double bonificacion;

	public Gerente(String nombre, int edad, double sueldo) {
		super(nombre, edad, sueldo);
	}

	public double getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(double bonificacion) {
		if(bonificacion<=1000) {
			this.bonificacion = bonificacion;
		} else {
			this.bonificacion = 0;
		}
	}
	
	public double getSueldo() {
		return super.getSueldo()+ bonificacion;
	}

}
