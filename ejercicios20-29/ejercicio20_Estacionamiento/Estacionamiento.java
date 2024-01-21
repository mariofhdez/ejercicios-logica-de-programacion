////Programa que calcule el costo del estacionamiento en un parking. 
//Las primeras 3 horas se cobrarán a 20 pesos. 
//Las siguientes después de las 3 horas, a 15 pesos. 
//Hasta llegar al tope de 250 pesos, para 24 horas.
//Si se permanece aparcado por más de un día, se cobrarán 250 pesos por día. 
//Y 15 pesos las horas siguientes. Se le pedirá al usuario ingresar la cantidad de horas, 
//y debe obtener el precio.
package ejercicio20_Estacionamiento;

import javax.swing.JOptionPane;

public class Estacionamiento {
	
	public static void main (String[]Args) {
		
		int horas;
		
		horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas: "));
		
		JOptionPane.showMessageDialog(null, "El pago total es: " + calcularPago(horas));
		
	}
	
	public static double calcularPago(int horas) {
		
		double dias, primeras, totalPago, horasExcedidas;
		if(horas > 24) {
			horasExcedidas = horas%24 * 15;
			dias = ((horas - horas%24)/24) * 250;
			totalPago = dias + horasExcedidas;
		} else if(horas > 3){
			horasExcedidas = (horas - 3)*15;
			totalPago = 3 * 20 + horasExcedidas;
		} else {
			totalPago = horas * 20;
		}
		
		return totalPago;
	}

}
