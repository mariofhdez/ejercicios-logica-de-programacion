package ejercicio90_UpDownCasting;

public class Principal {
	
	public static void main(String[]args) {
		Animal patito = new Pato("Donald", 12, 36);		//upcasting
		Perro perrito2 = new Perro("Tammy", 15, 45);
		Gato gatito2 = new Gato("Mia", 6.5, 22);
		
		Animal animalitos[] = new Animal[5];
		animalitos[0] = new Perro("Hanna",35,75);
		animalitos[1] = new Gato("Michi", 7, 32);
		animalitos[2] = patito;
		animalitos[3] = perrito2;
		animalitos[4] = gatito2;
		
		//animalitos[0].sonidoPerro();	método no soportado por la clase animal, por lo que requiere un downcasting
		Perro perrito = (Perro) animalitos[0]; //downcasting
		perrito.sonidoPerro();
		
		for(int i = 0; i < animalitos.length; i++) {
			System.out.println("Hola mi nombre es "+animalitos[i].getNombre()
					+"\nPeso: " + animalitos[i].getPeso() + " kg"
					+"\nEstatura: " + animalitos[i].getEstatura()+ " cm");
			animalitos[i].mensaje();
		}
		
	}

}
