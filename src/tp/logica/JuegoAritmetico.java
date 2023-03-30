package tp.logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import tp.persistencia.Persistencia;

public class JuegoAritmetico {

	private int[][] matDeValores;
	private Random random;
	private int[] resultadosDeLasFilas;
	private int[] resultadosDeLasColumnas;
	private boolean[] filasCompletas;
	private boolean[] columnasCompletas;

	// constructor
	public JuegoAritmetico(int filas, int columnas) {
		int mat[][] = new int[filas][columnas];
		random = new Random(System.currentTimeMillis());
		for (int fila = 0; fila < mat.length; fila++) {
			for (int col = 0; col < mat[0].length; col++) {
				{
					mat[fila][col] = random.nextInt(9) + 1;
				}
			}
		}
		this.matDeValores = mat;
		// aux visualizacion
		// this.imprimirMatriz();

		filasCompletas = new boolean[filas];
		for (int i = 0; i < filasCompletas.length; i++) {
			filasCompletas[i] = false;
		}

		columnasCompletas = new boolean[columnas];
		for (int i = 0; i < columnasCompletas.length; i++) {
			columnasCompletas[i] = false;
		}

		int[] filaResultado = new int[filas];
		for (int f = 0; f < mat.length; f++) {
			int sumaDeLaFila = 0;
			for (int c = 0; c < mat[0].length; c++) {
				sumaDeLaFila = sumaDeLaFila + mat[f][c];
			}
			filaResultado[f] = sumaDeLaFila;
			sumaDeLaFila = 0;
			this.resultadosDeLasFilas = filaResultado;

		}

		int[] columnaResultado = new int[columnas];
		for (int c = 0; c < mat[0].length; c++) {
			int sumaDeLaColumna = 0;
			for (int f = 0; f < mat.length; f++) {
				sumaDeLaColumna = sumaDeLaColumna + mat[f][c];
			}
			columnaResultado[c] = sumaDeLaColumna;
			sumaDeLaColumna = 0;
			this.resultadosDeLasColumnas = columnaResultado;
		}

		// se setea todo en 0 para poder jugar con varios resultados posibles
		for (int fila = 0; fila < mat.length; fila++) {
			for (int col = 0; col < mat[0].length; col++) {
				{
					mat[fila][col] = 0;
				}
			}
		}
	}

	public JuegoAritmetico() {
	}

	// aux de visualizacion
//	public void imprimirMatriz() {
//		for (int i = 0; i < this.matDeValores.length; i++) {
//			for (int j = 0; j < this.matDeValores[0].length; j++) {
//				System.out.print(this.matDeValores[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}

	// funciones
	public void ingresoDeResultados(int fila, int colum, int valor) {
		matDeValores[fila][colum] = valor;
	}

	public boolean completoJuego() {
		boolean acumCompletoElJuego = true;
		for (int i = 0; i < filasCompletas.length; i++) {
			acumCompletoElJuego = acumCompletoElJuego && filasCompletas[i];
		}
		for (int i = 0; i < columnasCompletas.length; i++) {
			acumCompletoElJuego = acumCompletoElJuego && columnasCompletas[i];
		}
		return acumCompletoElJuego;
	}

	public void actualizarEstadosFilaYColum() {
		actualizarFilas();
		actualizarColumnas();
	}

	private void actualizarColumnas() {
		for (int col = 0; col < matDeValores[0].length; col++) {
			int sumaDeLaColumna = 0;
			for (int fila = 0; fila < matDeValores.length; fila++) {
				if (matDeValores[fila][col] == 0) {
					sumaDeLaColumna = 0;
					break;
				} else {
					sumaDeLaColumna = sumaDeLaColumna + matDeValores[fila][col];
				}
			}
			if (sumaDeLaColumna == resultadosDeLasColumnas[col]) {
				columnasCompletas[col] = true;
			} else {
				columnasCompletas[col] = false;
			}
		}
	}

	private void actualizarFilas() {
		for (int fila = 0; fila < matDeValores.length; fila++) {
			int sumaDeLaFila = 0;
			for (int col = 0; col < matDeValores[0].length; col++) {
				if (matDeValores[fila][col] == 0) {
					sumaDeLaFila = 0;
					break;
				} else {
					sumaDeLaFila = sumaDeLaFila + matDeValores[fila][col];
				}
			}
			if (sumaDeLaFila == resultadosDeLasFilas[fila]) {
				filasCompletas[fila] = true;
			} else {
				filasCompletas[fila] = false;
			}
		}
	}

	public ArrayList<Boolean> filasCompletas() {
		ArrayList<Boolean> filasComp = new ArrayList<Boolean>();
		for (int i = 0; i < filasCompletas.length; i++) {
			filasComp.add(filasCompletas[i]);
		}
		return filasComp;
	}

	public ArrayList<Boolean> columnasCompletas() {
		ArrayList<Boolean> columnasComp = new ArrayList<Boolean>();
		for (int i = 0; i < columnasCompletas.length; i++) {
			columnasComp.add(columnasCompletas[i]);
		}
		return columnasComp;
	}

	public void crearJugador(String nombre, int puntaje, String nivel) {
		Jugador jugador = new Jugador(nombre, puntaje, nivel);
		Persistencia persistencia = new Persistencia();
		persistencia.guardarJugador(jugador);
	}

	public List<Jugador> jugadoresDelPodio() {
		Persistencia persistencia = new Persistencia();
		return persistencia.recuperarJugadores();
	}

	public int getColumResul(int resul) {
		return resultadosDeLasColumnas[resul];
	}

	public int getFilaResul(int resul) {
		return resultadosDeLasFilas[resul];
	}

}
