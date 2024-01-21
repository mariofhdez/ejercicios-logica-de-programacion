package ejercicio103_IGUVenta;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Configuracion extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField campoIVA;
	private JTextField campoDescuento;
	public double datoIVA, datoDesc;

	/**
	 * Create the dialog.
	 */
	public Configuracion() {
		setBounds(100, 100, 250, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblIVA = new JLabel("IVA");
			lblIVA.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblIVA.setBounds(10, 31, 98, 20);
			contentPanel.add(lblIVA);
		}
		{
			JLabel lblDescuento = new JLabel("Descuento");
			lblDescuento.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblDescuento.setBounds(10, 75, 98, 20);
			contentPanel.add(lblDescuento);
		}
		{
			campoIVA = new JTextField();
			campoIVA.setBounds(118, 32, 96, 19);
			contentPanel.add(campoIVA);
			campoIVA.setColumns(10);
		}
		{
			campoDescuento = new JTextField();
			campoDescuento.setBounds(118, 75, 96, 19);
			contentPanel.add(campoDescuento);
			campoDescuento.setColumns(10);
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					datoIVA = Double.parseDouble(campoIVA.getText());
					datoDesc = Double.parseDouble(campoDescuento.getText());
					System.out.println("dialog: "+datoIVA+datoDesc);
					dispose();
				}
			});
			btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnAceptar.setBounds(10, 128, 80, 25);
			contentPanel.add(btnAceptar);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnCancelar.setBounds(134, 128, 80, 25);
			contentPanel.add(btnCancelar);
		}
	}
	
}
