//Este ejericio pregunta al usuario dos números, los compara y valida cuál de ellos es mayor
//o si son iguales.
package ejercicio33_NumeroMayor;

import javax.swing.JOptionPane;

public class NumeroMayor {
	
	public static void main(String[]args) {
		
		int a, b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
		
		JOptionPane.showMessageDialog(null, maximo(a,b));
	}

	private static String maximo(int a, int b) {
		
		String mensaje;
		
		if(a != b) {
			if(a>b) mensaje = "El número mayor es "+a;
			else mensaje = "El número mayor es "+b;			
		} else {
			mensaje = "Ambos numeros son iguales";
		}
		
		
		return mensaje;
	}

}
