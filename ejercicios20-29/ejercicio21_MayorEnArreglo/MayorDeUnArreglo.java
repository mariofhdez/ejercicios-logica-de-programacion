//En este ejercicio pediremos al usuario que determine la longitud de un arreglo.
//A partir de este valor crearemos un arreglo de n posiciones, 
//que contendrá valores entre 1 y 100, aleatoriamente, 
//para eso se usará el método random y round, de la clase Math. 
//Posteriormente, ese arreglo será pasado al método, 
//y ese método al final nos devolverá cuál es el mayor del arreglo.
package ejercicio21_MayorEnArreglo;

import javax.swing.JOptionPane;

public class MayorDeUnArreglo {
	
	public static void main(String[]Args) {
		
		int cant = 0;
		
		cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números que contiene el arreglo"));

		int array[] = new int[cant];
		
		
		for(int i = 0; i < array.length; i++) {
			array[i] = rellenarArreglo();
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		
		JOptionPane.showMessageDialog(null, numeroMayor(array));
		
	}
	
	public static int numeroMayor(int[]array) {
		
		int max = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static int rellenarArreglo() {
		
		return (int) Math.round(Math.random()*100);
	}

}
