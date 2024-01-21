package ejercicio95_Button;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		
		JCheckBox chkVerde = new JCheckBox("Verde");
		chkVerde.setForeground(new Color(34, 139, 34));
		chkVerde.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkVerde.setBounds(6, 64, 93, 21);
		contentPane.add(chkVerde);
		
		JLabel lblNewLabel = new JLabel("Seleccione un color");
		lblNewLabel.setBounds(113, 10, 205, 29);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lblNewLabel);
		
		JCheckBox chkAzul = new JCheckBox("Azul");
		chkAzul.setForeground(new Color(0, 0, 255));
		chkAzul.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkAzul.setBounds(185, 64, 93, 21);
		contentPane.add(chkAzul);
		
		JCheckBox chkRojo = new JCheckBox("Rojo");
		chkRojo.setForeground(new Color(255, 0, 0));
		chkRojo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chkRojo.setBounds(324, 66, 93, 21);
		contentPane.add(chkRojo);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkVerde.isSelected()) {
					btnAceptar.setBackground(new Color(34,139,34));
					btnAceptar.setForeground(new Color(255,255,255));
				}
				if(chkAzul.isSelected()) {
					btnAceptar.setBackground(new Color(0,0,255));
					btnAceptar.setForeground(new Color(255,255,255));
				}
				if(chkRojo.isSelected()) {
					btnAceptar.setBackground(new Color(255,0,0));
					btnAceptar.setForeground(new Color(0,0,0));
				}
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnAceptar.setBounds(166, 174, 125, 29);
		contentPane.add(btnAceptar);
		
		ButtonGroup grupoColores = new ButtonGroup();
		grupoColores.add(chkVerde);
		grupoColores.add(chkAzul);
		grupoColores.add(chkRojo);
	}

}
