
public class Point {
	
	private int value;
	private Subboard subboard;
	private Line row, column;
	private int rowLocation, columnLocation;
	private boolean fixedPoint;
	
	public Point(int x) {
		setValue(x);
		rowLocation = columnLocation = 0;
		subboard = null;
		row = column = null;
		fixedPoint = false;
	}
	
	public void setValue(int x) {
		value = x;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setSubboard(Subboard inSubboard) {
		subboard = inSubboard;
	}
	
	public void setRow(Line inRow) {
		row = inRow;
	}
	
	public void setColumn(Line inColumn) {
		column = inColumn;
	}
	
	public Subboard getSubboard() {
		return subboard;
	}
	
	public Line getRow() {
		return row;
	}
	
	public Line getColumn() {
		return column;
	}
	
	public void setRowLocation(int mainBoardRow) {
		rowLocation = mainBoardRow;
	}
	
	public void setColumnLocation(int mainBoardColumn) {
		columnLocation = mainBoardColumn;
	}
	
	public int getRowLocation() {
		return rowLocation;
	}
	
	public int getColumnLocation() {
		return columnLocation;
	}
	
	public void fixedPoint() {
		fixedPoint = true;
	}
	
	public boolean isFixed() {
		return fixedPoint;
	}
	
	public String toString() {
		if(value == 0) return "[  ]";
		else return "[" + value + ']';
	}
}
