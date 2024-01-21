package ejercicio91_InstanceOf;

public class Principal {
	public static void main(String[]args) {
		
		Empleado e1 = new Empleado("Laura",45,4000);
		Vendedor e2 = new Vendedor("Paloma",38, 3000, 500);
		Cocinero e3 = new Cocinero("Luis", 35, 4500, "Gourmet");
		Empleado empleados[]= {e1, e2, e3};
		
		Vendedor v1;
		Cocinero c1;
		
		for (Empleado e:empleados) {
			System.out.println(e.getNombre());
			if(e instanceof Vendedor) {
				v1 = (Vendedor)e;
				v1.metodoVendedor();
			} else if(e instanceof Cocinero) {
				c1 = (Cocinero)e;
				c1.metodoCocinero();
			}
			System.out.println(e.datosEmpleado());
		}
	}

}
