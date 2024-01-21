//En este ejercicio se pide la cantidad de elementos de un arreglo para luego ser rellenado,
//posteriormente se nos dirá si ese arreglo está ordenado de forma creciente o decreciente, 
//o si está ordenado, o si todos los números son iguales.
package ejercicio31_OrdenDeArreglo;

import javax.swing.JOptionPane;

public class OrdenDeUnArreglo {
	
	public static void main(String[]Args) {
		
		boolean ascendente = false, descendente = false;
		String mensaje = "";
		
		int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de datos a registrar"));
		
		int array[] = new int[cant];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrse un número en la posición "+ (i+1)));
		}
		
		for(int i = 0; i < array.length-1; i++) {
			if(array[i] > array[i + 1]) descendente = true;
			if(array[i] < array[i + 1]) ascendente = true;
		}
		
		if(ascendente && !descendente) mensaje = "Serie ascendente";
		else if (!ascendente && descendente) mensaje = "Serie descendente";
		else if (ascendente && descendente) mensaje = "Serie desordenada";
		else if (!ascendente && !descendente) mensaje = "Todos los números son iguales";
		
		JOptionPane.showMessageDialog(null, mensaje);
		
		
	}

}
