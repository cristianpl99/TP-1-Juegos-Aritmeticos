package tp.persistence;

import tp.logic.Player;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Persistence {
	String fileLocation = "src" + File.separator + "tp" + File.separator + "persistence" + File.separator
			+ "scores.txt";;
	File file = new File(fileLocation);

	public void savePlayer(Player player) {
		try {
			FileWriter writer = new FileWriter(file, true);
			writer.write(player.getNombre().toUpperCase() + "," + player.getPuntaje() + ","
					+ player.getNivelElegido() + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Player> fetchPlayers() {
		// recupero jugadores y puntaje
		List<Player> players = new ArrayList<>();
		try {
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			String line;

			while ((line = buffer.readLine()) != null) {
				String[] parts = line.split(",");
				String name = parts[0];
				int score = Integer.parseInt(parts[1]);
				String level = parts[2];
				Player player = new Player(name, score, level);
				players.add(player);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ordeno la lista entera de jugadores
		Collections.sort(players, new Comparator<Player>() {
			@Override
			public int compare(Player player1, Player player2) {
				return player1.getPuntaje() - player1.getPuntaje();
			}
		});
		// armo una lista con los top 5
		List<Player> top5Players = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			if (players.size() >= i) {
				top5Players.add(players.get(i));
			}
		}
		// devuelvo la lista ordenada
		return top5Players;
	}

}
