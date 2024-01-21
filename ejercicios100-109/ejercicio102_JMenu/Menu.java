package ejercicio102_JMenu;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

public class Menu extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JMenuBar barra;
	private JMenu archivo, editar, color, tamano, ayuda;
	private JMenuItem abrir, salir, guardar, acerca, fondoRojo, fondoAzul, fondoVerde, fondoGris, ventana, cuadro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		JFrame.setDefaultLookAndFeelDecorated(true);
		Menu menu = new Menu();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	/**
	 * Create the frame.
	 */
	public Menu() {

		super("Menú");
		barra = new JMenuBar();
		archivo = new JMenu("Archivo");
		ayuda = new JMenu("Ayuda");
		editar = new JMenu("Editar");
		color = new JMenu("Color de fondo");
		tamano = new JMenu("Tamaño de la ventana");
		abrir = new JMenuItem("Abrir");
		salir = new JMenuItem("Salir");
		guardar = new JMenuItem("Guardar");
		acerca = new JMenuItem("Acerca de");
		fondoAzul = new JMenuItem("Azul");
		fondoGris = new JMenuItem("Gris");
		fondoRojo = new JMenuItem("Rojo");
		fondoVerde = new JMenuItem("Verde");
		ventana = new JMenuItem("300x200");
		cuadro = new JMenuItem("400x400");

		barra.add(archivo);
		barra.add(editar);
		barra.add(ayuda);
		archivo.add(abrir);
		archivo.add(guardar);
		archivo.add(salir);
		editar.add(color);
		editar.add(tamano);
		color.add(fondoAzul);
		color.add(fondoGris);
		color.add(fondoRojo);
		color.add(fondoVerde);
		tamano.add(ventana);
		tamano.add(cuadro);
		ayuda.add(acerca);

		fondoAzul.addActionListener(this);
		fondoGris.addActionListener(this);
		fondoRojo.addActionListener(this);
		fondoVerde.addActionListener(this);
		cuadro.addActionListener(this);
		ventana.addActionListener(this);

		this.add(barra);
		setJMenuBar(barra);

		setSize(380, 200);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Container f = this.getContentPane();
		if (e.getSource() == fondoAzul) {
			f.setBackground(new Color(155, 184, 205));
		}
		if (e.getSource() == fondoGris) {
			f.setBackground(new Color(229, 225, 218));
		}
		if (e.getSource() == fondoRojo) {
			f.setBackground(new Color(239, 149, 149));
		}
		if (e.getSource() == fondoVerde) {
			f.setBackground(new Color(212, 231, 197));
		}
		if (e.getSource() == ventana) {
			setSize(300, 200);
		}
		if (e.getSource() == cuadro) {
			setSize(400, 400);
		}
	}

}
