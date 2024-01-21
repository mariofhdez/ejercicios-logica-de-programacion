package ejercicio94_ButtonGroup;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Selección de colores");
		lblTitulo.setBounds(111, 10, 214, 29);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lblTitulo);
		
		
		JCheckBox chkVerde = new JCheckBox("Verde");
		chkVerde.setForeground(new Color(0, 128, 0));
		chkVerde.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkVerde.setBounds(6, 65, 93, 21);
		contentPane.add(chkVerde);
		
		JCheckBox chkAzul = new JCheckBox("Azul");
		chkAzul.setForeground(new Color(0, 0, 128));
		chkAzul.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkAzul.setBounds(6, 107, 93, 21);
		contentPane.add(chkAzul);
		
		JCheckBox chkRojo = new JCheckBox("Rojo");
		chkRojo.setForeground(new Color(255, 0, 0));
		chkRojo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkRojo.setBounds(6, 151, 93, 21);
		contentPane.add(chkRojo);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = "El color seleccionado es ";
				if(chkVerde.isSelected()) {
					mensaje = mensaje + "verde";
				}
				if(chkAzul.isSelected()) {
					mensaje = mensaje + "azul";
				}
				if(chkRojo.isSelected()) {
					mensaje = mensaje + "rojo";
				}
				campoTexto.setText(mensaje);
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAceptar.setBounds(6, 196, 141, 21);
		contentPane.add(btnAceptar);
		
		campoTexto = new JTextField();
		campoTexto.setBounds(172, 199, 254, 54);
		contentPane.add(campoTexto);
		campoTexto.setColumns(10);
		
		ButtonGroup grupoColores = new ButtonGroup();
		grupoColores.add(chkVerde);
		grupoColores.add(chkAzul);
		grupoColores.add(chkRojo);
		
		
	}
}
