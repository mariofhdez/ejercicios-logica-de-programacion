/*
 * Crearemos un array de 6 posiciones, y posteriormente el programa nos pedirá introducir un índice de arreglo, 
 * para mostrar en pantalla esa posición. Si ponemos una posición inválida, 
 * se generará una excepción ArrayIndexOutOfBoundsException. 
 * Algo que tenemos que tratar con los bloques try y catch.
 */

package ejercicio75_ExcepcionArrayIndex;

import javax.swing.JOptionPane;

public class ExcepcionArrayIndex {
	
	public static void main(String[]args) {
		String nombres[] = {"Mario","Alejandra","Hellen","Liliana","Mateo"};
		try {
			int pos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es la posición que deseas acceder?"));
			JOptionPane.showMessageDialog(null, "El nombre en la posición "+pos+" es: "+nombres[pos]);
		} catch(ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Posición del arreglo inválida.");
		}
	}

}
