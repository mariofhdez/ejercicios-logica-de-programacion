/*
 * Vamos a utilizar al método random de la clase Math, 
 * para obtener números aleatorios, de diferentes rangos, 
 * valores de 0 a 1, excluyendo el 1; valores de 0 a 7, 
 * excluyendo el 6, valores del 1 al 11, excluyendo el 11, etc.
 */
package Ejercicio46_NumerosAleatorios;

import javax.swing.JOptionPane;

public class NumerosAleatorios {
	
	public static void main (String[]Args) {
		NumerosAleatorios rNumber = new NumerosAleatorios();
		
		int min = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor mínimo"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor máximo"));
		
		for(int i = 0; i<50; i++) {
			System.out.println(rNumber.randomNumber(min, max));
		}
		
	}

	public int randomNumber(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
}
