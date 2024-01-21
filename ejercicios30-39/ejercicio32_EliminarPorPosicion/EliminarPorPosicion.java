//En este ejercicio Primero llenaremos el arreglo con n números enteros deternminados por el usuario
//posteriormente el programa nos pedirá la posición del número que queremos borrar. 
//Al final se mostrará en pantalla el arreglo, pero ya sin el número que se borró.
package ejercicio32_EliminarPorPosicion;

import java.util.Scanner;

public class EliminarPorPosicion {
	
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		int pos;
		
		System.out.println("Ingrese la cantidad de elementos del arreglo:");
		int cant = sc.nextInt();
		int array[] = new int[cant];
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Introduzca un número en la posición " + (i+1));
			array[i] = sc.nextInt();
		}
		System.out.println("Arreglo inicial:");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("Introduzca la posición que desea eliminar del arreglo: ");
		pos = sc.nextInt();
		
		eliminarElemento(pos-1,array);
		
		System.out.println("Arreglo final: ");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	public static void eliminarElemento(int pos, int[]array) {
		
		for(int i = pos; i < array.length-1; i++) {
			array[i] = array[i+1];
		}
		array[array.length-1] = 0;
	}

}
