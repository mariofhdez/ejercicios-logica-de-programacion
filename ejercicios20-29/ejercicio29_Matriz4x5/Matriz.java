package ejercicio29_Matriz4x5;

public class Matriz {
	
	public static void main(String[]Args) {
		
		int array[][] = new int[4][5];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i == 0 || i == 4) {
					array[i][j] = 1;
				} else if(j == 0 || j == 3) {
					array[i][j] = 1;
				} else {
					array[i][j] = 0;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("\n");
			for(int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
		}
		
	}

}
