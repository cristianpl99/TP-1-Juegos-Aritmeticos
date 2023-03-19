package tp.igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tp.logica.ElementosJuego;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class Fin extends JFrame {

	private JPanel contentPane;

	public Fin(String nombre, int tiempo) {
		setTitle("Gracias por jugar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGanaste = new JLabel("GANASTE");
		lblGanaste.setForeground(new Color(255, 0, 0));
		lblGanaste.setHorizontalAlignment(SwingConstants.CENTER);
		lblGanaste.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblGanaste.setBounds(132, 83, 165, 30);
		contentPane.add(lblGanaste);
		
		JLabel lblNombre = new JLabel(nombre);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNombre.setBounds(122, 42, 191, 30);
		lblNombre.setText(nombre);
		contentPane.add(lblNombre);
		
		JLabel lblTiempo = new JLabel("TU TIEMPO FUE DE " + tiempo + " segundos");
		lblTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiempo.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTiempo.setBounds(0, 160, 424, 30);
		contentPane.add(lblTiempo);
	}
}
