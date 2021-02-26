package com.sudoku.models;

public class Line {
	
	private Point point[];
	
	public Line() {
		point = new Point[9];
	}
	
	public Line(Subboard X) {
		point = new Point[9];
		for(i = 0; i < 9; i++) {
			point[i] = X.getPointAt(i/3, i%3);
		}
	}
	
	public void setRow(Point[][] mainBoardPoint,int index11Row) {
		
		for(i = 0; i < 9; i++) {
			point[i] = mainBoardPoint[index11Row][i];
		}
	}
	
	public void setColumn(Point[][] mainBoardPoint, int index11Column) {
		
		for(i = 0; i < 9; i++) {
			point[i] = mainBoardPoint[i][index11Column];
		}
	}
	
	public boolean valid() {
		
		for(i = 0; i < 9; i++) {
			for(j = 0; j < i; j++) {
				if(point[i].getValue() == point[j].getValue()) {
					return false;
				}
			}
		}
		return true;
	}
	
	public String toString() {
		String s = "   ";
		for(i = 0; i < 9; i++) {
			if(i%3 == 0) s += "    ";
			s += point[i] + "  ";
		}
		return s;
	}
	
	private static int i, j;
}
