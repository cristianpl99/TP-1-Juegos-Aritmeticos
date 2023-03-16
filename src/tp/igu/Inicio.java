package tp.igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/icons/progress/ani/8.png")));
		setTitle("Programacion III - Bienvenidos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 399);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TRABAJO PRACTICO 1 : JUEGOS ARITMETICOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(32, 28, 497, 41);
		contentPane.add(lblNewLabel);
		
		textNombre = new JTextField();
		textNombre.setToolTipText("");
		textNombre.setHorizontalAlignment(SwingConstants.CENTER);
		textNombre.setForeground(Color.GRAY);
		textNombre.setFont(new Font("Tahoma", Font.ITALIC, 11));
		textNombre.setColumns(10);
		textNombre.setBounds(152, 118, 258, 20);
		contentPane.add(textNombre);
		
		JLabel lblElegirNivel = new JLabel("ELEGIR NIVEL");
		lblElegirNivel.setHorizontalAlignment(SwingConstants.CENTER);
		lblElegirNivel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblElegirNivel.setBounds(10, 195, 258, 41);
		contentPane.add(lblElegirNivel);
		
		JComboBox comboBoxNivel = new JComboBox();
		comboBoxNivel.setModel(new DefaultComboBoxModel(new String[] {"Principiante", "Intermedio", "Experto"}));
		comboBoxNivel.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBoxNivel.setBounds(319, 195, 109, 29);
		contentPane.add(comboBoxNivel);
		
		JButton btnComenzar = new JButton("Empezar el Juego");
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JuegoAritmetico juego = new JuegoAritmetico();
				juego.setVisible(true);
			}
		});
		btnComenzar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnComenzar.setBackground(new Color(192, 192, 192));
		btnComenzar.setBounds(210, 276, 138, 41);
		contentPane.add(btnComenzar);
	}
}
