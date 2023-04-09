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

import tp.logic.ArithmeticGame;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameScreen extends JFrame {

	private JPanel contentPane;
	private JTextField[][] JTextFieldsMat;
	private Timer timer = null;

	public GameScreen(String nombre, int matSize, int dimensionVentana, String nivel) {

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
		ArithmeticGame arithmeticGame = new ArithmeticGame(matSize, matSize);

		// creacion auto de la matriz visual
		JTextFieldsMat = new JTextField[matSize][matSize];

		int JTextHorizontalPosition = 100;
		int JTextVerticalPosition = 70;
		for (int i = 0; i < matSize; i++) {
			for (int j = 0; j < matSize; j++) {
				JTextField textField = new JTextField();
				entryValidation(textField);
				textField.setHorizontalAlignment(SwingConstants.CENTER);
				textField.setFont(new Font("Tahoma", Font.BOLD, 25));
				textField.setBounds(JTextHorizontalPosition, JTextVerticalPosition, 50, 43);
				contentPane.add(textField);
				textField.setColumns(10);
				JTextFieldsMat[i][j] = textField;
				JTextHorizontalPosition = JTextHorizontalPosition + 100;
			}
			JTextVerticalPosition = JTextVerticalPosition + 100;
			JTextHorizontalPosition = 100;
		}

		// creacion automatica de los labels de resultados de cada fila y columna
		int lblResultX = JTextFieldsMat.length * 100 + 75;
		int lblResultY = JTextFieldsMat[0].length * 100 + 35;
		int lblResultWidth = 45;
		int lblResultHeight = 45;

		for (int i = 0; i < matSize; i++) {
			JLabel lblResult = new JLabel(String.valueOf(arithmeticGame.getRowResults(i)));
			lblResult.setHorizontalAlignment(SwingConstants.CENTER);
			lblResult.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblResult.setBounds(lblResultX, 70 + i * 100, lblResultWidth, lblResultHeight);
			contentPane.add(lblResult);
		}

		for (int i = 0; i < matSize; i++) {
			JLabel lblResult = new JLabel(String.valueOf(arithmeticGame.getColumResults(i)));
			lblResult.setHorizontalAlignment(SwingConstants.CENTER);
			lblResult.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblResult.setBounds(100 + i * 100, lblResultY, lblResultWidth, lblResultHeight);
			contentPane.add(lblResult);
		}

		// labels del tiempo de juego
		JLabel lblTimetxt = new JLabel("TIEMPO :");
		lblTimetxt.setForeground(new Color(0, 0, 0));
		lblTimetxt.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTimetxt.setBounds(10, 10, 137, 34);
		contentPane.add(lblTimetxt);

		JLabel lblTime = new JLabel("10 min : 00 seg");
		lblTime.setHorizontalAlignment(SwingConstants.LEFT);
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTime.setForeground(new Color(0, 0, 0));
		lblTime.setBounds(140, 10, 298, 33);
		contentPane.add(lblTime);

		// creacion automatica de los paneles de chequeo de cada fila y columna
		int xPanelCheck = JTextFieldsMat.length * 100 + 125;
		int yPanelCheck = JTextFieldsMat[0].length * 100 + 80;
		int checkPanelWidth = 50;
		int checkPanelHeight = 43;

		Panel[] rowCheckPanels = new Panel[matSize];
		for (int i = 0; i < matSize; i++) {
			rowCheckPanels[i] = new Panel();
			rowCheckPanels[i].setBackground(Color.RED);
			rowCheckPanels[i].setBounds(xPanelCheck, 70 + (i * 100), checkPanelWidth, checkPanelHeight);
			contentPane.add(rowCheckPanels[i]);
		}

		Panel[] columnCheckPanels = new Panel[matSize];
		for (int i = 0; i < matSize; i++) {
			columnCheckPanels[i] = new Panel();
			columnCheckPanels[i].setBackground(Color.RED);
			columnCheckPanels[i].setBounds(100 + (i * 100), yPanelCheck, checkPanelWidth, checkPanelHeight);
			contentPane.add(columnCheckPanels[i]);
		}

		// timer tick por segundo
		timer = new Timer(1000, new ActionListener() {
			int seconds = 600;

			@Override
			public void actionPerformed(ActionEvent e) {
				seconds -= 1;
				lblTime.setText(String.valueOf(convertToTimeFormat(seconds)));
				for (int i = 0; i < matSize; i++) {
					for (int j = 0; j < matSize; j++) {
						JTextField textField = JTextFieldsMat[i][j];
						int valor = textField.getText().equals("") ? 0 : Integer.parseInt(textField.getText());
						arithmeticGame.enterResults(i, j, valor);
					}
				}
				
				arithmeticGame.updateMatStatus();

				// chequeos de filas y colum para cambiar colores
				ArrayList<Boolean> completedRows = arithmeticGame.completedRows();
				for (int i = 0; i < completedRows.size(); i++) {
					Color checkColor = completedRows.get(i) ? new Color(0, 255, 0) : new Color(255, 0, 0);
					rowCheckPanels[i].setBackground(checkColor);
				}

				ArrayList<Boolean> completedColumns = arithmeticGame.completeColumns();
				for (int i = 0; i < completedRows.size(); i++) {
					boolean completedColumn = completedColumns.get(i);
					Color checkColor = completedColumn ? new Color(0, 255, 0) : new Color(255, 0, 0);
					columnCheckPanels[i].setBackground(checkColor);
				}
				//chequeo final de fin de juego para continuar o no.
				if (arithmeticGame.isGameComplete() || seconds == 0) {
					dispose();
					timer.stop();
					// calculo el tiempo que jugó
					int timePlayed = 600 - seconds;
					// segundos los pasa para calcular el puntaje. el otro parametro es el tiempo
					// que jugó el jugador
					FinalScreen fin = new FinalScreen(nombre, seconds, String.valueOf(convertToTimeFormat(timePlayed)),
							nivel);
					fin.setResizable(false);
					fin.setVisible(true);
				}
			}

		});
		timer.start();
	}

	//metodos auxiliares
	//conversor para el contador de tiempo a minutos/segundos
	private String convertToTimeFormat(int seconds) {
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		return minutes + " min : " + remainingSeconds + " seg";
	}
	//validador de entradas en las casillas
	private void entryValidation(JTextField jText) {
		jText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
				boolean numeros = key >= 48 && key <= 57;
				if ((!numeros || jText.getText().trim().length() == 2) || (key == 48 && jText.getText().trim().length() == 0)){
				    e.consume();
				}
			}
		});
	}
}
