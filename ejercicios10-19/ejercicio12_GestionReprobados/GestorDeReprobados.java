//El ejercicio solicita para 5 estudiantes su código y su calificación
//De acuerdo a la calificación determina si reprobó o no la materia
package ejercicio12_GestionReprobados;

import javax.swing.JOptionPane;

public class GestorDeReprobados {
	
	public static void main (String[]Args) {
		
		float calificacion;
		String codigoEstudiante;
		
		for(int i = 1; i <= 5; i++) {
			codigoEstudiante = JOptionPane.showInputDialog("Ingresa el código del estudiante");
			calificacion = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la calificación del estudiante "+codigoEstudiante));
			
			if(calificacion < 6) {
				JOptionPane.showMessageDialog(null, "El estudiante con código " + codigoEstudiante + " ha reprobado.");
			} else {
				JOptionPane.showMessageDialog(null, "El estudiante con código " + codigoEstudiante + " ha aprobado.");
			}
		}
	}

}
