package ejercicio19_VentaConDescuentoMetodo;

//El programa nos pedirá el número de piezas, y el precio por pieza. 
//Si se compraron 24 o más piezas, se aplicará un descuento del 15%. 
//Crearemos un método que nos diga cuánto será el total a pagar.

import javax.swing.JOptionPane;

public class VentaConDescuento {
	
	public static void main (String[]Args) {
		
		int cantidad;
		double precioUnitario;
		
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad vendida: "));
		precioUnitario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio unitario: "));
		
		JOptionPane.showMessageDialog(null, "El pago total es: " + calcularPago(cantidad, precioUnitario));
		
	}
	
	public static double calcularPago(int cantidad, double precioUnitario) {
		
		double subtotal, descuento, pagoTotal;
		
		subtotal = cantidad * precioUnitario;
		
		if(cantidad > 24) {
			descuento = subtotal * 0.15;
		} else {
			descuento = 0;
		}
		pagoTotal = subtotal - descuento;
		
		return pagoTotal;
	}

}
