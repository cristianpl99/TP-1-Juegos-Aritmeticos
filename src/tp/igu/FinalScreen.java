package tp.igu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import tp.logic.Player;
import tp.logic.ArithmeticGame;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.List;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FinalScreen extends JFrame {

	private JPanel contentPane;

	public FinalScreen(String nombre, int secondsPlayed, String tiempo, String nivel) {
		setTitle("Gracias por jugar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 656);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// labels de la ventana de fin
		JLabel lblFinalResult = new JLabel("");
		if (secondsPlayed == 0) {
			lblFinalResult.setText("PERDISTE");
		} else {
			lblFinalResult.setText("GANASTE");
			JLabel lblPlayersTime = new JLabel("TU TIEMPO FUE DE " + tiempo);
			lblPlayersTime.setHorizontalAlignment(SwingConstants.CENTER);
			lblPlayersTime.setFont(new Font("Tahoma", Font.BOLD, 21));
			lblPlayersTime.setBounds(0, 160, 424, 30);
			contentPane.add(lblPlayersTime);
		}
		lblFinalResult.setForeground(new Color(255, 0, 0));
		lblFinalResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinalResult.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblFinalResult.setBounds(132, 83, 165, 30);
		contentPane.add(lblFinalResult);

		JLabel lblPlayersName = new JLabel(nombre);
		lblPlayersName.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayersName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPlayersName.setBounds(122, 42, 191, 30);
		lblPlayersName.setText(nombre);
		contentPane.add(lblPlayersName);

		JLabel lblBestScores = new JLabel("TOP 5 MEJORES PUNTAJES");
		lblBestScores.setForeground(new Color(0, 64, 128));
		lblBestScores.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBestScores.setHorizontalAlignment(SwingConstants.CENTER);
		lblBestScores.setBounds(106, 212, 230, 35);
		contentPane.add(lblBestScores);

		ArithmeticGame game = new ArithmeticGame();
		game.createPlayer(nombre, secondsPlayed, nivel);
		List<Player> topPlayers = game.topPlayers();

		// creacion de los labels que muestran el podio de jugadores
		int lblScoreVerticalPosition = 270;
		for (int i = 0; i < 5; i++) {
			JLabel lblPosition = new JLabel("");
			if (topPlayers.size() > i) {
				lblPosition.setText(String.valueOf(topPlayers.get(i).getName()) + " "
						+ topPlayers.get(i).getScore() + "pts NIVEL " + topPlayers.get(i).getLevel().toUpperCase());
			}
			lblPosition.setHorizontalAlignment(JLabel.CENTER);
			lblPosition.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblPosition.setBounds(54, lblScoreVerticalPosition, 332, 30);
			contentPane.add(lblPosition);
			lblScoreVerticalPosition += 45;
		}

		// botones de replay y cerrar
		JButton btnReplay = new JButton("JUGAR DE NUEVO");
		btnReplay.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StartScreen home = new StartScreen();
				home.setResizable(false);
				home.setVisible(true);
				home.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnReplay.setBounds(22, 571, 129, 35);
		contentPane.add(btnReplay);

		JButton btnClose = new JButton("SALIR");
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(272, 571, 129, 35);
		contentPane.add(btnClose);
	}
}
