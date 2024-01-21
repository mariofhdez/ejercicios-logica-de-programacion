/*
 * En este ejercicio explicaré cómo por medio del Teorema de Pitágoras, 
 * obtener el valor de la Hipotenusa. Al ejecutar el programa, 
 * nos pedirá el valor de los dos catetos, y al final nos mostrará en pantalla 
 * el valor d ela Hipotenusa de ese triángulo rectángulo. 
 * Para eso, se usará a dos métodos de la clase Math; el método sqrt, 
 * que nos devuelve un valor double, que es la raíz cuadrada de un valor; 
 * y el método pow,  nos devolverá el resultado de elevar un número al cuadrado.
 */
package Ejercicio45_Hipotenusa;

import java.util.Scanner;

public class Hipotenusa {
	
	public static void main (String[]args) {
		double catetoA, catetoB, hipotenusa;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el valor del cateto 1: ");
		catetoA = sc.nextDouble();
		System.out.println("Ingrese el valor del cateto 2: ");
		catetoB = sc.nextDouble();
		hipotenusa = Math.sqrt((Math.pow(catetoA, 2)+Math.pow(catetoB, 2)));
		
		System.out.println("La hipotenusa es: "+ hipotenusa);
	}

}
