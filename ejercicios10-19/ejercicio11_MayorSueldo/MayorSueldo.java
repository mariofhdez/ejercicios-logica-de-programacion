//Este ejercicio pide al usuario que ingrese la cantidad de registros a ingresar
//Luego se va iterando el registro de los sueldos
package ejercicio11_MayorSueldo;

import javax.swing.JOptionPane;

public class MayorSueldo {
	
	public static void main(String[]Args) {
		
		int cantidadSueldos = 0;
		double sueldo = 0, sueldoMaximo = 0;
		
		cantidadSueldos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos sueldos desea registrar?"));
		
		for(int i = 1; i <= cantidadSueldos; i++) {
			sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo del empleado "+i));
			if(sueldo>sueldoMaximo) {
				 sueldoMaximo = sueldo;
			}
		}
		
		JOptionPane.showMessageDialog(null, "El sueldo más alto es " + sueldoMaximo);
		
	}

}
