/*
 * Crear una clase que nos de información de una venta.
 * Contendrá tres atributos: precio (double), cantidad (int) y descuento (int).
 * El constructor recibirá como argumentos: precio, cantidad y descuento por venta.
 * Cada instancia del objeto significará una venta nueva.
 * Si el cliente compró más de 24 unidades y menos de 100 productos obtendrá el 10% de descuento.
 * Si compró 100 productos o más obtendrá el 20% de descuento.
 * Si compró 200 productos o más tendrá un 25% de descuento.
 * Crear un método que nos devolverá el valor total de la venta, con el descuento según
 * La cantidad de piezas vendidas.
 */


package ejercicio81_InfoVentas;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[]args) {
		int cantidad;
		double precio;
		
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos vendidos"));
		precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto por unidad"));
		
		InfoVentas venta1 = new InfoVentas(cantidad, precio);
		
		System.out.println("La cantidad vendida es: "+venta1.getCantidad()
				+"\nEl precio unitario del producto es: $"+venta1.getPrecioUnitario()
				+"\nEl descuento de la venta es: "+venta1.getDescuento()+"%"
				+"\nEl valor total de la venta es: $"+venta1.getValorTotal());
	}

}
