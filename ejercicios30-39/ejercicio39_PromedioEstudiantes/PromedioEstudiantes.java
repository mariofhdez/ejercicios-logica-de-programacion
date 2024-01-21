package ejercicio39_PromedioEstudiantes;




import java.util.Scanner;

public class PromedioEstudiantes {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion, id;
		
		System.out.println("Ingrese la cantidad de estudiantes en el grupo");
		int cant = sc.nextInt();
		
		int primerTrimestre[] = new int[cant];
		int segundoTrimestre[] = new int[cant];
		int tercerTrimestre[] = new int[cant];
		
		rellenarTrimestre(primerTrimestre);
		rellenarTrimestre(segundoTrimestre);
		rellenarTrimestre(tercerTrimestre);
		
		System.out.println("Elija una opción del menú:\n"
				+ "1. Para consultar un estudiante por su número.\n"
				+ "2. Para consultar el promedio de todos los estudiantes.\n"
				+ "3. Para consultar el promedio por trimestre.\n"
				+ "4. Para consultar el promedio total del curso.\n"
				+ "0. Para salir.");
		opcion = sc.nextInt();
		
		while(opcion!=0) {
			if(opcion == 1) {
				System.out.println("Ingrese la posición del estudiante del 1 al "+cant);
				id = sc.nextInt();
				System.out.println("El promedio del estudiante no. "+(id)+" es: "+ promedioEstudiante(id-1, primerTrimestre, segundoTrimestre, tercerTrimestre));
			}
			if(opcion == 2) {
				for(int i = 0; i < cant; i++) {
					System.out.println("El promedio del estudiante no. "+(i+1)+" es: "+ promedioEstudiante(i, primerTrimestre, segundoTrimestre, tercerTrimestre));
				}				
			}
			if(opcion == 3) {
				System.out.println("El promedio del primer trimestre es: "+ promedioTrimestre(primerTrimestre));
				System.out.println("El promedio del segundo trimestre es: "+ promedioTrimestre(segundoTrimestre));
				System.out.println("El promedio del tercer trimestre es: "+ promedioTrimestre(tercerTrimestre));
			}
			if(opcion == 4) {
				System.out.println("El promedio general del curso es: "+ promedioCurso(cant, primerTrimestre, segundoTrimestre, tercerTrimestre));
			}
			System.out.println("Elija una opción del menú:\n"
					+ "1. Para consultar un estudiante por su número.\n"
					+ "2. Para consultar el promedio de todos los estudiantes.\n"
					+ "3. Para consultar el promedio por trimestre.\n"
					+ "4. Para consultar el promedio total del curso.\n"
					+ "0. Para salir.");
			opcion = sc.nextInt();
		}
		
	}
	
	public static void rellenarTrimestre(int[]array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*10);
		}
	}
	
	public static int promedioEstudiante(int i, int[]primerTrimestre,int[]segundoTrimestre,int[]tercerTrimestre) {
		int suma = primerTrimestre[i] + segundoTrimestre[i] + tercerTrimestre[i];
		int promedio = suma/3;
		return promedio;
	}
	
	public static int promedioTrimestre(int[]array) {
		int suma = 0;
		for(int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		int promedio = suma/array.length;
		return promedio;
	}
	
	public static int promedioCurso(int cant, int[]primerTrimestre,int[]segundoTrimestre,int[]tercerTrimestre) {
		int suma = 0;
		int promedioCurso;
		for(int i = 0; i < cant; i++) {
			suma = suma + promedioEstudiante(i,primerTrimestre,segundoTrimestre,tercerTrimestre);
		}
		promedioCurso = suma/cant;
		return promedioCurso;
	}

}
