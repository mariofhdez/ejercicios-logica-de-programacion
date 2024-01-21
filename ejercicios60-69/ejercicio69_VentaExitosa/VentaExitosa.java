/*
 * crear un método con dos parámetros, el cual va a recibir dos datos: el total de una compra y el importe recibido. 
 * En base a eso, nos va a decir la situación de la compra. Si el importe recibido es igual al total de la compra, 
 * en pantalla aparecerá que la compra fue exitosa. Si el importe recibido es menor al total de la compra, 
 * aparecerá que la compra no fue exitosa, y nos pedirá que ingresemos otra cantidad. 
 * Si el importe recibido es mayor al total de la compra, 
 * entonces nos mostrará que de la compra se recibirá cambio.
 */

package ejercicio69_VentaExitosa;

import javax.swing.JOptionPane;

public class VentaExitosa {
	
	public static void main(String[]args) {
		int cantidad;
		double precioUnitario, valorTotal, valorPagado;
		String mensaje;
		
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto vendido"));
		precioUnitario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio unitario del producto"));
		
		valorTotal = calcularTotal(cantidad, precioUnitario);
		
		valorPagado = Double.parseDouble(JOptionPane.showInputDialog("El monto total de la venta es $"+ valorTotal
				+"\n Ingrese el valor pagado por el cliente"));
		
		mensaje = validarVenta(valorTotal, valorPagado);
		
		JOptionPane.showMessageDialog(null, mensaje);
		
	}

	private static String validarVenta(double valorTotal, double valorPagado) {
		String mensaje = null;
		
		if(valorTotal == valorPagado) {
			mensaje = "Compra realizada con éxito.";
		} else if(valorTotal<valorPagado) {
			mensaje = "Compra realizada con éxito."
					+ "\nSu cambio es $" + (valorPagado - valorTotal);
		} else {
			mensaje = "Pago errado."
					+ "\nPor favor efectuar el pago por el importe completo";
		}
		return mensaje;
	}

	private static double calcularTotal(int cantidad, double precioUnitario) {
		return cantidad * precioUnitario;
	}

}
