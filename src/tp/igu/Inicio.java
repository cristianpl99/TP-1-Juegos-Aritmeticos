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

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;

	public Inicio() {
		setTitle("Programacion III - Bienvenidos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 399);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// labels de la ventana inicio
		JLabel lblTitulo = new JLabel("TRABAJO PRACTICO 1 : JUEGOS ARITMETICOS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo.setBounds(32, 28, 497, 41);
		contentPane.add(lblTitulo);

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

		JLabel lblElegirNivel = new JLabel("ELEGIR NIVEL");
		lblElegirNivel.setHorizontalAlignment(SwingConstants.CENTER);
		lblElegirNivel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblElegirNivel.setBounds(10, 195, 258, 41);
		contentPane.add(lblElegirNivel);

		JLabel lblIngreseNombre = new JLabel("INGRESE SU NOMBRE:");
		lblIngreseNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseNombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIngreseNombre.setBounds(152, 86, 230, 41);
		contentPane.add(lblIngreseNombre);

		// box de niveles
		JComboBox<String> comboBoxNiveles = new JComboBox<String>();
		comboBoxNiveles
				.setModel(new DefaultComboBoxModel<String>(new String[] { "Principiante", "Intermedio", "Experto" }));
		comboBoxNiveles.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBoxNiveles.setBounds(346, 203, 109, 29);
		contentPane.add(comboBoxNiveles);

		// boton comenzar el juego
		JButton btnComenzar = new JButton("Empezar el Juego");
		btnComenzar.addActionListener(new ActionListener() {

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
					switch (comboBoxNiveles.getSelectedItem().toString()) {
					case "Principiante":
						PantallaJuego juegoPrincipiante = new PantallaJuego(textNombre.getText(), 4, 650, "principiante");
						juegoPrincipiante.setResizable(false);
						juegoPrincipiante.setVisible(true);
						break;
					case "Intermedio":
						PantallaJuego juegoIntermedio = new PantallaJuego(textNombre.getText(), 5, 750, "intermedio");
						juegoIntermedio.setResizable(false);
						juegoIntermedio.setVisible(true);
						break;
					case "Experto":
						PantallaJuego juegoExperto = new PantallaJuego(textNombre.getText(), 6, 850, "experto");
						juegoExperto.setResizable(false);
						juegoExperto.setVisible(true);
						break;
					default:
						break;
					}
				}
			}
		});
		btnComenzar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnComenzar.setBackground(new Color(192, 192, 192));
		btnComenzar.setBounds(207, 278, 153, 41);
		contentPane.add(btnComenzar);
	}
}
