//En este ejercicio se propone al usuario adivinar un número aleatorio del 1 al 10 en 3 oportunidades.
package ejercicio22_JuegoNumeroAleatorio;

import javax.swing.JOptionPane;

public class NumeroAleatorio {
	
	public static void main(String[]Args) {
		
		int numero, conteo, intento;
		
		numero = numeroAleatorio();
		conteo = 3;
		
		while(conteo > 0) {
			intento = Integer.parseInt(JOptionPane.showInputDialog("Adivina el número del 1 al 10"));
			if(intento == numero) {
				JOptionPane.showMessageDialog(null, "Felicitaciones has acertado!!!");
				conteo = 0;
			} else {
				JOptionPane.showMessageDialog(null, "Sigue intentando");
			}
		}
		
		
	}
	
	public static int numeroAleatorio() {
		return (int) Math.round(Math.random()*10);
	}

}
