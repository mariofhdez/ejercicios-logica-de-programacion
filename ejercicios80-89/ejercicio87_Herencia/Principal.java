package ejercicio87_Herencia;

public class Principal {
	
	public static void main(String[]args) {
		
		Persona p1 = new Persona("Maria",72,'F');
		Persona p2 = new Persona("Adán",48,'M');
		
		Empleado e1 = new Empleado("Mario",26,'M',408,"Customer","Agente de soporte");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(e1.toString());
	}

}
