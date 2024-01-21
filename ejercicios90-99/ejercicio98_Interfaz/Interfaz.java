package ejercicio98_Interfaz;

import java.awt.FlowLayout;

import javax.swing.*;

public class Interfaz extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField1, textField2;
	private JLabel label1, label2;
	
	public Interfaz() {
		super("Ventanita");
		
		FlowLayout distribuidor = new FlowLayout();
		this.setLayout(distribuidor);
		
		label1 = new JLabel("Pon tu nombre: ");
		label2 = new JLabel("Pon tu edad: ");
		
		textField1 = new JTextField(10);
		textField2 = new JTextField(5);
		textField2.setSize(100,150);
		
		add(label1);
		add(textField1);
		add(label2);
		add(textField2);
	}
	
	public static void main(String[]args) {
		Interfaz v1 = new Interfaz();
		v1.setSize(600, 400);
		v1.setResizable(false);
		v1.setLocationRelativeTo(null);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v1.setVisible(true);
		
		
	}

}
