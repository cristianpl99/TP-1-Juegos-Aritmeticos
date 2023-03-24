package tp.igu;

import java.awt.Color;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.Timer;

import tp.logica.Logica;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Juego extends JFrame {

	private JPanel contentPane;
	private JTextField[][] matrizText;
	private Timer timer = null;

	public Juego(String nombre, int matSize, int dimensionVentana) {

		setTitle("Programacion III - Juego Aritmetico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, dimensionVentana, dimensionVentana);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// inicio una instancia del objeto Controladora
		Logica control = new Logica(matSize, matSize);

		// creacion auto de la matriz visual
		matrizText = new JTextField[matSize][matSize];

		int y = 70;
		int x = 100;
		for (int i = 0; i < matSize; i++) {
			for (int j = 0; j < matSize; j++) {
				JTextField text = new JTextField();
				validarEntrada(text);
				text.setHorizontalAlignment(SwingConstants.CENTER);
				text.setFont(new Font("Tahoma", Font.BOLD, 25));
				text.setBounds(x, y, 50, 43);
				contentPane.add(text);
				text.setColumns(10);
				matrizText[i][j] = text;
				x = x + 100;
			}
			y = y + 100;
			x = 100;
		}

		int xResultados = matrizText.length * 100 + 75;
		int yResultados = matrizText[0].length * 100 + 35;
		int anchoLabel = 45;
		int altoLabel = 45;

		for (int i = 0; i < matSize; i++) {
			JLabel lbl = new JLabel(String.valueOf(control.getFilaResul(i)));
			lbl.setHorizontalAlignment(SwingConstants.CENTER);
			lbl.setFont(new Font("Tahoma", Font.BOLD, 25));
			lbl.setBounds(xResultados, 70 + i * 100, anchoLabel, altoLabel);
			contentPane.add(lbl);
		}

		for (int i = 0; i < matSize; i++) {
			JLabel lbl = new JLabel(String.valueOf(control.getColumResul(i)));
			lbl.setHorizontalAlignment(SwingConstants.CENTER);
			lbl.setFont(new Font("Tahoma", Font.BOLD, 25));
			lbl.setBounds(100 + i * 100, yResultados, anchoLabel, altoLabel);
			contentPane.add(lbl);
		}

		JLabel lblNewLabel = new JLabel("TIEMPO :");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 10, 137, 34);
		contentPane.add(lblNewLabel);

		JLabel lblTiempo = new JLabel("0");
		lblTiempo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTiempo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTiempo.setForeground(new Color(255, 0, 0));
		lblTiempo.setBounds(140, 10, 123, 33);
		contentPane.add(lblTiempo);

		int xPanel = matrizText.length * 100 + 125;
		int yPanel = matrizText[0].length * 100 + 80;
		int panelAncho = 50;
		int panelAlto = 43;

		Panel[] panelesFilas = new Panel[matSize];
		for (int i = 0; i < matSize; i++) {
			panelesFilas[i] = new Panel();
			panelesFilas[i].setBackground(Color.RED);
			panelesFilas[i].setBounds(xPanel, 70 + (i * 100), panelAncho, panelAlto);
			contentPane.add(panelesFilas[i]);
		}

		Panel[] panelesColum = new Panel[matSize];
		for (int i = 0; i < matSize; i++) {
			panelesColum[i] = new Panel();
			panelesColum[i].setBackground(Color.RED);
			panelesColum[i].setBounds(100 + (i * 100), yPanel, panelAncho, panelAlto);
			contentPane.add(panelesColum[i]);
		}

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
				for (int i = 0; i < matSize; i++) {
					for (int j = 0; j < matSize; j++) {
						JTextField textField = matrizText[i][j];
						int valor = textField.getText().equals("") ? 0 : Integer.parseInt(textField.getText());
						control.ingresoDeResultados(i, j, valor);
					}
				}
				control.actualizarEstado();

				ArrayList<Boolean> filasCompletas = control.filasCompletas();

				for (int i = 0; i < filasCompletas.size(); i++) {
					Color color = filasCompletas.get(i) ? new Color(0, 255, 0) : new Color(255, 0, 0);
					panelesFilas[i].setBackground(color);
				}

				ArrayList<Boolean> columnasCompletas = control.columnasCompletas();

				for (int i = 0; i < filasCompletas.size(); i++) {
					boolean columnaCompleta = columnasCompletas.get(i);
					Color color = columnaCompleta ? new Color(0, 255, 0) : new Color(255, 0, 0);
					panelesColum[i].setBackground(color);
				}

				if (control.completoJuego()) {
					dispose();
					Fin fin = new Fin(nombre, Integer.parseInt(lblTiempo.getText()));
					timer.stop();
					fin.setResizable(false);
					fin.setVisible(true);
				}
			}
		});
		timer.start();
	}

	private void validarEntrada(JTextField jText) {
		jText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
				boolean numeros = key >= 48 && key <= 57;

				if (!numeros || jText.getText().trim().length() == 2) {
					e.consume();
				}
				if (key == 48 && jText.getText().trim().length() == 0) {
					e.consume();
				}
			}
		});
	}

}
