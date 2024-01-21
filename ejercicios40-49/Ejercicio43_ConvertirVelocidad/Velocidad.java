/*
 * El programa en Java nos pedirá capturar una velocidad en Km/h, 
 * y posteriormente nos arrojará como resultado, esa velocidad 
 * convertida a metros sobre segundo.
 */
package Ejercicio43_ConvertirVelocidad;

import javax.swing.JOptionPane;

public class Velocidad {

	public static void main(String[]args) {
		
		double v = Double.parseDouble(JOptionPane.showInputDialog("Introduce la velocidad en KM/h"));
		double conversion = v * 1000 / 3600;
		JOptionPane.showMessageDialog(null, "La velocidad es: " +conversion+ " m/s");
	}
}
