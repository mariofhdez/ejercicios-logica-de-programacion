//El ejercicio solicita que se ingresen 5 números los cuáles se verifican si son múltiplos de 3
package ejercicio30_MultiplosDe3;

import javax.swing.JOptionPane;

public class MultiplosDeTres {
	
	public static void main(String[]Args) {
		
		int num;
		
		for(int i = 0; i < 5; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
			if(num%3 == 0) {
				JOptionPane.showMessageDialog(null, "El número ingresado es múltiplo de 3!!!");
			} else {
				JOptionPane.showMessageDialog(null, "No es multiplo de 3");
			}
		}
	}

}
