package tp.igu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class StartScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;

	public StartScreen() {
		setTitle("Programacion III - Bienvenidos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 399);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// labels de la ventana inicio
		JLabel lblTitle = new JLabel("TRABAJO PRACTICO 1 : JUEGOS ARITMETICOS");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitle.setBounds(32, 28, 497, 41);
		contentPane.add(lblTitle);

		textNombre = new JTextField();
		textNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (textNombre.getText().trim().length() == 10) {
					e.consume();
				}
			}
		});
		textNombre.setToolTipText("");
		textNombre.setHorizontalAlignment(SwingConstants.CENTER);
		textNombre.setForeground(Color.GRAY);
		textNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		textNombre.setColumns(10);
		textNombre.setBounds(143, 137, 258, 34);
		contentPane.add(textNombre);

		JLabel lblLevel = new JLabel("ELEGIR NIVEL");
		lblLevel.setHorizontalAlignment(SwingConstants.CENTER);
		lblLevel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLevel.setBounds(10, 195, 258, 41);
		contentPane.add(lblLevel);

		JLabel lblName = new JLabel("INGRESE SU NOMBRE:");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(152, 86, 230, 41);
		contentPane.add(lblName);

		// box de niveles
		JComboBox<String> comboBoxLevels = new JComboBox<String>();
		comboBoxLevels
				.setModel(new DefaultComboBoxModel<String>(new String[] { "Principiante", "Intermedio", "Experto" }));
		comboBoxLevels.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBoxLevels.setBounds(346, 203, 109, 29);
		contentPane.add(comboBoxLevels);

		// boton comenzar el juego
		JButton btnStart = new JButton("Empezar el Juego");
		btnStart.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (textNombre.getText().length() < 3) {
					JOptionPane.showMessageDialog(null, "Tu nombre debe tener más de tres caracteres y menos de ocho", 
												"Error al iniciar el juego", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "  El objetivo del juego es completar las casillas vacias" + " \n " +
														"con numeros enteros positivos logrando que la suma de" + " \n " +
														"     los elementos de cada filas y columnas sean " + " \n " +
														" iguales a los resultados propuestos en sus extremos" + " \n " +
														" \n " +
														" La matriz debe resolverse en menos de diez minutos y su" + " \n " +
														"        tamaño será de acuerdo al nivel elegido." + " \n " +
														" \n " +
														"   La resolución correcta tendra un bonus multiplicador" + " \n "  +
														"        en los niveles INTERMEDIO y EXPERTO." + " \n ", 
														
							"Reglas del juego", JOptionPane.INFORMATION_MESSAGE);
					

					dispose();
					switch (comboBoxLevels.getSelectedItem().toString()) {
					case "Principiante":
						GameScreen beginnerGame = new GameScreen(textNombre.getText(), 4, 650, "principiante");
						beginnerGame.setResizable(false);
						beginnerGame.setVisible(true);
						break;
					case "Intermedio":
						GameScreen intermediateGame = new GameScreen(textNombre.getText(), 5, 750, "intermedio");
						intermediateGame.setResizable(false);
						intermediateGame.setVisible(true);
						break;
					case "Experto":
						GameScreen expertGame = new GameScreen(textNombre.getText(), 6, 850, "experto");
						expertGame.setResizable(false);
						expertGame.setVisible(true);
						break;
					default:
						break;
					}
				}
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnStart.setBackground(new Color(192, 192, 192));
		btnStart.setBounds(207, 278, 153, 41);
		contentPane.add(btnStart);
	}
}
