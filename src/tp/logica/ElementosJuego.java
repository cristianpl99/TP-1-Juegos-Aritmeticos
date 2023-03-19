package tp.logica;

import java.util.ArrayList;
import java.util.Random;

public class ElementosJuego {
	private int[][] mat;
	private Random random;
	private int[] filaResul;
	private int[] columResul;
	private boolean[] filasComp;
	private boolean[] columnasComp;
	

	public ElementosJuego(int filas, int columnas) {
		int mat[][] = new int[filas][columnas];
		random = new Random(System.currentTimeMillis());
		for (int fila = 0; fila < mat.length; fila++) {
			for (int col = 0; col < mat[0].length; col++) {
				{
					mat[fila][col] = random.nextInt(9) + 1;
				}
			}
		}
		this.mat = mat;

		filasComp = new boolean[filas];
		for (int i = 0; i < filasComp.length; i++) {
			filasComp[i] = false;
		}

		columnasComp = new boolean[columnas];
		for (int i = 0; i < columnasComp.length; i++) {
			columnasComp[i] = false;
		}

		int[] filaResul = new int[filas];
		for (int f = 0; f < mat.length; f++) {
			int sum = 0;
			for (int c = 0; c < mat[0].length; c++) {
				sum = sum + mat[f][c];
			}
			filaResul[f] = sum;
			sum = 0;
			this.filaResul = filaResul;

		}

		int[] columResul = new int[columnas];
		for (int c = 0; c < mat[0].length; c++) {
			int sum = 0;
			for (int f = 0; f < mat.length; f++) {
				sum = sum + mat[f][c];
			}
			columResul[c] = sum;
			sum = 0;
			this.columResul = columResul;
		}

		for (int fila = 0; fila < mat.length; fila++) {
			for (int col = 0; col < mat[0].length; col++) {
				{
					mat[fila][col] = 0;
				}
			}
		}
	}

	public void ingresoDeResultados(int fila, int colum, int valor) {
		this.mat[fila][colum] = valor;
	}

	public boolean completoJuego() {
		boolean acumComp = true;
		for (int i = 0; i < filasComp.length; i++) {
			acumComp = acumComp && filasComp[i];
		}
		for (int i = 0; i < columnasComp.length; i++) {
			acumComp = acumComp && columnasComp[i];
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
		for (int col = 0; col < mat[0].length; col++) {
			int suma = 0;
			for (int fila = 0; fila < this.mat.length; fila++) {
				suma = suma + mat[fila][col];
			}
			if (suma == columResul[col]) {
				columnasComp[col] = true;
			} else {
				columnasComp[col] = false;
			}
		}
	}

	private void actualizarFilas() {
		for (int fila = 0; fila < mat.length; fila++) {
			int suma = 0;
			for (int col = 0; col < this.mat[0].length; col++) {
				suma = suma + mat[fila][col];
			}
			if (suma == filaResul[fila]) {
				filasComp[fila] = true;
			} else {
				filasComp[fila] = false;
			}
		}
	}

	public ArrayList<Boolean> filasCompletas() {
		ArrayList<Boolean> filasCompletas = new ArrayList<Boolean>();
		for (int i = 0; i < filasComp.length; i++) {
			filasCompletas.add(filasComp[i]);
		}
		return filasCompletas;
	}

	public ArrayList<Boolean> columnasCompletas() {
		ArrayList<Boolean> columnasCompletas = new ArrayList<Boolean>();
		for (int i = 0; i < columnasComp.length; i++) {
			columnasCompletas.add(columnasComp[i]);
		}
		return columnasCompletas;
	}

	public int[] getColumResul() {
		return columResul;
	}

	public int[] getFilaResul() {
		return filaResul;
	}
	
	
	
	// aux de visualizacion
		public void imprimirMatriz() {
			for (int fila = 0; fila < this.mat.length; fila++) {
				for (int col = 0; col < mat[0].length; col++) {
					System.out.println(this.mat[fila][col]);
				}
			}
		}

}
