//En este ejercicio se está asignando un porcentaje de descuento según la cantidad comprada.
//Para compras superiores a 24 unidades el descuento es del 15%
//Para compras superiores a 12 unidades el descuento es del 10%
//Para compras superiores a 6 unidades el descuento es del 5%
//El usuario debe ingresar la cantidad comprada, el precio unitario.
//A partir de estos dos valores se hará el cálculo del subtotal, descuento y total.
package ejercicio4_DescuentoSegunCantidad;

import java.util.Scanner;

public class DescuentoSegunCantidad {
	
	public static void main (String[]Args) {
		
		int cantidad;
		double precioUnitario, subtotal, descuento, total;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de productos:");
		cantidad = sc.nextInt();
		System.out.println("Ingrese el precio unitario de venta:");
		precioUnitario = sc.nextDouble();
		
		subtotal = cantidad * precioUnitario;
		descuento = 0;
		
		if(cantidad>24) {
			descuento = subtotal * 0.15;
		} else if(cantidad>12) {
			descuento = subtotal * 0.10;
		} else if(cantidad>6) {
			descuento = subtotal * 0.05;
		}
		
		total = subtotal - descuento;
		System.out.println("Subtotal:  $ " + subtotal);
		System.out.println("Descuento: $ " + descuento);
		System.out.println("Total:     $ " + total);
		
	}

}
