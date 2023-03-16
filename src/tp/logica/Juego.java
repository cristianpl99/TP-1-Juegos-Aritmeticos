package tp.logica;
import java.util.Random;

import tp.igu.*; 

public class Juego {
	private int [][] mat;
	private Random random;
	private int [] filaResul;
	private int [] columResul;
	
	public Juego() {
		}
	
	public int[][] crearMatriz(){
		int [][] mat = new int[4][4];
		for (int f = 0; f < 4; f++) {		
			for (int c = 0; c < 4; c++) {
				random = new Random(System.currentTimeMillis());
				mat[f][c] = random.nextInt(4)+1;
			}
		}
		return mat;
	}

}
