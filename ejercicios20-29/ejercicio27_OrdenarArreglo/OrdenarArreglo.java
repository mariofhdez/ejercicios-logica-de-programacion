package ejercicio27_OrdenarArreglo;
import java.util.Scanner;

public class OrdenarArreglo {
	
	public static void main(String[]Args) {
		
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		
		System.out.println("Rellenar el arreglo: ");
		int k = 0;
		while(k<array.length) {
			System.out.println("Introduce un número:");
			int num = sc.nextInt();
			array[k] = num;
			k++;
		}
		
		ordenarArreglo(array);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void ordenarArreglo(int[]array) {
		int contador = 0;
		for(boolean ordenado = false; !ordenado;) {
			for(int i = 0; i < array.length-1; i++) {
				if(array[i] > array[i+1]) {
					int aux = array[i];
					array[i] = array[i+1];
					array[i+1] = aux;
					contador++;
				}
			}
			if(contador == 0) {
				ordenado = true;
			}
			contador = 0;
		}
	}

}
