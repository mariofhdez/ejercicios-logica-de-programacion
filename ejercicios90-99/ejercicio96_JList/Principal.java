package ejercicio96_JList;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
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
		
		campoTexto = new JTextField();
		campoTexto.setBounds(10, 196, 416, 19);
		contentPane.add(campoTexto);
		campoTexto.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAceptar.setBounds(266, 85, 160, 38);
		contentPane.add(btnAceptar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 61, 184, 96);
		contentPane.add(scrollPane);
		
		JList listaComidas = new JList();
		listaComidas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		listaComidas.setModel(new AbstractListModel() {
			String[] values = new String[] {"Pizza", "Hamburguesa", "Perro caliente", "Salchipapa", "Tacos", "Sushi", "Plátano con queso", "Arepa con todo", "Chorizo santarrosano", "Empanadas", "Marranita", "Choriperro"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(listaComidas);
		
		JLabel lblTitulo = new JLabel("Seleccione una comida");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTitulo.setBounds(10, 10, 184, 28);
		contentPane.add(lblTitulo);
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = " ";
				if(listaComidas.getSelectedIndex()==-1) {
					mensaje = "No seleccionaste ninguna comida.";
				} else {
					mensaje = "La comida seleccionada es "+listaComidas.getSelectedValue().toString();
				}
				campoTexto.setText(mensaje);
			}
		});
	}
}
