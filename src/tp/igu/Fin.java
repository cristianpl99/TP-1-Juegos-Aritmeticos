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

	public Fin(String nombre, int tiempo) {
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

		JLabel lblTiempo = new JLabel("TU TIEMPO FUE DE " + tiempo + " SEGUNDOS");
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
		controladora.crearJugador(nombre, tiempo);
		List<Jugador> jugadoresPodio = controladora.jugadoresPodio();

		JLabel lblPrimerPuesto = new JLabel("");
		if (jugadoresPodio.get(0) != null) {
			lblPrimerPuesto.setText(
					String.valueOf(jugadoresPodio.get(0).getNombre()) + " " + jugadoresPodio.get(0).getPuntaje());
		}
		lblPrimerPuesto.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrimerPuesto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimerPuesto.setBounds(74, 258, 292, 30);
		contentPane.add(lblPrimerPuesto);

		JLabel lblSegundoPuesto = new JLabel("");
		if (jugadoresPodio.size() > 1) {
			lblSegundoPuesto.setText(
					String.valueOf(jugadoresPodio.get(1).getNombre()) + " " + jugadoresPodio.get(1).getPuntaje());
		}
		lblSegundoPuesto.setHorizontalAlignment(SwingConstants.CENTER);
		lblSegundoPuesto.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSegundoPuesto.setBounds(74, 299, 292, 30);
		contentPane.add(lblSegundoPuesto);

		JLabel lblTercerPuesto = new JLabel("");
		if (jugadoresPodio.size() > 2) {
			lblTercerPuesto.setText(
					String.valueOf(jugadoresPodio.get(2).getNombre()) + " " + jugadoresPodio.get(2).getPuntaje());
		}
		lblTercerPuesto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTercerPuesto.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTercerPuesto.setBounds(74, 340, 292, 30);
		contentPane.add(lblTercerPuesto);
		
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
