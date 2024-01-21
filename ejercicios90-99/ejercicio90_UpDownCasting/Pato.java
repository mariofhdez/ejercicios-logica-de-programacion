package ejercicio90_UpDownCasting;

public class Pato extends Animal{

	public Pato(String nombre, double peso, double estatura) {
		super(nombre, peso, estatura);
	}

	@Override
	public void mensaje() {
		System.out.println("Soy un Pato");
	}
	
	public void sonidoPato() {
		System.out.println("Mi sonido característico es cuak");
	}
}
