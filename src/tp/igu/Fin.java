package tp.igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Fin extends JFrame {

	private JPanel contentPane;
	private JTextField txtGanaste;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fin frame = new Fin();
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
	public Fin() {
		setTitle("Gracias por jugar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtGanaste = new JTextField();
		txtGanaste.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtGanaste.setHorizontalAlignment(SwingConstants.CENTER);
		txtGanaste.setText("GANASTE");
		txtGanaste.setBounds(61, 61, 309, 61);
		contentPane.add(txtGanaste);
		txtGanaste.setColumns(10);
	}

}
