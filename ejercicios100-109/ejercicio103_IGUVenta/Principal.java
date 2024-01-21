package ejercicio103_IGUVenta;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoUnidades;
	private JTextField campoPrecio;
	private JTextField campoTotal;
	double iva, descuento;

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
		iva = 0;
		descuento = 0;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCantidad = new JLabel("Unidades");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCantidad.setBounds(35, 41, 101, 20);
		contentPane.add(lblCantidad);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrecio.setBounds(35, 97, 101, 20);
		contentPane.add(lblPrecio);
		
		JLabel lblTotal = new JLabel("Total a pagar");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotal.setBounds(35, 147, 101, 20);
		contentPane.add(lblTotal);
		
		campoUnidades = new JTextField();
		campoUnidades.setFont(new Font("Tahoma", Font.PLAIN, 16));
		campoUnidades.setBounds(146, 44, 96, 19);
		contentPane.add(campoUnidades);
		campoUnidades.setColumns(10);
		
		campoPrecio = new JTextField();
		campoPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		campoPrecio.setColumns(10);
		campoPrecio.setBounds(146, 97, 96, 19);
		contentPane.add(campoPrecio);
		
		campoTotal = new JTextField();
		campoTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		campoTotal.setColumns(10);
		campoTotal.setBounds(146, 147, 96, 19);
		contentPane.add(campoTotal);
		
		Configuracion dialogoConfig = new Configuracion();

		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double unidades, precio, subtotal, totalAPagar, valor_iva, valor_descuento;
				
				unidades = Double.parseDouble(campoUnidades.getText());
				precio = Double.parseDouble(campoPrecio.getText());
				iva = dialogoConfig.datoIVA;
				descuento = dialogoConfig.datoDesc;
				
				
				subtotal = unidades * precio;
				valor_descuento = subtotal * descuento/100;
				subtotal = subtotal - valor_descuento;
				valor_iva = subtotal * iva/100;
				totalAPagar = unidades * precio - valor_descuento + valor_iva;
				
				campoTotal.setText(" "+totalAPagar);
				System.out.println("subtotal: "+subtotal+"\ndcto: "+valor_descuento+"\niva: "+valor_iva);
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCalcular.setBounds(47, 194, 135, 25);
		contentPane.add(btnCalcular);
		
		JButton btnConfig = new JButton("Configuración");
		btnConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialogoConfig.setSize(250,200);
				dialogoConfig.setLocation(100,100);
				dialogoConfig.setVisible(true);
				
			}
		});
		btnConfig.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConfig.setBounds(253, 194, 135, 25);
		contentPane.add(btnConfig);
	}
}
