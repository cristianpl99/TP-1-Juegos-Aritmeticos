package tp.persistencia;

import tp.logica.Jugador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Persistencia {
	String locacionDelArchivo = "src" + File.separator + "tp" + File.separator + "persistencia" + File.separator
			+ "puntajes.txt";;
	File archivo = new File(locacionDelArchivo);

	public void guardarJugador(Jugador jugador) {
		try {
			FileWriter writer = new FileWriter(archivo, true);
			writer.write(jugador.getNombre().toUpperCase() + "," + jugador.getPuntaje() + ","
					+ jugador.getNivelElegido() + "\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Jugador> recuperarJugadores() {
		// recupero jugadores y puntaje
		List<Jugador> jugadores = new ArrayList<>();
		try {
			FileReader reader = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(reader);
			String linea;

			while ((linea = buffer.readLine()) != null) {
				String[] partes = linea.split(",");
				String nombre = partes[0];
				int puntaje = Integer.parseInt(partes[1]);
				String nivel = partes[2];
				Jugador jugador = new Jugador(nombre, puntaje, nivel);
				jugadores.add(jugador);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// ordeno la lista entera de jugadores
		Collections.sort(jugadores, new Comparator<Jugador>() {
			@Override
			public int compare(Jugador jugador1, Jugador jugador2) {
				return jugador2.getPuntaje() - jugador1.getPuntaje();
			}
		});
		// armo una lista con los top 3
		List<Jugador> jugadoresTop3 = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			if (jugadores.size() >= i) {
				jugadoresTop3.add(jugadores.get(i));
			}
		}
		// devuelvo la lista ordenada
		return jugadoresTop3;
	}

}
