/* 
 * El programa pedirá ingresar el nombre del producto, el precio, y la cantidad vendida. 
 * Si la cantidad de productos vendidos son de 20 hacia arriba, se aplicará un 15% de descuento, 
 * y aparecerá en pantalla el total a pagar, con el descuento aplicado, y además, 
 * mostrará un mensaje sobre el descuento que se le acaba de dar. 
 * Si se vendieron menos de 20 piezas, no se aplicará el descuento.
 */

package ejercicio47_TotalAPagar;

import javax.swing.JOptionPane;

public class TotalAPagar {
	
	public static void main(String[]Args) {
		
		int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos"));
		double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio unitario del producto"));
		
		JOptionPane.showMessageDialog(null, "El valor total a pagar es: $ "+ total(cant, precio));
		
	}
	
	public static double total(int cant, double precio) {
		double desc = descuento(cant);
		double precioVenta = precio * (1 - desc);
		
		double total = cant * precioVenta;
		return total;
	}
	
	public static double descuento(int cant) {
		double desc = 0;
		
		if(cant > 20) desc = 0.15;
		
		return desc;
	}

}
