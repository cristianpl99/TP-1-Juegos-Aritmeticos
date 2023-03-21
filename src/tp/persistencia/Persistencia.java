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
import java.util.Properties;


public class Persistencia {
	String locacion = "C:/Users/crist/Desktop/UNGS/P2/TP-1-Juegos-Aritmeticos/src/tp/persistencia/puntajes.txt";
	File archivo = new File(locacion);
	

	public void guardarJugador(Jugador jugador) {
	        try {
	            FileWriter writer = new FileWriter(archivo, true);
	            writer.write(jugador.getNombre().toUpperCase() + "," + jugador.getPuntaje() + "\n");
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
	public List<Jugador> recuperarJugadores() {
		//recupero jugadores y puntaje
        List<Jugador> jugadores = new ArrayList<>();
        try {
            FileReader reader = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(reader);
            String linea;

            while ((linea = buffer.readLine()) != null) {
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
        //muestro la lista completa de jugadores
        imprimirLista(jugadores);
        //ordeno la lista entera de jugadores
        Collections.sort(jugadores, new Comparator<Jugador>() {
            @Override
            public int compare(Jugador jugador1, Jugador jugador2) {
                return jugador1.getPuntaje() - jugador2.getPuntaje();
            }
        });
      //muestro la lista completa ordenada de jugadores
        imprimirLista(jugadores);
        
        //armo una lista con los top 3
        List<Jugador> jugadoresTop3 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
        	jugadoresTop3.add(jugadores.get(i));
        }
      //muestro la lista completa ordenada de jugadores
        imprimirLista(jugadoresTop3);
        //devuelvo la lista ordenada
        return jugadoresTop3;
    }
		//aux de impresion
	private void imprimirLista(List<Jugador> jugadoresTop3) {
		for (Jugador jugador : jugadoresTop3) {
            System.out.println(jugador.getNombre().toString()+ " " + String.valueOf(jugador.getPuntaje()));
            
        }
		System.out.println(" \n");
	}
	






	


}


