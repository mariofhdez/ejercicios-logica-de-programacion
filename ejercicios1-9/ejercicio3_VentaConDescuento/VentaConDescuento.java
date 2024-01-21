//Ejercicio de descuento básico: se le pide al usuario el subtotal de la venta, y 
//el porcentaje de descuento, a partir de allí se realiza el cálculo del total a pagar
package ejercicio3_VentaConDescuento;

import java.util.Scanner;

public class VentaConDescuento {
	
	public static void main (String[]Args) {
		
		double subtotalVenta, descuento, totalVenta;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el subtotal de la venta:");
		subtotalVenta = sc.nextDouble();
		System.out.println("Ingresa el porcentaje de descuento (entre 1 y 100):");
		descuento = sc.nextDouble();
		
		descuento = descuento/100;
		totalVenta = subtotalVenta -(subtotalVenta * descuento);
		System.out.println("El valor total a pagar es: " + totalVenta);
	}

}
