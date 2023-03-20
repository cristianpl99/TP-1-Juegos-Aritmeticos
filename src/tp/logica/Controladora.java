package tp.logica;

import java.util.ArrayList;

public class Controladora {

	private ElementosJuego juego;

	public Controladora(int filas, int columnas) {
		ElementosJuego juego = new ElementosJuego(filas, columnas);
		this.juego = juego;
	}

	public void ingresoDeResultados(int fila, int colum, int valor) {
		juego.mat[fila][colum] = valor;
	}

	public boolean completoJuego() {
		boolean acumComp = true;
		for (int i = 0; i < juego.filasComp.length; i++) {
			acumComp = acumComp && juego.filasComp[i];
		}
		for (int i = 0; i < juego.columnasComp.length; i++) {
			acumComp = acumComp && juego.columnasComp[i];
		}
		return acumComp;
	}

	// Nota de Jere: Hay que hacerle un test apropiado donde veamos que si las
	// casillas son correctas y el boolean es false, actualiza los valores y
	// viceversa
	// sino no cambia los booleans
	public void actualizarEstado() {
		actualizarFilas();
		actualizarColumnas();
	}

	private void actualizarColumnas() {
		for (int col = 0; col < juego.mat[0].length; col++) {
			int suma = 0;
			for (int fila = 0; fila < juego.mat.length; fila++) {
				suma = suma + juego.mat[fila][col];
			}
			if (suma == juego.columResul[col]) {
				juego.columnasComp[col] = true;
			} else {
				juego.columnasComp[col] = false;
			}
		}
	}

	private void actualizarFilas() {
		for (int fila = 0; fila < juego.mat.length; fila++) {
			int suma = 0;
			for (int col = 0; col < juego.mat[0].length; col++) {
				suma = suma + juego.mat[fila][col];
			}
			if (suma == juego.filaResul[fila]) {
				juego.filasComp[fila] = true;
			} else {
				juego.filasComp[fila] = false;
			}
		}
	}

	public ArrayList<Boolean> filasCompletas() {
		ArrayList<Boolean> filasCompletas = new ArrayList<Boolean>();
		for (int i = 0; i < juego.filasComp.length; i++) {
			filasCompletas.add(juego.filasComp[i]);
		}
		return filasCompletas;
	}

	public ArrayList<Boolean> columnasCompletas() {
		ArrayList<Boolean> columnasCompletas = new ArrayList<Boolean>();
		for (int i = 0; i < juego.columnasComp.length; i++) {
			columnasCompletas.add(juego.columnasComp[i]);
		}
		return columnasCompletas;
	}

	// cambiar getters por iterators
	public int[] getColumResul() {
		return juego.columResul;
	}

	public int[] getFilaResul() {
		return juego.filaResul;
	}

}
