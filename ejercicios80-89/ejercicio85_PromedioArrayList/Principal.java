package ejercicio85_PromedioArrayList;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[]args) {
		ArrayList<Double> altura = new ArrayList<Double>();
		int N;
		double media;
		
		N = PromedioAltura.cantAlumnos();
		
		PromedioAltura.leerAlturas(altura, N);
		
		media = PromedioAltura.calcularMedia(altura);
		
		PromedioAltura.mostrarResultados(altura, media);
	}

}
