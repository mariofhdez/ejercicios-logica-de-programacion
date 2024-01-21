/*
 * Desarrolla un programa que tenga las siguientes funcionalidades:
 * -> Mediante una interfaz gráfica, solicitaremos al usuario su nombre y su fecha de nacimiento
 * -> Al hacer click en el botón "Calcular", el programa debe mostrar una ventana emergente
 * 		que tendra un texto que indique "Hola, te llamas XX y tienes XX años"
 */
package Ejercicio41_CalcularEdad;

import java.util.Date;

import javax.swing.JOptionPane;

public class Edad {
	
	public static void main(String[]args) {
		String name;
		int birthday;
		
		name = JOptionPane.showInputDialog("Ingresa tu nombre");
		birthday = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento"));
		
		Edad age = new Edad();
		
		System.out.println(name);
		System.out.println(age.calcularEdad(birthday));
	}
	
	public int calcularEdad(int birthday) {
		Date date = new Date();
		return date.getYear() - (birthday-1900);
	}
}
