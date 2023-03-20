package tp.igu;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.Timer;

import tp.logica.ElementosJuego;
import tp.logica.Controladora;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import java.awt.Panel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JuegoAritmetico extends JFrame {

	private JPanel contentPane;
	private JTextField textA1;
	private JTextField textA2;
	private JTextField textA3;
	private JTextField textA4;
	private JTextField textB1;
	private JTextField textB2;
	private JTextField textB3;
	private JTextField textB4;
	private JTextField textC1;
	private JTextField textC2;
	private JTextField textC3;
	private JTextField textC4;
	private JTextField textD1;
	private JTextField textD2;
	private JTextField textD3;
	private JTextField textD4;

	private Timer timer = null;

	private Panel panel_0;
	private Panel panel_1;
	private Panel panel_2;
	private Panel panel_3;
	private Panel panel_5;
	private Panel panel_6;
	private Panel panel_4;
	private Panel panel_7;

	public JuegoAritmetico(String nombre) {

		setTitle("Programacion III - Juego Aritmetico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 556);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// inicio una instancia del objeto Controladora
		Controladora control = new Controladora(4, 4);

		textA1 = new JTextField();
		validarEntrada(textA1);
		textA1.setHorizontalAlignment(SwingConstants.CENTER);
		textA1.setFont(new Font("Tahoma", Font.BOLD, 25));
		textA1.setBounds(101, 69, 50, 43);
		contentPane.add(textA1);
		textA1.setColumns(10);

		textA2 = new JTextField();
		validarEntrada(textA2);
		textA2.setHorizontalAlignment(SwingConstants.CENTER);
		textA2.setFont(new Font("Tahoma", Font.BOLD, 25));
		textA2.setColumns(10);
		textA2.setBounds(200, 69, 50, 43);
		contentPane.add(textA2);

		textA3 = new JTextField();
		validarEntrada(textA3);
		textA3.setHorizontalAlignment(SwingConstants.CENTER);
		textA3.setFont(new Font("Tahoma", Font.BOLD, 25));
		textA3.setColumns(10);
		textA3.setBounds(300, 69, 50, 43);
		contentPane.add(textA3);

		textA4 = new JTextField();
		validarEntrada(textA4);
		textA4.setHorizontalAlignment(SwingConstants.CENTER);
		textA4.setFont(new Font("Tahoma", Font.BOLD, 25));
		textA4.setColumns(10);
		textA4.setBounds(400, 69, 50, 43);
		contentPane.add(textA4);

		textB1 = new JTextField();
		validarEntrada(textB1);
		textB1.setHorizontalAlignment(SwingConstants.CENTER);
		textB1.setFont(new Font("Tahoma", Font.BOLD, 25));
		textB1.setColumns(10);
		textB1.setBounds(101, 170, 50, 43);
		contentPane.add(textB1);

		textB2 = new JTextField();
		validarEntrada(textB2);
		textB2.setHorizontalAlignment(SwingConstants.CENTER);
		textB2.setFont(new Font("Tahoma", Font.BOLD, 25));
		textB2.setColumns(10);
		textB2.setBounds(200, 170, 50, 43);
		contentPane.add(textB2);

		textB3 = new JTextField();
		validarEntrada(textB3);
		textB3.setHorizontalAlignment(SwingConstants.CENTER);
		textB3.setFont(new Font("Tahoma", Font.BOLD, 25));
		textB3.setColumns(10);
		textB3.setBounds(300, 170, 50, 43);
		contentPane.add(textB3);

		textB4 = new JTextField();
		validarEntrada(textB4);
		textB4.setHorizontalAlignment(SwingConstants.CENTER);
		textB4.setFont(new Font("Tahoma", Font.BOLD, 25));
		textB4.setColumns(10);
		textB4.setBounds(400, 170, 50, 43);
		contentPane.add(textB4);

		textC1 = new JTextField();
		validarEntrada(textC1);
		textC1.setHorizontalAlignment(SwingConstants.CENTER);
		textC1.setFont(new Font("Tahoma", Font.BOLD, 25));
		textC1.setColumns(10);
		textC1.setBounds(101, 269, 50, 43);
		contentPane.add(textC1);

		textC2 = new JTextField();
		validarEntrada(textC2);
		textC2.setHorizontalAlignment(SwingConstants.CENTER);
		textC2.setFont(new Font("Tahoma", Font.BOLD, 25));
		textC2.setColumns(10);
		textC2.setBounds(200, 269, 50, 43);
		contentPane.add(textC2);

		textC3 = new JTextField();
		validarEntrada(textC3);
		textC3.setHorizontalAlignment(SwingConstants.CENTER);
		textC3.setFont(new Font("Tahoma", Font.BOLD, 25));
		textC3.setColumns(10);
		textC3.setBounds(300, 269, 50, 43);
		contentPane.add(textC3);

		textC4 = new JTextField();
		validarEntrada(textC4);
		textC4.setHorizontalAlignment(SwingConstants.CENTER);
		textC4.setFont(new Font("Tahoma", Font.BOLD, 25));
		textC4.setColumns(10);
		textC4.setBounds(400, 269, 50, 43);
		contentPane.add(textC4);

		textD1 = new JTextField();
		validarEntrada(textD1);
		textD1.setHorizontalAlignment(SwingConstants.CENTER);
		textD1.setFont(new Font("Tahoma", Font.BOLD, 25));
		textD1.setColumns(10);
		textD1.setBounds(101, 369, 50, 43);
		contentPane.add(textD1);

		textD2 = new JTextField();
		validarEntrada(textD2);
		textD2.setHorizontalAlignment(SwingConstants.CENTER);
		textD2.setFont(new Font("Tahoma", Font.BOLD, 25));
		textD2.setColumns(10);
		textD2.setBounds(200, 369, 50, 43);
		contentPane.add(textD2);

		textD3 = new JTextField();
		validarEntrada(textD3);
		textD3.setHorizontalAlignment(SwingConstants.CENTER);
		textD3.setFont(new Font("Tahoma", Font.BOLD, 25));
		textD3.setColumns(10);
		textD3.setBounds(300, 369, 50, 43);
		contentPane.add(textD3);

		textD4 = new JTextField();
		validarEntrada(textD4);
		textD4.setHorizontalAlignment(SwingConstants.CENTER);
		textD4.setFont(new Font("Tahoma", Font.BOLD, 25));
		textD4.setColumns(10);
		textD4.setBounds(400, 369, 50, 43);
		contentPane.add(textD4);

		JLabel lblA = new JLabel(String.valueOf(control.getFilaResul()[0]));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblA.setBounds(498, 67, 46, 43);
		contentPane.add(lblA);

		JLabel lblB = new JLabel(String.valueOf(control.getFilaResul()[1]));
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblB.setBounds(498, 170, 46, 43);
		contentPane.add(lblB);

		JLabel lblC = new JLabel(String.valueOf(control.getFilaResul()[2]));
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblC.setBounds(498, 269, 46, 43);
		contentPane.add(lblC);

		JLabel lblD = new JLabel(String.valueOf(control.getFilaResul()[3]));
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblD.setBounds(498, 369, 46, 43);
		contentPane.add(lblD);

		JLabel lbl1 = new JLabel(String.valueOf(control.getColumResul()[0]));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl1.setBounds(101, 463, 46, 43);
		contentPane.add(lbl1);

		JLabel lbl2 = new JLabel(String.valueOf(control.getColumResul()[1]));
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl2.setBounds(204, 463, 46, 43);
		contentPane.add(lbl2);

		JLabel lbl3 = new JLabel(String.valueOf(control.getColumResul()[2]));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl3.setBounds(304, 463, 46, 43);
		contentPane.add(lbl3);

		JLabel lbl4 = new JLabel(String.valueOf(control.getColumResul()[3]));
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl4.setBounds(404, 463, 46, 43);
		contentPane.add(lbl4);

		JLabel lblNewLabel = new JLabel("TIEMPO :");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 11, 137, 34);
		contentPane.add(lblNewLabel);

		JLabel lblTiempo = new JLabel("0");
		lblTiempo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTiempo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTiempo.setForeground(new Color(255, 0, 0));
		lblTiempo.setBounds(142, 12, 123, 33);
		contentPane.add(lblTiempo);

		panel_0 = new Panel();
		panel_0.setBackground(new Color(255, 0, 0));
		panel_0.setBounds(80, 51, 388, 76);
		contentPane.add(panel_0);

		panel_1 = new Panel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(80, 152, 388, 76);
		contentPane.add(panel_1);

		panel_2 = new Panel();
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(80, 253, 388, 76);
		contentPane.add(panel_2);

		panel_3 = new Panel();
		panel_3.setBackground(Color.RED);
		panel_3.setBounds(80, 353, 388, 76);
		contentPane.add(panel_3);

		panel_4 = new Panel();
		panel_4.setBackground(Color.RED);
		panel_4.setBounds(80, 51, 87, 377);
		contentPane.add(panel_4);

		panel_5 = new Panel();
		panel_5.setBackground(Color.RED);
		panel_5.setBounds(181, 51, 87, 377);
		contentPane.add(panel_5);

		panel_6 = new Panel();
		panel_6.setBackground(Color.RED);
		panel_6.setBounds(281, 51, 87, 377);
		contentPane.add(panel_6);

		panel_7 = new Panel();
		panel_7.setBackground(Color.RED);
		panel_7.setBounds(382, 51, 87, 377);
		contentPane.add(panel_7);

		// Aux para ver el fin
		JButton btnCheat = new JButton("CHEAT");
		btnCheat.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dispose();
				Fin fin = new Fin(nombre, Integer.parseInt(lblTiempo.getText()));
				timer.stop();
				fin.setVisible(true);
			}
		});
		btnCheat.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCheat.setBounds(494, 463, 89, 23);
		contentPane.add(btnCheat);

		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblTiempo.setText(String.valueOf(Integer.parseInt(lblTiempo.getText()) + 1));

				control.ingresoDeResultados(0, 0, textA1.getText().equals("") ? 0 : Integer.parseInt(textA1.getText()));
				control.ingresoDeResultados(0, 1, textA2.getText().equals("") ? 0 : Integer.parseInt(textA2.getText()));
				control.ingresoDeResultados(0, 2, textA3.getText().equals("") ? 0 : Integer.parseInt(textA3.getText()));
				control.ingresoDeResultados(0, 3, textA4.getText().equals("") ? 0 : Integer.parseInt(textA4.getText()));
				control.ingresoDeResultados(1, 0, textB1.getText().equals("") ? 0 : Integer.parseInt(textB1.getText()));
				control.ingresoDeResultados(1, 1, textB2.getText().equals("") ? 0 : Integer.parseInt(textB2.getText()));
				control.ingresoDeResultados(1, 2, textB3.getText().equals("") ? 0 : Integer.parseInt(textB3.getText()));
				control.ingresoDeResultados(1, 3, textB4.getText().equals("") ? 0 : Integer.parseInt(textB4.getText()));
				control.ingresoDeResultados(2, 0, textC1.getText().equals("") ? 0 : Integer.parseInt(textC1.getText()));
				control.ingresoDeResultados(2, 1, textC2.getText().equals("") ? 0 : Integer.parseInt(textC2.getText()));
				control.ingresoDeResultados(2, 2, textC3.getText().equals("") ? 0 : Integer.parseInt(textC3.getText()));
				control.ingresoDeResultados(2, 3, textC4.getText().equals("") ? 0 : Integer.parseInt(textC4.getText()));
				control.ingresoDeResultados(3, 0, textD1.getText().equals("") ? 0 : Integer.parseInt(textD1.getText()));
				control.ingresoDeResultados(3, 1, textD2.getText().equals("") ? 0 : Integer.parseInt(textD2.getText()));
				control.ingresoDeResultados(3, 2, textD3.getText().equals("") ? 0 : Integer.parseInt(textD3.getText()));
				control.ingresoDeResultados(3, 3, textD4.getText().equals("") ? 0 : Integer.parseInt(textD4.getText()));
				control.actualizarEstado();

				ArrayList<Boolean> filasCompletas = control.filasCompletas();

				for (int i = 0; i < filasCompletas.size(); i++) {
					if (i == 0 && filasCompletas.get(i) == true)
						panel_0.setBackground(new Color(0, 255, 0));

					if (i == 0 && filasCompletas.get(i) == false)
						panel_0.setBackground(new Color(255, 0, 0));

					if (i == 1 && filasCompletas.get(i) == true)
						panel_1.setBackground(new Color(0, 255, 0));

					if (i == 1 && filasCompletas.get(i) == false)
						panel_1.setBackground(new Color(255, 0, 0));

					if (i == 2 && filasCompletas.get(i) == true)
						panel_2.setBackground(new Color(0, 255, 0));

					if (i == 2 && filasCompletas.get(i) == false)
						panel_2.setBackground(new Color(255, 0, 0));

					if (i == 3 && filasCompletas.get(i) == true)
						panel_3.setBackground(new Color(0, 255, 0));

					if (i == 3 && filasCompletas.get(i) == false)
						panel_3.setBackground(new Color(255, 0, 0));
				}

				ArrayList<Boolean> columnasCompletas = control.columnasCompletas();

				for (int i = 0; i < filasCompletas.size(); i++) {
					if (i == 0 && columnasCompletas.get(i) == true)
						panel_4.setBackground(new Color(0, 255, 0));

					if (i == 0 && columnasCompletas.get(i) == false)
						panel_4.setBackground(new Color(255, 0, 0));

					if (i == 1 && columnasCompletas.get(i) == true)
						panel_5.setBackground(new Color(0, 255, 0));

					if (i == 1 && columnasCompletas.get(i) == false)
						panel_5.setBackground(new Color(255, 0, 0));

					if (i == 2 && columnasCompletas.get(i) == true)
						panel_6.setBackground(new Color(0, 255, 0));

					if (i == 2 && columnasCompletas.get(i) == false)
						panel_6.setBackground(new Color(255, 0, 0));

					if (i == 3 && columnasCompletas.get(i) == true)
						panel_7.setBackground(new Color(0, 255, 0));

					if (i == 3 && columnasCompletas.get(i) == false)
						panel_7.setBackground(new Color(255, 0, 0));
				}

				if (control.completoJuego()) {
					dispose();
					Fin fin = new Fin(nombre, Integer.parseInt(lblTiempo.getText()));
					timer.stop();
					fin.setVisible(true);
				}
			}
		});
		timer.start();
	}

	private void validarEntrada(JTextField textA1) {
		textA1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
				boolean numeros = key >= 48 && key <= 57;

				if (!numeros) {
					e.consume();
				}

				if (key < 0 && e.getKeyChar() > 30 || textA1.getText().trim().length() == 2) {
					e.consume();
				}
			}
		});
	}

}
