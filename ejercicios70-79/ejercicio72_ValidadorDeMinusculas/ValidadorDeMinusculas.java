/*
 * Este es un programa en Java, el cual te solicita ingresar una palabra que contenga sólo letras de la 'a' a la 'z'. 
 * Si ingresas un caracter especial, como arroba, punto, coma, asterisco, símbolo de gato, etc.,
 *  ese texto será rechazado, y se te pedirá ingresar una nueva palabra, ya que se validará que sólo ingreses caracteres válidos.
 *  Usaremos dos métodos de la clase String; el método charAt, que extraerá caracter por caracter de nuestra cadena de texto;
 *  y el método length. Vamos a usar ciclos for anidados, para este ejercicio.
 */

package ejercicio72_ValidadorDeMinusculas;

import java.util.Scanner;

public class ValidadorDeMinusculas {

	public static void main(String[] args) {
		String cadena = "";
		int valorAscii = 0, cont = 0;
		Scanner sc = new Scanner(System.in);

		do {
			cont = 0;
			System.out.println("Ingresa una palabra");
			cadena = sc.next();

			for (int i = 0; i < cadena.length(); i++) {
				char caracter = cadena.charAt(i);
				valorAscii = (int) caracter;
				if (valorAscii < 97 || valorAscii > 122)
					cont++;
			}

		} while (cont != 0);
		System.out.println("Ingresaste la palabra " + cadena);
		sc.close();
	}

}
