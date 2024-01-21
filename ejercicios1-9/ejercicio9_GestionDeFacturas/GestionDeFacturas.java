//Este ejercicio solicita al usuario solicita la información de 5 ventas
//Entre los datos que solicita está el código, cantidad, precio unitario del producto
//Se hará el cálculo del importe de cada venta para que sea mostrado por cada registro
//Al final se muestra la cantidad total vendida y el total general de todas las ventas
package ejercicio9_GestionDeFacturas;

import java.util.Scanner;

public class GestionDeFacturas {
	
	public static void main(String[]Args) {
		
		String codigo;
		double cantidad, precioUnitario, importeFactura, cantidadTotal = 0, totalFacturacion = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Ingrese la información de la venta n°" + i);
			System.out.println("Código del producto: ");
			codigo = sc.next();
			System.out.println("Ingrese la cantidad: ");
			cantidad = sc.nextDouble();
			System.out.println("Ingrese el precio unitario: ");
			precioUnitario = sc.nextDouble();
			
			importeFactura = cantidad * precioUnitario;
			System.out.println("Importe total de la factura n°"+i+" es: "+importeFactura);
			
			cantidadTotal = cantidadTotal + cantidad;
			totalFacturacion = totalFacturacion + importeFactura;
		}
		
		System.out.println("Detalles de la venta:");
		System.out.println("Cantidad total vendida: " + cantidadTotal);
		System.out.println("Facturación totla: " + totalFacturacion);
		
	}

}
