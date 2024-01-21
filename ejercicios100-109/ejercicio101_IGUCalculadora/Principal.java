package ejercicio101_IGUCalculadora;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnSuma, btnResta, btnMulti, btnDiv, btnLimpiar, btnRaiz, btnPotencia, btnSalir;
	private JTextField valor1, valor2, campoResultado;
	private JLabel lblNum1, lblNum2;
	double num1, num2, result;
	String resultado;
	
	public void controles() {
		Container contenedor = getContentPane();
		contenedor.setLayout(new FlowLayout());
		
		lblNum1 = new JLabel("Número 1");
		contenedor.add(lblNum1);
		valor1 = new JTextField(10);
		contenedor.add(valor1);
		lblNum2 = new JLabel("Número 2");
		contenedor.add(lblNum2);
		valor2 = new JTextField(10);
		contenedor.add(valor2);
		
		btnSuma = new JButton("+");
		contenedor.add(btnSuma);
		btnSuma.addActionListener(this);
		btnResta = new JButton("-");
		contenedor.add(btnResta);
		btnResta.addActionListener(this);
		btnMulti = new JButton("x");
		contenedor.add(btnMulti);
		btnMulti.addActionListener(this);
		btnDiv = new JButton("/");
		contenedor.add(btnDiv);
		btnDiv.addActionListener(this);
		btnRaiz = new JButton("¹");
		contenedor.add(btnRaiz);
		btnRaiz.addActionListener(this);
		btnPotencia = new JButton("^");
		contenedor.add(btnPotencia);
		btnPotencia.addActionListener(this);
		
		campoResultado = new JTextField(10);
		contenedor.add(campoResultado);
		btnLimpiar = new JButton("Limpiar");
		contenedor.add(btnLimpiar);
		btnLimpiar.addActionListener(this);
		btnSalir = new JButton("Salir");
		contenedor.add(btnSalir);
		btnSalir.addActionListener(this);
	}

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
		
		super("Principal");
		
		controles();
		
		setSize(380,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnSuma) {
			resultado = (validarDatos(1))?sumar():"0";
			campoResultado.setText(resultado);
		} else if(e.getSource() == btnResta) {
			resultado = (validarDatos(1))?restar():"0";
			campoResultado.setText(resultado);
		} else if(e.getSource() == btnMulti) {
			resultado = (validarDatos(1))?multiplicar():"0";
			campoResultado.setText(resultado);
		} else if(e.getSource() == btnDiv) {
			resultado = (validarDatos(1))?dividir():"0";
			campoResultado.setText(resultado);
		} else if(e.getSource() == btnRaiz) {
			resultado = (validarDatos(2))?raiz():"0";
			campoResultado.setText(resultado);
		} else if(e.getSource() == btnPotencia) {
			resultado = (validarDatos(1))?potencia():"0";
			campoResultado.setText(resultado);
		} else if(e.getSource() == btnLimpiar) {
			valor1.setText("");
			valor2.setText("");
			campoResultado.setText("");
		} else if(e.getSource() == btnSalir) {
			System.exit(0);
		}
		
	}

	private String potencia() {
		num1 = Double.parseDouble(valor1.getText());
		num2 = Double.parseDouble(valor2.getText());
		result = Math.pow(num1, num2);
		return String.valueOf(result);
	}

	private String raiz() {
		num1 = Double.parseDouble(valor1.getText());
		result = Math.sqrt(num1);
		resultado = String.valueOf(result);
		return (resultado.length()>10)?resultado.substring(0, resultado.indexOf(".")+6):resultado;
	}

	private String dividir() {
		num1 = Double.parseDouble(valor1.getText());
		num2 = Double.parseDouble(valor2.getText());
		result = num1 / num2;
		resultado = String.valueOf(result);
		return (resultado.length()>10)?resultado.substring(0, resultado.indexOf(".")+6):resultado;
	}

	private String multiplicar() {
		num1 = Double.parseDouble(valor1.getText());
		num2 = Double.parseDouble(valor2.getText());
		result = num1 * num2;
		return String.valueOf(result);
	}

	private String restar() {
		num1 = Double.parseDouble(valor1.getText());
		num2 = Double.parseDouble(valor2.getText());
		result = num1 - num2;
		return String.valueOf(result);
	}

	private String sumar() {
		num1 = Double.parseDouble(valor1.getText());
		num2 = Double.parseDouble(valor2.getText());
		result = num1 + num2;
		return String.valueOf(result);
	}

	private boolean validarDatos(int caso) {
		boolean esValido = true;
		switch(caso) {
		case 1:
			if(valor1.getText().equals("")||valor2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "¡Debe de completar todos los datos!", "Error", JOptionPane.ERROR_MESSAGE);
				esValido = false;
			}
			if(valor1.getText().equals("")||valor2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "¡No se puede dividir entre 0!", "Error", JOptionPane.ERROR_MESSAGE);
				esValido = false;
			}
			break;
		case 2:
			if(valor1.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Para calcular una raíz cuadrada debe ingresar el número 1", "Error", JOptionPane.ERROR_MESSAGE);
				esValido = false;
			}
			if(Double.parseDouble(valor1.getText()) < 0) {
				JOptionPane.showMessageDialog(null, "Solo se puede calcular la raíz cudrada de números positivos", "Error", JOptionPane.ERROR_MESSAGE);
				esValido = false;
			}
		}
		
		return esValido;
	}

}
