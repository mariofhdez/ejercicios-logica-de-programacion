/*
 *  interfaz sencilla, que contendrá dos botones, uno de color verde, 
 *  y uno de color rojo, a los cuales les asignaremos ese color con 
 *  la clase llamada Color del paquete java.awt.Color.
 *  Usaremos la interfaz ActionListener, a la cual tendremos que 
 *  implementarle su método actionPerfomed; cuando le demos click a 
 *  los botones, se van a generar ciertos eventos, como mostrar 
 *  ventanas emergentes en pantalla.
 */

package ejercicio99_ActionPerformed;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class Principal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnVerde, btnRojo;

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
		
		JLabel lblNewLabel = new JLabel("Seleccione un color:");
		lblNewLabel.setBounds(142, 5, 153, 20);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setForeground(new Color(255, 255, 255));
		btnRojo.setBackground(new Color(255, 0, 0));
		btnRojo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRojo.setBounds(269, 126, 100, 35);
		contentPane.add(btnRojo);
		
		btnVerde = new JButton("Verde");
		btnVerde.setForeground(new Color(255, 255, 255));
		btnVerde.setBackground(new Color(0, 128, 0));
		btnVerde.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnVerde.setBounds(79, 126, 100, 35);
		contentPane.add(btnVerde);
		
		btnVerde.addActionListener(this);
		btnRojo.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnVerde) {
			JOptionPane.showMessageDialog(null, "Presionaste el botón verde");
		} if (e.getSource()==btnRojo) {
			JOptionPane.showMessageDialog(null, "Presionaste el botón rojo");
		}
	}

}
