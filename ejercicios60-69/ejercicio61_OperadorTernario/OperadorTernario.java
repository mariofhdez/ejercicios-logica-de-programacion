/*
 * Se hará un ejercicio sobre el operador ternario. 
 * Obtendremos el mayor de dos números, usando ese operador.
 */

package ejercicio61_OperadorTernario;

import javax.swing.JOptionPane;

public class OperadorTernario {
	
	public static void main(String[]args) {
		int num1, num2, mayor;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
		
		mayor = (num1>num2)?num1:num2;
		
		JOptionPane.showConfirmDialog(null, "El número mayor es "+mayor);
	}

}
