package ejercicio90_UpDownCasting;

public class Gato extends Animal{

	public Gato(String nombre, double peso, double estatura) {
		super(nombre, peso, estatura);
	}
	
	@Override
	public void mensaje() {
		System.out.println("Soy un gato");
	}
	
	public void sonidoGato() {
		System.out.println("Mi sonido característico es: Miau");
	}

}
