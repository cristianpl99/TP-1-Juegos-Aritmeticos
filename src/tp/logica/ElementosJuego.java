package tp.logica;

import java.util.ArrayList;
import java.util.Random;

public class ElementosJuego {
	private int[][] mat;
	private boolean[][] matrizChequeo;
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
		for(int i = 0; i < filasComp.length; i++) {
			filasComp[i] = false;
		}
			
		columnasComp = new boolean[columnas];
		for(int i = 0; i < columnasComp.length; i++) {
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
		boolean[][] matrizChequeo = new boolean[filas][columnas];
		for (int fila = 0; fila < matrizChequeo.length; fila++) {
			for (int col = 0; col < matrizChequeo[0].length; col++) {
				{
					matrizChequeo[fila][col] = false;
				}
			}
		}
		this.matrizChequeo = matrizChequeo;
	}

	public void chequeoDeResultados(int fila, int colum, int valor) {
		if (this.mat[fila][colum] == valor) {
			this.matrizChequeo[fila][colum] = true;
		} else {
			this.matrizChequeo[fila][colum] = false;
		}
	}
	// aux de visualizacion
		public boolean completoJuego() {
			for (int fila = 0; fila < this.mat.length; fila++) {
				for (int col = 0; col < mat[0].length; col++) {
					if(this.matrizChequeo[fila][col] == false) {
						return false;
					}
				}
			}
			return true;
		}

	// aux de visualizacion
	public void imprimirMatriz() {
		for (int fila = 0; fila < this.mat.length; fila++) {
			for (int col = 0; col < mat[0].length; col++) {
				System.out.println(this.mat[fila][col]);
			}
		}
	}

	// aux de visualizacion
	public void imprimirMatrizBoolean() {
		for (int fila = 0; fila < this.matrizChequeo.length; fila++) {
			for (int col = 0; col < matrizChequeo[0].length; col++) {
				System.out.println(this.matrizChequeo[fila][col]);
			}
		}
	}
	
	//Nota de Jere: Hay que hacerle un test apropiado donde veamos que si las casillas son correctas y el boolean es false, actualiza los valores y viceversa
	//sino no cambia los booleans
	public void actualizarEstado() {
		actualizarFilas();
		actualizarColumnas();
	}
	
	private void actualizarColumnas() {
		for (int col = 0; col < mat[0].length; col++) {
			boolean casillasColum = true;
			for (int fila = 0; fila < this.mat.length; fila++) {
				casillasColum = casillasColum && matrizChequeo[fila][col];
			}
			columnasComp[col] = casillasColum;
		}
	}
	
	private void actualizarFilas() {
		for (int fila = 0; fila < this.mat.length; fila++) {
			boolean casillasFila = true;
			for (int col = 0; col < mat[0].length; col++) {
				casillasFila = casillasFila && matrizChequeo[fila][col];
			}
			filasComp[fila] = casillasFila;
		}	
	}
	
	public ArrayList<Boolean> filasCompletas() {
		ArrayList<Boolean> filasCompletas = new ArrayList<Boolean>();
		for(int i = 0; i < filasComp.length; i++) {
			filasCompletas.add(filasComp[i]);
		}
		return filasCompletas;
	}
	
	public ArrayList<Boolean> columnasCompletas() {
		ArrayList<Boolean> columnasCompletas = new ArrayList<Boolean>();
		for(int i = 0; i < columnasComp.length; i++) {
			columnasCompletas.add(columnasComp[i]);
		}
		return columnasCompletas;
	}

	public int elemMat(int fila, int col) {
		return this.mat[fila][col];
	}

	public int[] getColumResul() {
		return columResul;
	}

	public int[] getFilaResul() {
		return filaResul;
	}

	

}
