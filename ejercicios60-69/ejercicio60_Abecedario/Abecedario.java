/*
 * En el ejercicio se imprimirá en pantalla todos los caracteres del abecedario, 
 * desde la letra 'a' hasta la letra 'z'; también vamos a mostrar su correspondiente código ascii, 
 * y vamos a imprimir esos caracteres en orden inverso, de la letra 'z' a la letra 'a'.
 */

package ejercicio60_Abecedario;

public class Abecedario {
	
	public static void main(String[]args) {
		for(char car = 'z'; car>='a'; car--) {
			System.out.println("El caracter "+ (int)car+" es: "+car);
		}
	}

}
