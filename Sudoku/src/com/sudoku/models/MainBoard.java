package com.sudoku.models;

public class MainBoard extends Board {
	
	private Subboard subboard[][];
	private Line[] row, column;
	
	public MainBoard() {
		point = new Point[9][9];
		for(i = 0; i < 9; i++) {
			
			for(j = 0; j < 9; j++) {
				
				point[i][j] = new Point(0);
			}
		}
		
		subboard = new Subboard[3][3];
		for(i = 0; i < 3; i++) {
			
			for(j = 0; j < 3; j++) {
				
				subboard[i][j] = new Subboard();
			}
		}
		
		row = new Line[9];
		column = new Line[9];
		for(i = 0; i < 9; i++) {
			
			row[i] = new Line();
			column[i] = new Line();
		}
		connectAllThing();
	}
	
	private void connectAllThing() {
		
		for(i = 0; i < 3; i++) {
			
			for(j = 0; j < 3; j++) {
				
				subboard[i][j].setSubboard(point, 3*i, 3*j);
			}
		}
		
		for(i = 0; i < 9; i++) {
			
			row[i].setRow(point, i);
			column[j].setColumn(point, i);
		}
		
		for(i = 0; i < 9; i++) {
			
			for(j = 0; j < 9; j++) {
				
				point[i][j].setRow(row[i]);
				point[i][j].setColumn(column[j]);
				point[i][j].setSubboard(subboard[i/3][j/3]);
				point[i][j].setRowLocation(i);
				point[i][j].setColumnLocation(j);
			}
		}
	}
	
	public void setBoard(int board[][]) {
		
		for(i = 0; i < 9; i++) {
			
			for(j = 0; j < 9; j++) {
				
				if(board[i][j] != 0) {
					
					point[i][j].setValue(board[i][j]);
					point[i][j].fixedPoint();
				}
			}
		}
	}
	
	public boolean valid() {
		
		for(i = 0; i < 3; i++) {
			
			for(j = 0; j < 3; j++) {
				
				if(!subboard[i][j].valid()) return false;
			}
		}
		
		for(i = 0; i < 9; i++) {
			
			if(!row[i].valid() || !column[i].valid()) return false;
		}
		return true;
	}
	
	public String toString() {
		String s = "";
		for(i = 0; i < 9; i++) {
			
			if(i%3 == 0) s += "\n";
			s += row[i] + "\n";
		}
		return s;
	}
}
