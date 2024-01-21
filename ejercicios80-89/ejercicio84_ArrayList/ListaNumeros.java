/*
 * El programa debe tener un menú de opciones, donde se pueda agregar un número, 
 * buscar un número determinado, poder modificar un número, 
 * eliminar un número e insertar un número en una posición dada.
 */

package ejercicio84_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNumeros {
	
	ArrayList<Double> listaNumeros;
	Scanner sc = new Scanner(System.in);
	double valor;
	int i;
	
	public static void main(String[]args) {
		ListaNumeros miLista = new ListaNumeros();  // Se instancia la clase ListaNumeros
		miLista.listaNumeros = new ArrayList<Double>();		//Se crea el elemento ListaNumeros de la clase ListaNumeros
		miLista.leerOpcion();								//Se ejecuta el método leerOpcion como menú principal del programa
	}
	
	public void leerOpcion() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("Lista de números:"
					+ "\n 1. Agregar"
					+ "\n 2. Buscar"
					+ "\n 3. Modificar elemento"
					+ "\n 4. Eliminar elemento"
					+ "\n 5. Insertar elemento"
					+ "\n 6. Mostrar elementos"
					+ "\n 7. Para Salir");
			System.out.println("Ingrese una opción: ");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				ingresarValor();
				break;
			case 2:
				buscarValor();
				break;
			case 3:
				modificarValor();
				break;
			case 4:
				eliminarValor();
				break;
			case 5:
				insertarValor();
				break;
			case 6:
				mostrarLista();
				break;
			}
		} while(opcion!=7);
		sc.close();
	}

	private void mostrarLista() {
		if(!listaNumeros.isEmpty()) {
			System.out.println("Elementos de la lista: ");
			for(int i = 0; i < listaNumeros.size(); i++) {
				System.out.println(listaNumeros.get(i));
			}
		} else {
			System.out.println("No existen elementos en la lista.");
		}
	}

	private void insertarValor() {
		System.out.print("Ingrese el valor a insertar: ");
		valor = sc.nextDouble();
		System.out.print("Indique la posición donde desea insertar: ");
		i = sc.nextInt();
		listaNumeros.add(i, valor);
	}

	private void eliminarValor() {
		System.out.print("Ingrese el valor a eliminar: ");
		valor = sc.nextDouble();
		i = listaNumeros.indexOf(valor);
		if(i != -1) {
			listaNumeros.remove(i);
			System.out.println("Dato eliminado");
		} else {
			System.out.println("Dato no se encuentra");
		}
	}

	private void modificarValor() {
		double nuevoValor;
		System.out.print("Ingrese el valor a modificar: ");
		valor = sc.nextDouble();
		i = listaNumeros.indexOf(valor);
		if(i != -1) {
			System.out.print("Ingrese el nuevo valor a registrar: ");
			nuevoValor = sc.nextDouble();
			listaNumeros.set(i, nuevoValor);
		} else {
			System.out.println("Dato no se encuentra");
		}
	}

	private void buscarValor() {
		System.out.print("Ingrese el valor a buscar: ");
		valor = sc.nextDouble();
		i = listaNumeros.indexOf(valor);
		if(i != -1) {
			System.out.println("Dato se encuentra en la posición: "+i);
		} else {
			System.out.println("Dato no se encuentra");
		}
	}

	private void ingresarValor() {
		System.out.print("Ingrese el valor a registrar: ");
		valor = sc.nextDouble();
		listaNumeros.add(valor);
	}
	
	

}
