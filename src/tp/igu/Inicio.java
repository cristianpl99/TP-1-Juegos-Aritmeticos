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

		JLabel lblNewLabel = new JLabel("TRABAJO PRACTICO 1 : JUEGOS ARITMETICOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(32, 28, 497, 41);
		contentPane.add(lblNewLabel);

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
		textNombre.setBounds(152, 118, 258, 20);
		contentPane.add(textNombre);

		JLabel lblElegirNivel = new JLabel("ELEGIR NIVEL");
		lblElegirNivel.setHorizontalAlignment(SwingConstants.CENTER);
		lblElegirNivel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblElegirNivel.setBounds(10, 195, 258, 41);
		contentPane.add(lblElegirNivel);

		JComboBox comboBoxNivel = new JComboBox();
		comboBoxNivel.setModel(new DefaultComboBoxModel(new String[] { "Principiante", "Intermedio", "Experto" }));
		comboBoxNivel.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBoxNivel.setBounds(319, 195, 109, 29);
		contentPane.add(comboBoxNivel);

		JButton btnComenzar = new JButton("Empezar el Juego");
		btnComenzar.addActionListener(new ActionListener() {
			 
			 public void actionPerformed(ActionEvent e) {
				 if (textNombre.getText().length() < 3) {
		                JOptionPane.showMessageDialog(null, "Tu nombre debe tener más de tres caracteres y menos de ocho");
				 }
				 else{dispose();
				// if (comboBoxNivel.getSelectedItem().equals("Principiante")){
				Juego juego = new Juego(textNombre.getText(), 4);
				juego.setResizable(false);
				juego.setVisible(true);
				// }
			}
			 }
		});
		btnComenzar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnComenzar.setBackground(new Color(192, 192, 192));
		btnComenzar.setBounds(210, 276, 138, 41);
		contentPane.add(btnComenzar);
	}
}
