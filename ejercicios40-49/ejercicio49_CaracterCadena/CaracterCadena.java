/*
 * Primero se almacenan los caracteres de una palabra, en un array de tipo String. 
 * Posteriormente, con la ayuda del método random, de la clase Math, 
 * obtendremos números aleatorios, los cuales redondearemos con el método round de la clase Math, 
 * y haremos un casting a int, para almacenarlo en una variable, 
 * la cual nos permitirá mediante un ciclo for, ir accediendo a diferentes posiciones del arreglo.
 */

package ejercicio49_CaracterCadena;

import javax.swing.JOptionPane;

public class CaracterCadena {
	
	public static void main(String[]Args) {
		
		String cadena = JOptionPane.showInputDialog("Ingrese una cadena de texto");
		int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre 1 y "+cadena.length()));
		
		String[] parts = cadena.split("");
		
		JOptionPane.showMessageDialog(null, "La letra en la posición "+ pos +" es "+ parts[pos-1]);

	}
}
