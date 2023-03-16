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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

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
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField.setBounds(100, 50, 51, 47);
		frmProgramacionIii.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(200, 50, 51, 47);
		frmProgramacionIii.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_2.setColumns(10);
		textField_2.setBounds(300, 50, 51, 47);
		frmProgramacionIii.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_3.setColumns(10);
		textField_3.setBounds(400, 50, 51, 47);
		frmProgramacionIii.getContentPane().add(textField_3);
		
		JLabel lblNewLabel = new JLabel("5");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(500, 50, 46, 47);
		frmProgramacionIii.getContentPane().add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_4.setColumns(10);
		textField_4.setBounds(100, 150, 51, 47);
		frmProgramacionIii.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_5.setColumns(10);
		textField_5.setBounds(200, 150, 51, 47);
		frmProgramacionIii.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_6.setColumns(10);
		textField_6.setBounds(300, 150, 51, 47);
		frmProgramacionIii.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_7.setColumns(10);
		textField_7.setBounds(400, 150, 51, 47);
		frmProgramacionIii.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_8.setColumns(10);
		textField_8.setBounds(100, 248, 51, 47);
		frmProgramacionIii.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_9.setColumns(10);
		textField_9.setBounds(200, 248, 51, 47);
		frmProgramacionIii.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_10.setColumns(10);
		textField_10.setBounds(300, 248, 51, 47);
		frmProgramacionIii.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_11.setColumns(10);
		textField_11.setBounds(400, 248, 51, 47);
		frmProgramacionIii.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_12.setColumns(10);
		textField_12.setBounds(100, 329, 51, 47);
		frmProgramacionIii.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_13.setColumns(10);
		textField_13.setBounds(200, 329, 51, 47);
		frmProgramacionIii.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_14.setColumns(10);
		textField_14.setBounds(300, 329, 51, 47);
		frmProgramacionIii.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_15.setColumns(10);
		textField_15.setBounds(400, 329, 51, 47);
		frmProgramacionIii.getContentPane().add(textField_15);
		
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
		
		JLabel lblNewLabel_8_1 = new JLabel("90");
		lblNewLabel_8_1.setForeground(Color.RED);
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_8_1.setBounds(575, 431, 65, 14);
		frmProgramacionIii.getContentPane().add(lblNewLabel_8_1);
	}
}
