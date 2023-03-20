package tp.logica;

import java.util.Random;

public class ElementosJuego {
	int[][] mat;
	Random random;
	int[] filaResul;
	int[] columResul;
	boolean[] filasComp;
	boolean[] columnasComp;

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
		//aux visualizacion
		this.imprimirMatriz();

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
	
	public void imprimirMatriz() {
		for (int fila = 0; fila < this.mat.length; fila++) {
			for (int col = 0; col < this.mat[0].length; col++) {
				System.out.println(this.mat[fila][col]);
			}
		}
	}
}
