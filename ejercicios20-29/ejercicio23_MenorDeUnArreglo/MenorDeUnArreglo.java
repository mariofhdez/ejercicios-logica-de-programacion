//Crearemos un método estático que recibirá un array como parámetro, 
//que fue llenado con números aleatorios, y  al final nos devolverá cuál es el menor.
package ejercicio23_MenorDeUnArreglo;

import javax.swing.JOptionPane;

public class MenorDeUnArreglo {
	
	public static void main (String[]Args) {
		
		int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del arreglo"));
		int array[] = new int[cant];
		
		rellenarArreglo(array);
		
		JOptionPane.showMessageDialog(null, "El menor número del arreglo es " + numeroMenor(array));
		
	}
	
	public static void rellenarArreglo(int[]array) {
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random()*100);
			System.out.println(array[i]);
		}
		
	}
	
	public static int numeroMenor(int[]array) {
		
		int numeroMenor = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] < numeroMenor) numeroMenor = array[i];
		}
		
		return numeroMenor;
	}

}
