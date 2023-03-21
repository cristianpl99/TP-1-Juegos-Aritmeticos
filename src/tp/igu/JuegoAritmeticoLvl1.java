package tp.igu;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.Timer;

import tp.logica.ElementosJuego;
import tp.logica.Controladora;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import java.awt.Panel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JuegoAritmeticoLvl1 extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField text5;
	private JTextField text6;
	private JTextField text7;
	private JTextField text8;
	private JTextField text9;
	private JTextField text10;
	private JTextField text11;
	private JTextField text12;
	private JTextField text13;
	private JTextField text14;
	private JTextField text15;
	private JTextField text16;

	private Timer timer = null;

	private Panel panel_0;
	private Panel panel_1;
	private Panel panel_2;
	private Panel panel_3;
	private Panel panel_5;
	private Panel panel_6;
	private Panel panel_4;
	private Panel panel_7;

	public JuegoAritmeticoLvl1(String nombre) {

		setTitle("Programacion III - Juego Aritmetico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 556);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// inicio una instancia del objeto Controladora
		Controladora control = new Controladora(4, 4);

		text1 = new JTextField();
		validarEntrada(text1);
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setFont(new Font("Tahoma", Font.BOLD, 25));
		text1.setBounds(101, 69, 50, 43);
		contentPane.add(text1);
		text1.setColumns(10);

		text2 = new JTextField();
		validarEntrada(text2);
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setFont(new Font("Tahoma", Font.BOLD, 25));
		text2.setColumns(10);
		text2.setBounds(200, 69, 50, 43);
		contentPane.add(text2);

		text3 = new JTextField();
		validarEntrada(text3);
		text3.setHorizontalAlignment(SwingConstants.CENTER);
		text3.setFont(new Font("Tahoma", Font.BOLD, 25));
		text3.setColumns(10);
		text3.setBounds(300, 69, 50, 43);
		contentPane.add(text3);

		text4 = new JTextField();
		validarEntrada(text4);
		text4.setHorizontalAlignment(SwingConstants.CENTER);
		text4.setFont(new Font("Tahoma", Font.BOLD, 25));
		text4.setColumns(10);
		text4.setBounds(400, 69, 50, 43);
		contentPane.add(text4);

		text5 = new JTextField();
		validarEntrada(text5);
		text5.setHorizontalAlignment(SwingConstants.CENTER);
		text5.setFont(new Font("Tahoma", Font.BOLD, 25));
		text5.setColumns(10);
		text5.setBounds(101, 170, 50, 43);
		contentPane.add(text5);

		text6 = new JTextField();
		validarEntrada(text6);
		text6.setHorizontalAlignment(SwingConstants.CENTER);
		text6.setFont(new Font("Tahoma", Font.BOLD, 25));
		text6.setColumns(10);
		text6.setBounds(200, 170, 50, 43);
		contentPane.add(text6);

		text7 = new JTextField();
		validarEntrada(text7);
		text7.setHorizontalAlignment(SwingConstants.CENTER);
		text7.setFont(new Font("Tahoma", Font.BOLD, 25));
		text7.setColumns(10);
		text7.setBounds(300, 170, 50, 43);
		contentPane.add(text7);

		text8 = new JTextField();
		validarEntrada(text8);
		text8.setHorizontalAlignment(SwingConstants.CENTER);
		text8.setFont(new Font("Tahoma", Font.BOLD, 25));
		text8.setColumns(10);
		text8.setBounds(400, 170, 50, 43);
		contentPane.add(text8);

		text9 = new JTextField();
		validarEntrada(text9);
		text9.setHorizontalAlignment(SwingConstants.CENTER);
		text9.setFont(new Font("Tahoma", Font.BOLD, 25));
		text9.setColumns(10);
		text9.setBounds(101, 269, 50, 43);
		contentPane.add(text9);

		text10 = new JTextField();
		validarEntrada(text10);
		text10.setHorizontalAlignment(SwingConstants.CENTER);
		text10.setFont(new Font("Tahoma", Font.BOLD, 25));
		text10.setColumns(10);
		text10.setBounds(200, 269, 50, 43);
		contentPane.add(text10);

		text11 = new JTextField();
		validarEntrada(text11);
		text11.setHorizontalAlignment(SwingConstants.CENTER);
		text11.setFont(new Font("Tahoma", Font.BOLD, 25));
		text11.setColumns(10);
		text11.setBounds(300, 269, 50, 43);
		contentPane.add(text11);

		text12 = new JTextField();
		validarEntrada(text12);
		text12.setHorizontalAlignment(SwingConstants.CENTER);
		text12.setFont(new Font("Tahoma", Font.BOLD, 25));
		text12.setColumns(10);
		text12.setBounds(400, 269, 50, 43);
		contentPane.add(text12);

		text13 = new JTextField();
		validarEntrada(text13);
		text13.setHorizontalAlignment(SwingConstants.CENTER);
		text13.setFont(new Font("Tahoma", Font.BOLD, 25));
		text13.setColumns(10);
		text13.setBounds(101, 369, 50, 43);
		contentPane.add(text13);

		text14 = new JTextField();
		validarEntrada(text14);
		text14.setHorizontalAlignment(SwingConstants.CENTER);
		text14.setFont(new Font("Tahoma", Font.BOLD, 25));
		text14.setColumns(10);
		text14.setBounds(200, 369, 50, 43);
		contentPane.add(text14);

		text15 = new JTextField();
		validarEntrada(text15);
		text15.setHorizontalAlignment(SwingConstants.CENTER);
		text15.setFont(new Font("Tahoma", Font.BOLD, 25));
		text15.setColumns(10);
		text15.setBounds(300, 369, 50, 43);
		contentPane.add(text15);

		text16 = new JTextField();
		validarEntrada(text16);
		text16.setHorizontalAlignment(SwingConstants.CENTER);
		text16.setFont(new Font("Tahoma", Font.BOLD, 25));
		text16.setColumns(10);
		text16.setBounds(400, 369, 50, 43);
		contentPane.add(text16);

		JLabel lblA = new JLabel(String.valueOf(control.getFilaResul()[0]));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblA.setBounds(498, 67, 46, 43);
		contentPane.add(lblA);

		JLabel lblB = new JLabel(String.valueOf(control.getFilaResul()[1]));
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblB.setBounds(498, 170, 46, 43);
		contentPane.add(lblB);

		JLabel lblC = new JLabel(String.valueOf(control.getFilaResul()[2]));
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblC.setBounds(498, 269, 46, 43);
		contentPane.add(lblC);

		JLabel lblD = new JLabel(String.valueOf(control.getFilaResul()[3]));
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblD.setBounds(498, 369, 46, 43);
		contentPane.add(lblD);

		JLabel lbl1 = new JLabel(String.valueOf(control.getColumResul()[0]));
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl1.setBounds(101, 463, 46, 43);
		contentPane.add(lbl1);

		JLabel lbl2 = new JLabel(String.valueOf(control.getColumResul()[1]));
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl2.setBounds(204, 463, 46, 43);
		contentPane.add(lbl2);

		JLabel lbl3 = new JLabel(String.valueOf(control.getColumResul()[2]));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl3.setBounds(304, 463, 46, 43);
		contentPane.add(lbl3);

		JLabel lbl4 = new JLabel(String.valueOf(control.getColumResul()[3]));
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lbl4.setBounds(404, 463, 46, 43);
		contentPane.add(lbl4);

		JLabel lblNewLabel = new JLabel("TIEMPO :");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 11, 137, 34);
		contentPane.add(lblNewLabel);

		JLabel lblTiempo = new JLabel("0");
		lblTiempo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTiempo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTiempo.setForeground(new Color(255, 0, 0));
		lblTiempo.setBounds(142, 12, 123, 33);
		contentPane.add(lblTiempo);

		panel_0 = new Panel();
		panel_0.setBackground(new Color(255, 0, 0));
		panel_0.setBounds(80, 51, 388, 76);
		contentPane.add(panel_0);

		panel_1 = new Panel();
		panel_1.setBackground(Color.RED);
		panel_1.setBounds(80, 152, 388, 76);
		contentPane.add(panel_1);

		panel_2 = new Panel();
		panel_2.setBackground(Color.RED);
		panel_2.setBounds(80, 253, 388, 76);
		contentPane.add(panel_2);

		panel_3 = new Panel();
		panel_3.setBackground(Color.RED);
		panel_3.setBounds(80, 353, 388, 76);
		contentPane.add(panel_3);

		panel_4 = new Panel();
		panel_4.setBackground(Color.RED);
		panel_4.setBounds(80, 51, 87, 377);
		contentPane.add(panel_4);

		panel_5 = new Panel();
		panel_5.setBackground(Color.RED);
		panel_5.setBounds(181, 51, 87, 377);
		contentPane.add(panel_5);

		panel_6 = new Panel();
		panel_6.setBackground(Color.RED);
		panel_6.setBounds(281, 51, 87, 377);
		contentPane.add(panel_6);

		panel_7 = new Panel();
		panel_7.setBackground(Color.RED);
		panel_7.setBounds(382, 51, 87, 377);
		contentPane.add(panel_7);

		// Aux para ver el fin
		JButton btnCheat = new JButton("CHEAT");
		btnCheat.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dispose();
				Fin fin = new Fin(nombre, Integer.parseInt(lblTiempo.getText()));
				timer.stop();
				fin.setVisible(true);
			}
		});
		btnCheat.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCheat.setBounds(494, 463, 89, 23);
		contentPane.add(btnCheat);

		timer = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblTiempo.setText(String.valueOf(Integer.parseInt(lblTiempo.getText()) + 1));
				/*
				control.ingresoDeResultados(0, 0, text1.getText().equals("") ? 0 : Integer.parseInt(text1.getText()));
				control.ingresoDeResultados(0, 1, text2.getText().equals("") ? 0 : Integer.parseInt(text2.getText()));
				control.ingresoDeResultados(0, 2, text3.getText().equals("") ? 0 : Integer.parseInt(text3.getText()));
				control.ingresoDeResultados(0, 3, text4.getText().equals("") ? 0 : Integer.parseInt(text4.getText()));
				control.ingresoDeResultados(1, 0, text5.getText().equals("") ? 0 : Integer.parseInt(text5.getText()));
				control.ingresoDeResultados(1, 1, text6.getText().equals("") ? 0 : Integer.parseInt(text6.getText()));
				control.ingresoDeResultados(1, 2, text7.getText().equals("") ? 0 : Integer.parseInt(text7.getText()));
				control.ingresoDeResultados(1, 3, text8.getText().equals("") ? 0 : Integer.parseInt(text8.getText()));
				control.ingresoDeResultados(2, 0, text9.getText().equals("") ? 0 : Integer.parseInt(text9.getText()));
				control.ingresoDeResultados(2, 1, text10.getText().equals("") ? 0 : Integer.parseInt(text10.getText()));
				control.ingresoDeResultados(2, 2, text11.getText().equals("") ? 0 : Integer.parseInt(text11.getText()));
				control.ingresoDeResultados(2, 3, text12.getText().equals("") ? 0 : Integer.parseInt(text12.getText()));
				control.ingresoDeResultados(3, 0, text13.getText().equals("") ? 0 : Integer.parseInt(text13.getText()));
				control.ingresoDeResultados(3, 1, text14.getText().equals("") ? 0 : Integer.parseInt(text14.getText()));
				control.ingresoDeResultados(3, 2, text15.getText().equals("") ? 0 : Integer.parseInt(text15.getText()));
				control.ingresoDeResultados(3, 3, text16.getText().equals("") ? 0 : Integer.parseInt(text16.getText()));
				*/
				for (int i = 0; i < 4; i++) {
				    for (int j = 0; j < 4; j++) {
				        JTextField textField = (JTextField) getContentPane().getComponent(i*4+j);
				        int valor = textField.getText().equals("") ? 0 : Integer.parseInt(textField.getText());
				        control.ingresoDeResultados(i, j, valor);
				    }
				}
				
				control.actualizarEstado();

				ArrayList<Boolean> filasCompletas = control.filasCompletas();
				 /*
				for (int i = 0; i < filasCompletas.size(); i++) {
					if (i == 0 && filasCompletas.get(i) == true)
						panel_0.setBackground(new Color(0, 255, 0));

					if (i == 0 && filasCompletas.get(i) == false)
						panel_0.setBackground(new Color(255, 0, 0));

					if (i == 1 && filasCompletas.get(i) == true)
						panel_1.setBackground(new Color(0, 255, 0));

					if (i == 1 && filasCompletas.get(i) == false)
						panel_1.setBackground(new Color(255, 0, 0));

					if (i == 2 && filasCompletas.get(i) == true)
						panel_2.setBackground(new Color(0, 255, 0));

					if (i == 2 && filasCompletas.get(i) == false)
						panel_2.setBackground(new Color(255, 0, 0));

					if (i == 3 && filasCompletas.get(i) == true)
						panel_3.setBackground(new Color(0, 255, 0));

					if (i == 3 && filasCompletas.get(i) == false)
						panel_3.setBackground(new Color(255, 0, 0));
				}
				*/
				for (int i = 0; i < filasCompletas.size(); i++) {
				    Color color = filasCompletas.get(i) ? new Color(0, 255, 0) : new Color(255, 0, 0);
				    switch(i) {
				        case 0:
				            panel_0.setBackground(color);
				            break;
				        case 1:
				            panel_1.setBackground(color);
				            break;
				        case 2:
				            panel_2.setBackground(color);
				            break;
				        case 3:
				            panel_3.setBackground(color);
				            break;
				        default:
				            break;
				    }
				}


				ArrayList<Boolean> columnasCompletas = control.columnasCompletas();
				
				/*
				for (int i = 0; i < filasCompletas.size(); i++) {
					if (i == 0 && columnasCompletas.get(i) == true)
						panel_4.setBackground(new Color(0, 255, 0));

					if (i == 0 && columnasCompletas.get(i) == false)
						panel_4.setBackground(new Color(255, 0, 0));

					if (i == 1 && columnasCompletas.get(i) == true)
						panel_5.setBackground(new Color(0, 255, 0));

					if (i == 1 && columnasCompletas.get(i) == false)
						panel_5.setBackground(new Color(255, 0, 0));

					if (i == 2 && columnasCompletas.get(i) == true)
						panel_6.setBackground(new Color(0, 255, 0));

					if (i == 2 && columnasCompletas.get(i) == false)
						panel_6.setBackground(new Color(255, 0, 0));

					if (i == 3 && columnasCompletas.get(i) == true)
						panel_7.setBackground(new Color(0, 255, 0));

					if (i == 3 && columnasCompletas.get(i) == false)
						panel_7.setBackground(new Color(255, 0, 0));
				}
				*/
				for (int i = 0; i < filasCompletas.size(); i++) {
				    boolean columnaCompleta = columnasCompletas.get(i);
				    Color color = columnaCompleta ? new Color(0, 255, 0) : new Color(255, 0, 0);
				    switch(i) {
				        case 0:
				            panel_4.setBackground(color);
				            break;
				        case 1:
				            panel_5.setBackground(color);
				            break;
				        case 2:
				            panel_6.setBackground(color);
				            break;
				        case 3:
				            panel_7.setBackground(color);
				            break;
				        default:
				           // no hace nada
				    }
				}

				if (control.completoJuego()) {
					dispose();
					Fin fin = new Fin(nombre, Integer.parseInt(lblTiempo.getText()));
					timer.stop();
					fin.setVisible(true);
				}
			}
		});
		timer.start();
	}

	private void validarEntrada(JTextField jText) {
		jText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
				boolean numeros = key >= 48 && key <= 57;

				if (!numeros || jText.getText().trim().length() == 2) {
					e.consume();
				}
				if (key == 48 && jText.getText().trim().length() == 0) {
					
						e.consume();
				
			}
			}
		});

	}

}
