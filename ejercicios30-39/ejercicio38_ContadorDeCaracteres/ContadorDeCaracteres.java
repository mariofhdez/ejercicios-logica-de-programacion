//En este ejercicio sabremos cuántas veces se repite un caracter(letra, punto, coma, etc) 
//dentro de una cadena de texto. Por ejemplo, si quiero saber cuántas veces se encuentra la letra 'a' 
//dentro de la cadena de texto "La pizza es deliciosa", nos arrojaría este mensaje: 
//"La letra 'a' se repite 3 veces". 
//Para eso haremos uso de un método que nos devuelve la posición en la que se encuentra un caracter, 
//y ese es el método charAt( ), el cual es un método sobrecargado. 
//Usando ese método, que pertenece a la clase String, y con el ciclo for, 
//iremos recorriendo la cadena de texto, para saber cuántas veces se encuentra cierto caracter, 
//también con la ayuda de un contador, que se incrementará cada vez que encuentre el elemento repetido.
package ejercicio38_ContadorDeCaracteres;

import javax.swing.JOptionPane;

public class ContadorDeCaracteres {
	
	public static void main(String[]args) {
		
		String texto = JOptionPane.showInputDialog("Ingrese una cadena de texto");
		char letra =  JOptionPane.showInputDialog("Ingrese una letra para verificar cuántas veces se repite").charAt(0);
		
		JOptionPane.showMessageDialog(null, "La letra " + letra + " se repite "+ contarCaracteres(texto, letra)+ " veces.");
		
	}
	
	public static int contarCaracteres(String texto, char letra) {
		int contador = 0;
		
		for(int i = 0; i<texto.length(); i++) {
			if(texto.charAt(i) == letra) {
				contador++;
			}
		}
		return contador;
	}

}
