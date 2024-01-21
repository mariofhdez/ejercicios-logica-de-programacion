package ejercicio92_Libreria;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static int option = 0;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		Libro libro1 = new Libro();
//		libro1.setTitulo("Algebra de Baldor");
//		libro1.setAutor("Dr. Aurelio Baldor");
//		libro1.setCantidadLibros(4);
//		libro1.setCantidadPrestados(1);
//		libro1.devolverLibro();
//		
//		if(libro1.darPrestamo()) {
//			System.out.println("Se ha prestado el libro: "+libro1.getTitulo());
//		} else {
//			System.out.println("No se encuentran ejemplares del libro "+libro1.getTitulo()+" para prestar.");
//		}
//		
//		System.out.println("Se han prestado "+libro1.getCantidadPrestados()+" libros de "+libro1.getTitulo());

		int indice;
		ArrayList<Libro> libros = new ArrayList<Libro>();
		llenarLibreria(libros);

		do {
			System.out.println("Seleccione la acción que desee realizar:" + "\n 1. Listar libros"
					+ "\n 2. Consultar libro" + "\n 3. Agregar un libro" + "\n 4. Prestar un libro"
					+ "\n 5. Devolver un libro" + "\n 0. Salir");
			option = sc.nextInt();

			switch (option) {
			case 1:
				listarLibros(libros);
				volverMenu();
				break;
			case 2:
				System.out.println("Ingrese la posición del libro que desea consultar:");
				indice = sc.nextInt();
				consultarLibro(indice, libros);
				volverMenu();
				break;
			case 3:
				agregarLibro(libros);
				volverMenu();
				break;
			case 4:
				System.out.print("Indique la posición del libro a prestar: ");
				indice = sc.nextInt();
				prestarLibro(indice, libros);
				volverMenu();
				break;
			case 5:
				System.out.print("Indique la posición del libro a devolver: ");
				indice = sc.nextInt();
				devolverLibro(indice, libros);
				volverMenu();
				break;
			}
		} while (option != 0);
	}

	private static void devolverLibro(int indice, ArrayList<Libro> libros) {
		int pos = indice - 1;
		String mensaje = libros.get(pos).devolverLibro() ? "Se ha devuelto con éxito"
				: "El libro no tiene ejemplares prestados por lo que No se puede devolver";
		System.out.println(mensaje);
	}

	private static void prestarLibro(int indice, ArrayList<Libro> libros) {
		int pos = indice - 1;
		if (libros.get(pos).darPrestamo()) {
			System.out.println("Se ha prestado el libro " + libros.get(pos).getTitulo());
		} else {
			System.out.println("El libro " + libros.get(pos).getTitulo() + " no se encuentra disponible");
		}
	}

	private static void agregarLibro(ArrayList<Libro> libros) {
		String nom = "", aut;
		int cantE, cantP;
		
		do{
			sc.nextLine();
			System.out.println("Ingrese el título del libro: ");
			nom = sc.nextLine();
		} while (nom.equals(""));
		
		do {
		System.out.println("Ingrese el nombre del autor del libro: ");
		aut = sc.nextLine();
		} while(aut.equals(""));
		
		System.out.println("Ingrese la cantidad de ejemplares existentes: ");
		cantE = sc.nextInt();
		System.out.println("Ingrese la cantidad de libros prestados: ");
		cantP = sc.nextInt();

		Libro libro = new Libro(nom, aut, cantE, cantP);
		libros.add(libro);
		System.out.println("Libro agregado correctamente.");
	}

	private static void consultarLibro(int indice, ArrayList<Libro> libros) {
		int pos = indice - 1;
		System.out.println(
				"El libro en la posición " + indice + " es: " + "\n" + libros.get(pos).getTitulo() + "\nDel autor: "
						+ libros.get(pos).getAutor() + "\nTiene " + libros.get(pos).getCantidadLibros() + " ejemplares"
						+ "\nDe los cuales " + libros.get(pos).getCantidadPrestados() + " se encuentran prestados.");
	}

	private static void volverMenu() {
		System.out.println("Seleccione una opción: " + "\n 1. Volver al menú anterior " + "\n 0. Para salir");
		option = sc.nextInt();

	}

	private static void listarLibros(ArrayList<Libro> libros) {
		int pos = 1;
		for (Libro libro : libros) {
			System.out.println(pos + ". " + libro.getTitulo());
			pos++;
		}
	}

	private static void llenarLibreria(ArrayList<Libro> libros) {
		Libro l1 = new Libro("El diario de Ana Frank", "Ana Frank", 3, 0);
		libros.add(l1);
		Libro l2 = new Libro("Algebra de Baldor", "Dr. Aurelio Baldor", 4, 2);
		libros.add(l2);
		Libro l3 = new Libro("Hábitos atómicos", "James Clear", 5, 3);
		libros.add(l3);
		Libro l4 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1, 0);
		libros.add(l4);
		Libro l5 = new Libro("El alquimista", "Paulo Coelo", 3, 2);
		libros.add(l5);
	}

}
