package tp.persistencia;

import tp.logica.Jugador;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Persistencia {
	
	File archivo = new File("C:/Users/crist/Desktop/UNGS/P2/TP-1-Juegos-Aritmeticos/src/tp/persistencia/puntajes.txt");
	

	public void guardarJugador(Jugador jugador) {
	        try {
	            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
	            writer.write(jugador.getNombre() + "," + jugador.getPuntaje() + "\n");
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
	public List<Jugador> recuperarJugadores() {
        List<Jugador> jugadores = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                String nombre = partes[0];
                int puntaje = Integer.parseInt(partes[1]);
                Jugador jugador = new Jugador(nombre, puntaje);
                jugadores.add(jugador);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Collections.sort(jugadores, new Comparator<Jugador>() {
            @Override
            public int compare(Jugador jugador1, Jugador jugador2) {
                return jugador2.getPuntaje() - jugador1.getPuntaje();
            }
        });        
        return jugadores;
    }






	


}


