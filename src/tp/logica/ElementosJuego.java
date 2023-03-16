package tp.logica;

import java.util.Random;

public class ElementosJuego {
	private int [][] mat;
	private Random random;
	private int [] filaResul;
	private int [] columResul;

	public ElementosJuego(int filas, int columnas) {
		int mat[][] = new int[filas][columnas];
		random = new Random(System.currentTimeMillis());
		for (int fila =0; fila<mat.length; fila++) {
			for (int col =0; col<mat[0].length; col ++) { {
				mat[fila][col] = random.nextInt(4)+ 1;		
			}
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
		    sum =0;
		this.filaResul = filaResul;
		
		}
		int[] columResul = new int[columnas];
		for (int c = 0; c < mat[0].length; c++) {
			int sum = 0;
		    for (int f = 0; f < mat.length; f++) {
		    	sum = sum + mat[f][c];
		    }
		    columResul[c] = sum;
		    sum=0;
		this.columResul = columResul;
		}
	}
	 //auxiliar para ver el log
	public void imprimirMatriz() {
		for (int fila =0; fila<this.mat.length; fila++) {
			for (int col =0; col<mat[0].length; col ++) {
				System.out.println(this.mat[fila][col]);
			}
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
