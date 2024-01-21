/*
 * Se pedirá el índice de un arreglo, y si pongo un índice inválido, 
 * se me volverá a pedir que lo inserte de nuevo. 
 * Se utilizará un do while para esto.
 */

package ejercicio76_BucleExcepcion;

import javax.swing.JOptionPane;

public class BucleExcepcion {
	
	public static void main(String[]args) {
		String nombres[] = {"Mario","Alejandra","Hellen","Liliana","Mateo","Andres"};
		int pos = 0;
		
		do {
			try {
				pos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es la posición que deseas acceder?"));
				JOptionPane.showMessageDialog(null, "El nombre en la posición "+pos+" es: "+nombres[pos]);
			} catch(ArrayIndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Posición del arreglo inválida.");
				if(pos<0)JOptionPane.showMessageDialog(null, "Introduciste un índice negativo, solo se aceptan valores positivos.");
			}
		} while(pos > nombres.length || pos < 0);
		JOptionPane.showMessageDialog(null, "Programa finalizado. Adios!");
	}

}
