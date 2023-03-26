package tp.igu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tp.logica.Jugador;
import tp.logica.Logica;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.List;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fin extends JFrame {

	private JPanel contentPane;

	public Fin(String nombre, int segundosJugados, String tiempo, String nivel) {
		setTitle("Gracias por jugar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 486);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblGanaste = new JLabel("GANASTE");
		lblGanaste.setForeground(new Color(255, 0, 0));
		lblGanaste.setHorizontalAlignment(SwingConstants.CENTER);
		lblGanaste.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblGanaste.setBounds(132, 83, 165, 30);
		contentPane.add(lblGanaste);

		JLabel lblNombre = new JLabel(nombre);
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNombre.setBounds(122, 42, 191, 30);
		lblNombre.setText(nombre);
		contentPane.add(lblNombre);

		JLabel lblTiempo = new JLabel("TU TIEMPO FUE DE " + tiempo);
		lblTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiempo.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTiempo.setBounds(0, 160, 424, 30);
		contentPane.add(lblTiempo);

		JLabel lblNewLabel = new JLabel("MEJORES PUNTAJES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(122, 212, 191, 35);
		contentPane.add(lblNewLabel);

		Logica controladora = new Logica();
		controladora.crearJugador(nombre, segundosJugados, nivel);
		List<Jugador> jugadoresPodio = controladora.jugadoresPodio();
		
		//creacion de los labels que muestran el podio de jugadores
		int posicionVertical = 260; 
		for (int i = 0; i < 3; i++) {
		    JLabel lblPuesto = new JLabel("");
		    if (jugadoresPodio.size() > i) {
		        lblPuesto.setText(String.valueOf(
		        	jugadoresPodio.get(i).getNombre()) + " " +
		            jugadoresPodio.get(i).getPuntaje() + "pts NIVEL " +
				    jugadoresPodio.get(i).getNivel());
		    }
		    lblPuesto.setHorizontalAlignment(SwingConstants.CENTER);
		    lblPuesto.setFont(new Font("Tahoma", Font.BOLD, 13));
		    lblPuesto.setBounds(54, posicionVertical, 292, 30);
		    contentPane.add(lblPuesto);
		    posicionVertical += 40;
		}

		
		JButton btnReplay = new JButton("Jugar de nuevo");
		btnReplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio inicio = new Inicio();
				inicio.setResizable(false);
				inicio.setVisible(true);
				inicio.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnReplay.setBounds(36, 413, 129, 23);
		contentPane.add(btnReplay);
		
		JButton btnCerrar = new JButton("Cerrar Juego");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					dispose();
			}
		});
		btnCerrar.setBounds(276, 413, 129, 23);
		contentPane.add(btnCerrar);
	}
}
