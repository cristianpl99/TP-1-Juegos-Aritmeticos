package tp.logica;

import java.util.Random;

public class ElementosJuego {
	private int [][] mat;
	private Random random;
	private int [] filaResul;
	private int [] columResul;

	public ElementosJuego(int filas, int columnas) {
		int mat[][] = new int[filas][columnas];
		for (int f = 0; f < filas; f++) {		
			for (int c = 0; c < columnas; c++) {
				random = new Random(System.currentTimeMillis());
				mat[f][c] = random.nextInt(4);		
			}
		}
		this.mat = mat;
		
		int[] filaResul = new int[filas];
		for (int f = 0; f < mat.length; f++) {
			int sum = 0;
		    for (int c = 0; c < mat[0].length; c++) {
		    	sum = sum + mat[f][c];
		    }
		    filaResul[f] = sum;
		this.filaResul = filaResul;
		
		}
		int[] columResul = new int[columnas];
		for (int c = 0; c < mat[0].length; c++) {
			int sum = 0;
		    for (int f = 0; f < mat.length; f++) {
		    	sum = sum + mat[f][c];
		    }
		    columResul[c] = sum;
		this.columResul = columResul;
		}
	}
	public int elemMat (int fila, int col) {
		return this.mat[fila][col];
	}

	public int[][] getMat() {
		return mat;
	}
	
	public int[] getFilaResul() {
		return filaResul;
	}

	public int[] getColumResul() {
		return columResul;
	}
	
}
