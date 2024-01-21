/*
 * Se crean dos clases, que heredarán de JFrame, ambas por lo tanto, serán ventanas. 
 * La primer ventana tendrá dos campos textfield, para introducir nombre y edad, 
 * respectivamente, pero si la edad es menor que 18, se generará evento al dar 
 * click en el botón, y se mostrará un mensaje que diga que la edad es incorrecta.
 */

package ejercicio100_IGUValidarEdad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Datos extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoNombre;
	private JTextField campoEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Datos frame = new Datos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Datos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelTitulo = new JLabel("Ingrese sus datos");
		labelTitulo.setBounds(124, 10, 196, 29);
		labelTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		labelTitulo.setBackground(new Color(240, 240, 240));
		contentPane.add(labelTitulo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(68, 66, 58, 17);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEdad.setBounds(68, 124, 58, 17);
		contentPane.add(lblEdad);
		
		campoNombre = new JTextField();
		campoNombre.setBounds(67, 95, 187, 19);
		contentPane.add(campoNombre);
		campoNombre.setColumns(10);
		
		campoEdad = new JTextField();
		campoEdad.setBounds(68, 151, 96, 19);
		contentPane.add(campoEdad);
		campoEdad.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAceptar.setBounds(169, 212, 100, 30);
		contentPane.add(btnAceptar);
		
		btnAceptar.addActionListener(this);
	}
	
	public void validarDatos(int edad, String nombre) {
		if(edad < 18 || edad > 99) {
			JOptionPane.showMessageDialog(null, "La edad ingresada es incorrecta.");
		} else {
			Ventana ventana = new Ventana(nombre);
			ventana.setVisible(true);
			dispose();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int edad = 0;
		String nombre = "";
		edad = Integer.parseInt(campoEdad.getText());
		nombre = campoNombre.getText();
		validarDatos(edad, nombre);
		
	}
}
