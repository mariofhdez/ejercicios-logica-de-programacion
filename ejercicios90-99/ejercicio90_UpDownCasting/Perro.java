package ejercicio90_UpDownCasting;

public class Perro extends Animal{

	public Perro(String nombre, double peso, double estatura) {
		super(nombre, peso, estatura);
	}

	@Override
	public void mensaje() {
		System.out.println("Soy un perro");
	}
	
	public void sonidoPerro() {
		System.out.println("Mi sonido característico es: Guau");
	}
}
