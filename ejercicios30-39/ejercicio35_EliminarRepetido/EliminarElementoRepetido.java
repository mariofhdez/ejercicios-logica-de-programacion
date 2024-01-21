//Crearemos un arreglo de 10 posiciones, con datos tipo char, 
//algunos repetidos. Al momento de imprimir el arreglo, 
//no mostraremos los elementos que se repiten, en vez de eso, 
//mostraremos un espacio en blanco.
package ejercicio35_EliminarRepetido;

public class EliminarElementoRepetido {
	
	public static void main(String[]args) {
		
		char[] array = {'1','2','1','1','3','4','5','0','0','1'};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length-1; j++) {
				if(i != j) {
					if(array[i] == array[j]) {
						array[j] = ' ';
					}
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("{"+array[i]+"}");
		}
		
	}

}
