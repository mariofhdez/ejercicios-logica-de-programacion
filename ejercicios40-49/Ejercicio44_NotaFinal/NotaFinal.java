/*
 * Crear un programa que devuelva la calificación final,
 * considerando el valor de cada uno de los puntos a considerar en la evaluación:
 * -> Examen primer corte 30%
 * -> Examen segundo corte 40%
 * -> Practicas 20%
 * -> Tareas 10%
 * Nota final = Ex1 + Ex2 + Prac + Tar
 */
package Ejercicio44_NotaFinal;

import javax.swing.JOptionPane;

public class NotaFinal {
	
	public static void main (String[]args) {
		double firstExam, secondExam, practices, homework;
		NotaFinal nf = new NotaFinal();
		

		firstExam = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del examen del primer corte:"));
		secondExam = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del examen del segundo corte:"));
		practices = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota por prácticas:"));
		homework = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota por tareas:"));
		
		JOptionPane.showMessageDialog(null,"La nota final del estudiante es: "+ nf.finalNote(firstExam, secondExam, practices, homework));
		
		
	}
	
	public double finalNote (double ex1, double ex2, double pra, double tar) {
		return (ex1 * 0.3) + (ex2 * 0.4) + (pra * 0.2) + (tar * 0.1); 
	}

}
