package Sudoku.src.com.sudoku.models;

public abstract class Board {
	
	protected Point point[][];
	
	protected static int i, j;
	
	public Point getPointAt(int i, int j) {
		return point[i][j];
	}
	
	public void setPointAt(int i, int j, int value) {
		point[i][j].setValue(value);
	}
	
	public abstract boolean valid();
}
