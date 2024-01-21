/*
 * Crear un programa que contenga la información del sueldo de un trabajador.
 * El sueldo se calculará en base a las horas laboradas.
 * Cada hora se pagará a 20 dólares. Cada hora extra se pagará al doble.
 * Por tanto el programa debe contar con dos constructores:
 * Uno que reciba el argumento cantidad de horas.
 * Otro que reciba la cantidad de horas laboradas y las horas extra.
 * Si en un día el trabajador sobrepasa las 48 horas semanales,
 * las siguientes serán horas extra y serán pagadas con el recargo.
 * No se debe sobrepasar las 36 horas extra semanales.
 */

package ejercicio82_SueldoEmpleado;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[]args) {
		SueldoEmpleado sueldo;
		
		int horasTotalesTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas laboradas por el empleado esta semana."));
		
		sueldo = new SueldoEmpleado(horasTotalesTrabajadas);
		
		JOptionPane.showMessageDialog(null,"El sueldo del empleado es: "+sueldo.getSueldo());
		
	}
	
	

}
