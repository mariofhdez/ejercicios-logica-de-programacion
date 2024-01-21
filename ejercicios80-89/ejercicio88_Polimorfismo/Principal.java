package ejercicio88_Polimorfismo;

public class Principal {
	
	public static void main(String[]args) {
		
//		Persona p1 = new Persona("Maria",72,'F');
//		Persona p2 = new Persona("Adán",48,'M');
		
//		Empleado e1 = new Empleado("Mario",26,'M',408,"Customer","Agente de soporte");
		
//		Alumno a1 = new Alumno("Juan", 10, 'M', 924, 3.5); 
		
//		System.out.println(p1.toString());
//		System.out.println(p2.toString());
//		System.out.println(e1.toString());
		
//		e1.muestraMensaje();
//		System.out.println("Información del alumno: \n"+a1.toString());
		
		Persona empleado, alumno;
		
		empleado = new Empleado("Carlos", 26, 'M', 789, "Ventas", "Cajero");
		alumno = new Alumno("Tomas", 15, 'M', 315, 4.2);
		
		empleado.muestraMensaje();
		alumno.muestraMensaje();
		
	}

}
