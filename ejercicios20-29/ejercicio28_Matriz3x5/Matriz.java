//Ejercicio de Matriz no cuadrada con tipo de dato char.
package ejercicio28_Matriz3x5;

public class Matriz {
	
	public static void main (String[]Args) {
		
		char array[][] = new char[3][5];
		char letra = 'A';
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array.length; j++) {
				array[i][j] = letra;
				letra++;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("\n");
			for(int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
		}
		
	}

}
