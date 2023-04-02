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

import tp.logica.JuegoAritmetico;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PantallaJuego extends JFrame {

	private JPanel contentPane;
	private JTextField[][] matrizDeJTextFields;
	private Timer timer = null;

	public PantallaJuego(String nombre, int matSize, int dimensionVentana, String nivel) {

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
		JuegoAritmetico juego = new JuegoAritmetico(matSize, matSize);

		// creacion auto de la matriz visual
		matrizDeJTextFields = new JTextField[matSize][matSize];

		int posicionHorizontalDelJText = 100;
		int posicionVerticalDelJText = 70;
		for (int i = 0; i < matSize; i++) {
			for (int j = 0; j < matSize; j++) {
				JTextField textField = new JTextField();
				validarEntrada(textField);
				textField.setHorizontalAlignment(SwingConstants.CENTER);
				textField.setFont(new Font("Tahoma", Font.BOLD, 25));
				textField.setBounds(posicionHorizontalDelJText, posicionVerticalDelJText, 50, 43);
				contentPane.add(textField);
				textField.setColumns(10);
				matrizDeJTextFields[i][j] = textField;
				posicionHorizontalDelJText = posicionHorizontalDelJText + 100;
			}
			posicionVerticalDelJText = posicionVerticalDelJText + 100;
			posicionHorizontalDelJText = 100;
		}

		// creacion automatica de los labels de resultados de cada fila y columna
		int xLblResultado = matrizDeJTextFields.length * 100 + 75;
		int yLblResultado = matrizDeJTextFields[0].length * 100 + 35;
		int anchoLabelResultado = 45;
		int altoLabelResultado = 45;

		for (int i = 0; i < matSize; i++) {
			JLabel lblResultado = new JLabel(String.valueOf(juego.getFilaResul(i)));
			lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
			lblResultado.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblResultado.setBounds(xLblResultado, 70 + i * 100, anchoLabelResultado, altoLabelResultado);
			contentPane.add(lblResultado);
		}

		for (int i = 0; i < matSize; i++) {
			JLabel lblResultado = new JLabel(String.valueOf(juego.getColumResul(i)));
			lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
			lblResultado.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblResultado.setBounds(100 + i * 100, yLblResultado, anchoLabelResultado, altoLabelResultado);
			contentPane.add(lblResultado);
		}

		// labels del tiempo de juego
		JLabel lblTextoTiempo = new JLabel("TIEMPO :");
		lblTextoTiempo.setForeground(new Color(0, 0, 0));
		lblTextoTiempo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTextoTiempo.setBounds(10, 10, 137, 34);
		contentPane.add(lblTextoTiempo);

		JLabel lblTiempo = new JLabel("10 min : 00 seg");
		lblTiempo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTiempo.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTiempo.setForeground(new Color(0, 0, 0));
		lblTiempo.setBounds(140, 10, 298, 33);
		contentPane.add(lblTiempo);

		// creacion automatica de los paneles de chequeo de cada fila y columna
		int xPanelChequeo = matrizDeJTextFields.length * 100 + 125;
		int yPanelChequeo = matrizDeJTextFields[0].length * 100 + 80;
		int panelChequeoAncho = 50;
		int panelChequeoAlto = 43;

		Panel[] panelesDeChequeoDeFilas = new Panel[matSize];
		for (int i = 0; i < matSize; i++) {
			panelesDeChequeoDeFilas[i] = new Panel();
			panelesDeChequeoDeFilas[i].setBackground(Color.RED);
			panelesDeChequeoDeFilas[i].setBounds(xPanelChequeo, 70 + (i * 100), panelChequeoAncho, panelChequeoAlto);
			contentPane.add(panelesDeChequeoDeFilas[i]);
		}

		Panel[] panelesDeChequeoDeColumnas = new Panel[matSize];
		for (int i = 0; i < matSize; i++) {
			panelesDeChequeoDeColumnas[i] = new Panel();
			panelesDeChequeoDeColumnas[i].setBackground(Color.RED);
			panelesDeChequeoDeColumnas[i].setBounds(100 + (i * 100), yPanelChequeo, panelChequeoAncho,
					panelChequeoAlto);
			contentPane.add(panelesDeChequeoDeColumnas[i]);
		}

		// timer tick por segundo
		timer = new Timer(1000, new ActionListener() {
			int segundos = 600;

			@Override
			public void actionPerformed(ActionEvent e) {
				segundos -= 1;
				lblTiempo.setText(String.valueOf(convertirAMinutosSegundos(segundos)));
				for (int i = 0; i < matSize; i++) {
					for (int j = 0; j < matSize; j++) {
						JTextField textField = matrizDeJTextFields[i][j];
						int valor = textField.getText().equals("") ? 0 : Integer.parseInt(textField.getText());
						juego.ingresoDeResultados(i, j, valor);
					}
				}
				juego.actualizarEstadosFilaYColum();

				// chequeos de filas y colum para cambiar colores
				ArrayList<Boolean> filasCompletas = juego.filasCompletas();
				for (int i = 0; i < filasCompletas.size(); i++) {
					Color colorDelChequeo = filasCompletas.get(i) ? new Color(0, 255, 0) : new Color(255, 0, 0);
					panelesDeChequeoDeFilas[i].setBackground(colorDelChequeo);
				}

				ArrayList<Boolean> columnasCompletas = juego.columnasCompletas();
				for (int i = 0; i < filasCompletas.size(); i++) {
					boolean columnaCompleta = columnasCompletas.get(i);
					Color colorDelChequeo = columnaCompleta ? new Color(0, 255, 0) : new Color(255, 0, 0);
					panelesDeChequeoDeColumnas[i].setBackground(colorDelChequeo);
				}

				if (juego.completoJuego() || segundos == 0) {
					dispose();
					timer.stop();
					// calculo el tiempo que jugó
					int tiempoDeJuego = 600 - segundos;
					// segundos los pasa para calcular el puntaje. el otro parametro es el tiempo
					// que jugó el jugador
					Fin fin = new Fin(nombre, segundos, String.valueOf(convertirAMinutosSegundos(tiempoDeJuego)),
							nivel);
					fin.setResizable(false);
					fin.setVisible(true);
				}
			}

		});
		timer.start();
	}

	// Metodos Auxiliares
	private String convertirAMinutosSegundos(int segundos) {
		int minutos = segundos / 60;
		int segundosRestantes = segundos % 60;
		return minutos + " min : " + segundosRestantes + " seg";
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
