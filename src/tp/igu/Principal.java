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

public class Principal {

	private JFrame frmTra;

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
		frmTra.setBounds(100, 100, 559, 382);
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
		lblElegirNivel.setBounds(115, 147, 324, 41);
		frmTra.getContentPane().add(lblElegirNivel);
		
		JButton btnNivel1 = new JButton("Principiante");
		btnNivel1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNivel1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNivel1.setBackground(Color.GRAY);
		btnNivel1.setBounds(62, 230, 99, 41);
		frmTra.getContentPane().add(btnNivel1);
		
		JButton btn2 = new JButton("Intermedio");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn2.setBackground(Color.GRAY);
		btn2.setBounds(232, 230, 99, 41);
		frmTra.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("Experto");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn3.setBackground(Color.GRAY);
		btn3.setBounds(405, 230, 99, 41);
		frmTra.getContentPane().add(btn3);
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
