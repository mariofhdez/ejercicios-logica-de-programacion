package ejercicio82_SueldoEmpleado;

public class SueldoEmpleado {
	
	private final int sueldoPorHora = 20;
	private int horasTrabajadas, horasExtra;
	
	public SueldoEmpleado(int ht) {
		horasTrabajadas = ht;
	}
	
	public SueldoEmpleado(int ht, int he) {
		horasTrabajadas = ht;
		horasExtra = he;
	}

	public int getSueldo() {
		int ht = horasTrabajadas;
		int he = horasExtra;
		
		if(horasTrabajadas>48 && horasTrabajadas <= 84) {
			ht = 48;
			he = horasTrabajadas - ht;
		} else if (horasTrabajadas<=48) {
			ht = horasTrabajadas;
			he = 0;
		}
		
		int sueldo = ht * sueldoPorHora + he * sueldoPorHora * 2;
		return sueldo;
	}
	
}
