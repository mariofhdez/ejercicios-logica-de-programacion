/*
 * Codificar un programa que tome el promedio de calificaciones de un estudiante,
 * y devuelva la cantidad de dinero a recibir como beneficio de beca,
 * dependiendo del promedio; además informe que el promedio mínimo requerido para recibir la beca.
 * Si el promedio excede de 10, y es menor que 0, se debe pedir ingresar nuevamente,
 * ya que esos datos son erroneos por estar fuera del rango.
 * Si el promedio es mayor o igual a 9 la cantidad a recibir son 100 dólares,
 * si el promedio es mayor o igual a 8 la cantidad a recibir son 60 dólares,
 * si el promedio es mayor o igual a 6 la cantidad a recibir son 30 dólares.
 * si el alumno tiene un promedio menor a 6, está reprobado, y no tiene derecho a recibir beca.
 */
package Ejercicio42_BecaEstudiantil;

import javax.swing.JOptionPane;

public class Becado {
	
	public static void main(String[]args) {
		
		boolean flag = true;
		Becado scolarship = new Becado();
		String message = "";
		
		while(flag) {
			int average = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el promedio del estudiante"));
			
			while(average > 10 || average < 0) {
				JOptionPane.showMessageDialog(null, "El promedio no puede ser mayor a la nota máxima (10) ni inferior a la nota mínima (0).");
				average = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el promedio del estudiante"));
			}
			
			if(average>5) {
				message = "Felicitaciones!!! "
						+ "\nSu promedio es de "+average+" por lo que ha recibido una beca por valor de $"+ scolarship.hasScolarship(average);
			} else {
				message = "Lo sentimos. "
						+ "\n Su promedio es de "+average+". Ha reprobado la materia.";
			}
			
			JOptionPane.showMessageDialog(null, message);
			
			int next = JOptionPane.showInternalConfirmDialog(null, message);
			System.out.println(next);
			if(next>0) {
				flag = false;
			}
		}
	}
	
	public int hasScolarship (int avg) {
		int scolarship = 0;
		if(avg >= 9) {
			scolarship = 100;
		} else if (avg >= 8) {
			scolarship = 60;
		} else {
			scolarship = 30;
		}
		return scolarship;
	}

}
