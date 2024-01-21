package ejercicio89_Casting;

public class Principal {
	
	public static void main(String[]args) {
		
		Empleado empleados[] = new Empleado[5];
		
		empleados[0] = new Empleado("Mario", 26, 1800);
		
		empleados[1] = new Gerente("Mateo", 20, 2600);
		Gerente g1 = (Gerente)empleados[1];						//Casting para usar método setBonificacion
		g1.setBonificacion(800);
		g1.setInasistencias(2);
		
		empleados[2] = new Auxiliar("Alejandra",24,1100);
		Auxiliar aux1 = (Auxiliar)empleados[2];					//Casting para usar método setHorasExtra
		aux1.setHorasExtra(15);
		aux1.setInasistencias(1);
		
		Gerente g2 = new Gerente("Alba", 50, 4800);
		g2.setBonificacion(1000);
		empleados[3] = g2;
		
		Auxiliar aux2 = new Auxiliar("Carlos", 35,1500);
		empleados[4] = aux2;
		
		for(int i = 0; i < empleados.length;i++) {
			System.out.println("El nombre es "+empleados[i].getNombre()
					+" con edad de "+empleados[i].getEdad()
					+" con un sueldo de $"+empleados[i].getSueldo());
		}
	}

}
