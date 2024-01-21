/*
 * Crear un programa que determine el sueldo semanal que recibirá un empleado, 
 * en concepto de horas extras trabajadas.
 * Si las horas semanales trabajadas exceden de 48, el resto se considerarán horas extras, 
 * y éstas se pagarán al doble de la hora normal, siendo el pago por hora normal, a $40.
 * Si las horas extras exceden de 8, las primeras 8 se pagarán al doble, y el resto al triple.
 */


package ejercicio54_HorasExtra;

import javax.swing.JOptionPane;

public class SalarioExtra {
	
	public static void main (String[]args) {
		
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas laboradas"));
		
		JOptionPane.showMessageDialog(null,"El empleado "+ nombre +" obtuvo un pago por $" + pagoSalario(horas));
		
	}
	
	public static double pagoSalario(int cant) {
		double salario = 0;
		
		if(cant > 48) {
			salario = 48 *40;
			int cantidad = cant - 48;
			if(cantidad > 8) {
				salario = salario + 8 * 40 *2;
				salario = salario + ((cantidad-8)*40*3);
			} else if(cantidad > 0) {
				salario = salario + cantidad * 40 * 2;
			}
		} else {
			salario = cant * 40;
		}
		
		return salario;
	}

}
