/*
 * Crear una clase Producto que contenga los siguientes atributos:
 * nombre, precio, cantidad
 * Usar los métodos getters y setters, para asignar valores y devolverlos
 */

package ejercicio83_Producto;

import java.util.Scanner;

public class Principal {
	
	public static int option = 0;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		int indice, cantidad;
		String nombre;
		double precio;
		
		Producto productos[] = {new Producto("Computador",1100,7),new Producto("Celular",850,25),
				new Producto("Televisor",780,21),new Producto("Lavadora",820,5),new Producto("Mesa",375,8),
				new Producto("Nevera",740,4),new Producto("Aire acondicionado",575,3)};
		
		do {
			System.out.println("Seleccione el número de la acción que desea ejecutar:"
					+ "\n 1. Consultar un producto por su índice."
					+ "\n 2. Editar el nombre de un producto"
					+ "\n 3. Editar el precio de un producto"
					+ "\n 4. Editar la cantidad de un producto"
					+ "\n 0. Para Salir");
			option = sc.nextInt();
			
			switch(option) {
			case 1:
				System.out.print("Ingrese el índice del producto a consultar: ");
				indice = sc.nextInt();
				consultarProducto(indice,productos);
				volverMenu();
				break;
			case 2:
				System.out.print("Ingrese el índice del producto a editar: ");
				indice = sc.nextInt();
				System.out.print("Ingrese el nuevo nombre: ");
				nombre = sc.next();
				editarNombreProducto(indice, productos, nombre);
				volverMenu();
				break;
			case 3:
				System.out.print("Ingrese el índice del producto a editar: ");
				indice = sc.nextInt();
				System.out.print("Ingrese el nuevo precio: ");
				precio = sc.nextDouble();
				editarPrecioProducto(indice, productos, precio);
				volverMenu();
				break;
			case 4:
				System.out.print("Ingrese el índice del producto a editar: ");
				indice = sc.nextInt();
				System.out.print("Ingrese la nueva cantidad: ");
				cantidad = sc.nextInt();
				editarCantidadProducto(indice, productos, cantidad);
				volverMenu();
				break;
			}
		} while(option != 0);
		sc.close();
	}
	
	
	public static void consultarProducto(int i, Producto[]arr) {
		System.out.println("El producto con índice "+i
				+"\nNombre:   "+arr[i].getNombre()
				+"\nPrecio:   "+arr[i].getPrecio()
				+"\nCantidad: "+arr[i].getCantidad());
	}
	
	public static void editarNombreProducto(int i, Producto[]arr, String nombre) {
		arr[i].setNombre(nombre);
	}
	
	public static void editarPrecioProducto(int i, Producto[]arr, double precio) {
		arr[i].setPrecio(precio);
	}
	
	public static void editarCantidadProducto(int i, Producto[]arr, int cantidad) {
		arr[i].setCantidad(cantidad);
	}
	
	public static void volverMenu() {
		System.out.println("Seleccione una opción: "
				+ "\n 1. Volver al menú anterior "
				+ "\n 0. Para salir");
		option = sc.nextInt();
	}
}
