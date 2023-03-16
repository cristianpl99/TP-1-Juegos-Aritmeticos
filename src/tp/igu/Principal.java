package tp.igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Principal {

	private JFrame frmTra;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmTra.setVisible(true);
					window.frmTra.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTra = new JFrame();
		frmTra.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmTra.setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/icons/progress/ani/8@2x.png")));
		frmTra.setTitle("Programacion III");
		frmTra.setResizable(false);
		frmTra.setBounds(100, 100, 565, 467);
		frmTra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTra.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TRABAJO PRACTICO 1 : JUEGOS ARITMETICOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(22, 65, 497, 41);
		frmTra.getContentPane().add(lblNewLabel);
		
		JLabel lblElegirNivel = new JLabel("ELEGIR NIVEL");
		lblElegirNivel.setHorizontalAlignment(SwingConstants.CENTER);
		lblElegirNivel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblElegirNivel.setBounds(26, 237, 258, 41);
		frmTra.getContentPane().add(lblElegirNivel);
		
		JButton btnComenzar = new JButton("Empezar el Juego");
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmTra.dispose();
				JuegoAritmetico juego = new JuegoAritmetico();
				juego.setVisible(true);
			}
		});
		btnComenzar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnComenzar.setBackground(Color.DARK_GRAY);
		btnComenzar.setBounds(209, 354, 138, 41);
		frmTra.getContentPane().add(btnComenzar);
		
		txtNombre = new JTextField();
		txtNombre.setToolTipText("");
		txtNombre.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtNombre.setForeground(Color.GRAY);
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setBounds(153, 162, 258, 20);
		frmTra.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PRINCIPIANTE", "INTERMEDIO", "EXPERTO"}));
		comboBox.setBounds(322, 245, 138, 29);
		frmTra.getContentPane().add(comboBox);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
