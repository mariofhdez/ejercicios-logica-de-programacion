package ejercicio86_MetodosSobrecargados;

public class Principal {
	
	public static void main(String[]args) {
		Persona p1 = new Persona("Ana",40);
		Persona p2 = new Persona("Maria",28);
		Persona p3 = new Persona("Juan",23);
		
		System.out.println("La edad de "+p1.getNombre()+" es "+p1.getEdad());
		System.out.println("La edad de "+p2.getNombre()+" es "+p2.getEdad());
		System.out.println("La edad de "+p3.getNombre()+" es "+p3.getEdad());
		
		p1.editar("Miguel");
		p2.editar(25);
		p3.editar("Violeta",22);
		
		System.out.println(p1.getNombre() + " tiene "+ p1.getEdad());
		System.out.println(p2.getNombre() + " tiene "+ p2.getEdad());
		System.out.println(p3.getNombre() + " tiene "+ p3.getEdad());
	}

}
