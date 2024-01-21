/*
 * Al dividir un número entre cero, se generará la excepción ArithmeticException. 
 * Para eso la trataremos, usando los bloques try y catch.
 */

package ejercicio77_ExcepcionByZero;

import javax.swing.JOptionPane;

public class ExcepcionByZero {
	
	public static void main(String[]args) {
		int dividendo, divisor=0;
		double division;
		
		do {
			try {
				dividendo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dividendo: "));
				divisor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el divisor: "));
				division = dividendo / divisor;
				JOptionPane.showMessageDialog(null, "El resultado es :"+division);			
			} catch (ArithmeticException e) {
				division = 0;
				JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
			}
		} while(divisor == 0);
		JOptionPane.showMessageDialog(null, "Programa finalizado!!");
	}

}
