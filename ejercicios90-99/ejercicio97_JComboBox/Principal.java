package ejercicio97_JComboBox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PC", "Celular", "Televisión", "Lavadora", "Licuadora", "Estufa"}));
		comboBox.setBounds(10, 57, 148, 21);
		contentPane.add(comboBox);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = " ";
				if(comboBox.getSelectedIndex() ==-1) {
					mensaje = "No has seleccionado ningún producto";
				} else {
					mensaje = "El producto seleccionado es "+comboBox.getSelectedItem().toString();
				}
				campoTexto.setText(mensaje);
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAceptar.setBounds(278, 57, 110, 21);
		contentPane.add(btnAceptar);
		
		campoTexto = new JTextField();
		campoTexto.setBounds(10, 162, 416, 19);
		contentPane.add(campoTexto);
		campoTexto.setColumns(10);
		
		JLabel lblTitulo = new JLabel("Seleccione un producto:");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTitulo.setBounds(10, 10, 195, 21);
		contentPane.add(lblTitulo);
	}
}
