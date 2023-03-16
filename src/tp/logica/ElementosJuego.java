package tp.logica;

import java.util.Random;

public class ElementosJuego {
	private int [][] mat;
	private Random random;
	private int [] filaResul;
	private int [] columResul;

	public ElementosJuego(int filas, int columnas) {
		for (int f = 0; f < filas; f++) {		
			for (int c = 0; c < columnas; c++) {
				random = new Random(System.currentTimeMillis());
				this.mat[f][c] = random.nextInt(4)+1;
		
		
			}
		}
	}
}
