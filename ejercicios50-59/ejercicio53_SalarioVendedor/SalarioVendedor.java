/*
 * Una compañía de ventas de computadoras, paga a sus vendedores, un sueldo de $5000, 
 * más una comisión de $200 por cada computadora vendida, 
 * más el 5% del valor total de la venta. 
 * Se nos pide crear un programa que permita ingresar el nombre del vendedor, 
 * la cantidad de computadoras vendidas, y el valor total de la venta en el mes.
 * Calcule y muestre el salario total del vendedor.
 */
package ejercicio53_SalarioVendedor;

import javax.swing.JOptionPane;

public class SalarioVendedor {
	
	public static void main(String[]args) {
		
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del vendedor");
		int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de computadoras vendidas"));
		double precioUnitario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio unitario del producto"));
		
		double salarioTotal = ((cant * precioUnitario)*0.05)+(cant*200) + 5000;
		
		JOptionPane.showConfirmDialog(null, "El salario del empleado "+ nombre + " es de $ "+salarioTotal);
		
	}
	
}
