package tp.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import tp.persistence.Persistence;

public class ArithmeticGame {

	private int[][] valuesMat;
	private Random random;
	private int[] rowsResults;
	private int[] columnsResults;
	private boolean[] completedRows;
	private boolean[] completedColumns;

	// constructor
	public ArithmeticGame(int rows, int columns) {
		int mat[][] = new int[rows][columns];
		random = new Random(System.currentTimeMillis());
		for (int fila = 0; fila < mat.length; fila++) {
			for (int col = 0; col < mat[0].length; col++) {
				{
					mat[fila][col] = random.nextInt(9) + 1;
				}
			}
		}
		this.valuesMat = mat;
		// aux visualizacion
		this.printMat();

		completedRows = new boolean[rows];
		for (int i = 0; i < completedRows.length; i++) {
			completedRows[i] = false;
		}

		completedColumns = new boolean[columns];
		for (int i = 0; i < completedColumns.length; i++) {
			completedColumns[i] = false;
		}

		int[] rowResult = new int[rows];
		for (int f = 0; f < mat.length; f++) {
			int rowSum = 0;
			for (int c = 0; c < mat[0].length; c++) {
				rowSum = rowSum + mat[f][c];
			}
			rowResult[f] = rowSum;
			rowSum = 0;
			this.rowsResults = rowResult;

		}

		int[] columnResult = new int[columns];
		for (int c = 0; c < mat[0].length; c++) {
			int columnSum = 0;
			for (int f = 0; f < mat.length; f++) {
				columnSum = columnSum + mat[f][c];
			}
			columnResult[c] = columnSum;
			columnSum = 0;
			this.columnsResults = columnResult;
		}

		// se setea todo en 0 para poder jugar con varios resultados posibles
		for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[0].length; col++) {
				{
					mat[row][col] = 0;
				}
			}
		}
	}

	public ArithmeticGame() {
	}

	// aux de visualizacion
	public void printMat() {
		for (int i = 0; i < this.valuesMat.length; i++) {
			for (int j = 0; j < this.valuesMat[0].length; j++) {
				System.out.print(this.valuesMat[i][j] + " ");
		}
			System.out.println();
		}
	}

	// funciones
	public void enterResults(int fila, int colum, int valor) {
		valuesMat[fila][colum] = valor;
	}

	public boolean isGameComplete() {
		boolean ret = true;
		for (int i = 0; i < completedRows.length; i++) {
			ret = ret && completedRows[i];
		}
		for (int i = 0; i < completedColumns.length; i++) {
			ret = ret && completedColumns[i];
		}
		return ret;
	}

	public void updateMatStatus() {
		updateRows();
		updateColumns();
	}

	private void updateColumns() {
		for (int col = 0; col < valuesMat[0].length; col++) {
			int colSum = 0;
			for (int fila = 0; fila < valuesMat.length; fila++) {
				if (valuesMat[fila][col] == 0) {
					colSum = 0;
					break;
				} else {
					colSum = colSum + valuesMat[fila][col];
				}
			}
			if (colSum == columnsResults[col]) {
				completedColumns[col] = true;
			} else {
				completedColumns[col] = false;
			}
		}
	}

	private void updateRows() {
		for (int fila = 0; fila < valuesMat.length; fila++) {
			int sumaDeLaFila = 0;
			for (int col = 0; col < valuesMat[0].length; col++) {
				if (valuesMat[fila][col] == 0) {
					sumaDeLaFila = 0;
					break;
				} else {
					sumaDeLaFila = sumaDeLaFila + valuesMat[fila][col];
				}
			}
			if (sumaDeLaFila == rowsResults[fila]) {
				completedRows[fila] = true;
			} else {
				completedRows[fila] = false;
			}
		}
	}

	public ArrayList<Boolean> completedRows() {
		ArrayList<Boolean> compRows = new ArrayList<Boolean>();
		for (int i = 0; i < completedRows.length; i++) {
			compRows.add(completedRows[i]);
		}
		return compRows;
	}

	public ArrayList<Boolean> completeColumnss() {
		ArrayList<Boolean> compCols = new ArrayList<Boolean>();
		for (int i = 0; i < completedColumns.length; i++) {
			compCols.add(completedColumns[i]);
		}
		return compCols;
	}

	public void createPlayer(String name, int score, String level) {
		Player player = new Player(name, score, level);
		Persistence persistence = new Persistence();
		persistence.savePlayer(player);
	}

	public List<Player> jugadoresDelPodio() {
		Persistence persistencia = new Persistence();
		return persistencia.fetchPlayers();
	}

	public int getColumResults(int resul) {
		return columnsResults[resul];
	}

	public int getRowResults(int resul) {
		return rowsResults[resul];
	}

}
