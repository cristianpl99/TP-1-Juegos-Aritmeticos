package tp.igu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tp.logica.Jugador;
import tp.logica.JuegoAritmetico;

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

		// labels de la ventana de fin
		JLabel lblResultadoFinal = new JLabel("");
		if (segundosJugados == 0) {
			lblResultadoFinal.setText("PERDISTE");
		} else {
			lblResultadoFinal.setText("GANASTE");
			JLabel lblTiempoDelJugador = new JLabel("TU TIEMPO FUE DE " + tiempo);
			lblTiempoDelJugador.setHorizontalAlignment(SwingConstants.CENTER);
			lblTiempoDelJugador.setFont(new Font("Tahoma", Font.BOLD, 21));
			lblTiempoDelJugador.setBounds(0, 160, 424, 30);
			contentPane.add(lblTiempoDelJugador);
		}
		lblResultadoFinal.setForeground(new Color(255, 0, 0));
		lblResultadoFinal.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultadoFinal.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblResultadoFinal.setBounds(132, 83, 165, 30);
		contentPane.add(lblResultadoFinal);

		JLabel lblNombreJugador = new JLabel(nombre);
		lblNombreJugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreJugador.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNombreJugador.setBounds(122, 42, 191, 30);
		lblNombreJugador.setText(nombre);
		contentPane.add(lblNombreJugador);

		JLabel lblMejoresPuntajes = new JLabel("MEJORES PUNTAJES");
		lblMejoresPuntajes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMejoresPuntajes.setHorizontalAlignment(SwingConstants.CENTER);
		lblMejoresPuntajes.setBounds(122, 212, 191, 35);
		contentPane.add(lblMejoresPuntajes);

		JuegoAritmetico logicaDelJuego = new JuegoAritmetico();
		logicaDelJuego.crearJugador(nombre, segundosJugados, nivel);
		List<Jugador> podioJugadores = logicaDelJuego.jugadoresDelPodio();

		// creacion de los labels que muestran el podio de jugadores
		int posicionVerticalDelPuesto = 260;
		for (int i = 0; i < 3; i++) {
			JLabel lblPuesto = new JLabel("");
			if (podioJugadores.size() > i) {
				lblPuesto.setText(String.valueOf(podioJugadores.get(i).getNombre()) + " "
						+ podioJugadores.get(i).getPuntaje() + "pts NIVEL " + podioJugadores.get(i).getNivelElegido());
			}
			lblPuesto.setHorizontalAlignment(SwingConstants.CENTER);
			lblPuesto.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblPuesto.setBounds(54, posicionVerticalDelPuesto, 292, 30);
			contentPane.add(lblPuesto);
			posicionVerticalDelPuesto += 40;
		}

		// botones de replay y cerrar
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
