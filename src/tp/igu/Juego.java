package tp.igu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Juego {

	private JFrame frmProgramacionIii;
	private JTextField txt11;
	private JTextField txt12;
	private JTextField txt13;
	private JTextField txt14;
	private JTextField txt21;
	private JTextField txt22;
	private JTextField txt23;
	private JTextField txt24;
	private JTextField txt31;
	private JTextField txt32;
	private JTextField txt33;
	private JTextField txt34;
	private JTextField txt41;
	private JTextField txt42;
	private JTextField txt43;
	private JTextField txt44;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego window = new Juego();
					window.frmProgramacionIii.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Juego() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProgramacionIii = new JFrame();
		frmProgramacionIii.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 30));
		frmProgramacionIii.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmProgramacionIii.setTitle("Programacion III");
		frmProgramacionIii.setIconImage(Toolkit.getDefaultToolkit().getImage(Juego.class.getResource("/icons/progress/ani/3.png")));
		frmProgramacionIii.setBounds(100, 100, 662, 511);
		frmProgramacionIii.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProgramacionIii.getContentPane().setLayout(null);
		
		txt11 = new JTextField();
		txt11.setHorizontalAlignment(SwingConstants.CENTER);
		txt11.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt11.setBounds(100, 50, 51, 47);
		frmProgramacionIii.getContentPane().add(txt11);
		txt11.setColumns(10);
		
		txt12 = new JTextField();
		txt12.setHorizontalAlignment(SwingConstants.CENTER);
		txt12.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt12.setColumns(10);
		txt12.setBounds(200, 50, 51, 47);
		frmProgramacionIii.getContentPane().add(txt12);
		
		txt13 = new JTextField();
		txt13.setHorizontalAlignment(SwingConstants.CENTER);
		txt13.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt13.setColumns(10);
		txt13.setBounds(300, 50, 51, 47);
		frmProgramacionIii.getContentPane().add(txt13);
		
		txt14 = new JTextField();
		txt14.setHorizontalAlignment(SwingConstants.CENTER);
		txt14.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt14.setColumns(10);
		txt14.setBounds(400, 50, 51, 47);
		frmProgramacionIii.getContentPane().add(txt14);
		
		JLabel lblNewLabel = new JLabel("5");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(500, 50, 46, 47);
		frmProgramacionIii.getContentPane().add(lblNewLabel);
		
		txt21 = new JTextField();
		txt21.setHorizontalAlignment(SwingConstants.CENTER);
		txt21.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt21.setColumns(10);
		txt21.setBounds(100, 150, 51, 47);
		frmProgramacionIii.getContentPane().add(txt21);
		
		txt22 = new JTextField();
		txt22.setHorizontalAlignment(SwingConstants.CENTER);
		txt22.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt22.setColumns(10);
		txt22.setBounds(200, 150, 51, 47);
		frmProgramacionIii.getContentPane().add(txt22);
		
		txt23 = new JTextField();
		txt23.setHorizontalAlignment(SwingConstants.CENTER);
		txt23.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt23.setColumns(10);
		txt23.setBounds(300, 150, 51, 47);
		frmProgramacionIii.getContentPane().add(txt23);
		
		txt24 = new JTextField();
		txt24.setHorizontalAlignment(SwingConstants.CENTER);
		txt24.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt24.setColumns(10);
		txt24.setBounds(400, 150, 51, 47);
		frmProgramacionIii.getContentPane().add(txt24);
		
		txt31 = new JTextField();
		txt31.setHorizontalAlignment(SwingConstants.CENTER);
		txt31.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt31.setColumns(10);
		txt31.setBounds(100, 248, 51, 47);
		frmProgramacionIii.getContentPane().add(txt31);
		
		txt32 = new JTextField();
		txt32.setHorizontalAlignment(SwingConstants.CENTER);
		txt32.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt32.setColumns(10);
		txt32.setBounds(200, 248, 51, 47);
		frmProgramacionIii.getContentPane().add(txt32);
		
		txt33 = new JTextField();
		txt33.setHorizontalAlignment(SwingConstants.CENTER);
		txt33.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt33.setColumns(10);
		txt33.setBounds(300, 248, 51, 47);
		frmProgramacionIii.getContentPane().add(txt33);
		
		txt34 = new JTextField();
		txt34.setHorizontalAlignment(SwingConstants.CENTER);
		txt34.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt34.setColumns(10);
		txt34.setBounds(400, 248, 51, 47);
		frmProgramacionIii.getContentPane().add(txt34);
		
		txt41 = new JTextField();
		txt41.setHorizontalAlignment(SwingConstants.CENTER);
		txt41.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt41.setColumns(10);
		txt41.setBounds(100, 329, 51, 47);
		frmProgramacionIii.getContentPane().add(txt41);
		
		txt42 = new JTextField();
		txt42.setHorizontalAlignment(SwingConstants.CENTER);
		txt42.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt42.setColumns(10);
		txt42.setBounds(200, 329, 51, 47);
		frmProgramacionIii.getContentPane().add(txt42);
		
		txt43 = new JTextField();
		txt43.setHorizontalAlignment(SwingConstants.CENTER);
		txt43.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt43.setColumns(10);
		txt43.setBounds(300, 329, 51, 47);
		frmProgramacionIii.getContentPane().add(txt43);
		
		txt44 = new JTextField();
		txt44.setHorizontalAlignment(SwingConstants.CENTER);
		txt44.setFont(new Font("Tahoma", Font.BOLD, 24));
		txt44.setColumns(10);
		txt44.setBounds(400, 329, 51, 47);
		frmProgramacionIii.getContentPane().add(txt44);
		
		JLabel lblNewLabel_1 = new JLabel("7");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(500, 150, 46, 47);
		frmProgramacionIii.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("12");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(500, 248, 46, 47);
		frmProgramacionIii.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("7");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(500, 329, 46, 47);
		frmProgramacionIii.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("7");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4.setBounds(100, 398, 46, 47);
		frmProgramacionIii.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("9");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_5.setBounds(200, 398, 46, 47);
		frmProgramacionIii.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("9");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_6.setBounds(300, 398, 46, 47);
		frmProgramacionIii.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("6");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_7.setBounds(400, 398, 46, 47);
		frmProgramacionIii.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("TIEMPO");
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_8.setBounds(500, 431, 65, 14);
		frmProgramacionIii.getContentPane().add(lblNewLabel_8);
		
		JLabel lblTiempo = new JLabel("90");
		lblTiempo.setForeground(Color.RED);
		lblTiempo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTiempo.setBounds(575, 431, 65, 14);
		frmProgramacionIii.getContentPane().add(lblTiempo);
	}
}
