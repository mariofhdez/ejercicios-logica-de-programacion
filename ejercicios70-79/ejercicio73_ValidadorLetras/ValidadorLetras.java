/*
 * creamos un programa que nos permite validar texto.
 * Este programa, a diferencia del anterior, no sólo nos permitirá ingresar por teclado sólo letras minúsculas,
 * sino también mayúsculas, rechazando todos los caracteres no sean letras. Para eso, nos basaremos en el código ASCII,
 * y usaremos algunos métodos de la clase String, como el método charAt, el método length, etc.
 */

package ejercicio73_ValidadorLetras;

import java.util.Scanner;

public class ValidadorLetras {

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
				if ((valorAscii > 0 && valorAscii < 65)
						|| (valorAscii > 90 && valorAscii < 97)
						|| valorAscii > 122)
					cont++;
			}

		} while (cont != 0);
		System.out.println("Ingresaste la palabra " + cadena);
		sc.close();
	}

}
