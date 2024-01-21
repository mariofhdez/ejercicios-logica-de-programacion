package ejercicio93_JCheckBox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

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
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		campoTexto = new JTextField();
		campoTexto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		campoTexto.setBounds(28, 214, 398, 21);
		contentPane.add(campoTexto);
		campoTexto.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAceptar.setBounds(29, 150, 152, 21);
		contentPane.add(btnAceptar);
		
		JCheckBox checkBox_Verde = new JCheckBox("Verde");
		checkBox_Verde.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkBox_Verde.setBounds(29, 17, 93, 21);
		contentPane.add(checkBox_Verde);
		
		JCheckBox checkBox_Azul = new JCheckBox("Azul");
		checkBox_Azul.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkBox_Azul.setBounds(29, 60, 93, 21);
		contentPane.add(checkBox_Azul);
		
		JCheckBox checkBox_Rojo = new JCheckBox("Rojo");
		checkBox_Rojo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkBox_Rojo.setBounds(29, 103, 93, 21);
		contentPane.add(checkBox_Rojo);
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = "Colores elegidos:";
				if(checkBox_Verde.isSelected()) {
					mensaje = mensaje + " verde";
				}
				if(checkBox_Azul.isSelected()) {
					mensaje = mensaje + " azul";
				}
				if(checkBox_Rojo.isSelected()) {
					mensaje = mensaje + " rojo";
				}
				campoTexto.setText(mensaje);
			}
		});
	}
}
