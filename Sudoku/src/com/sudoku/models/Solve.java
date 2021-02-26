package com.sudoku.models;

public class Solve {
	/*
	 * Solves any valid Sudoku puzzle, 
	 * start with DFS
	 * then implement more intelligent search*/
	
	// find empty board method : return 2 element array with positions
	public int[] empty(MainBoard board) {
		for (int i = 0; i < board.point[0]; i++) {
			for (int j = 0; j < board.point[0]; j++) {
				
			}
		}
		return null;
	}
	
	// solve method
	public boolean solve(MainBoard board) {
		return false;
	}
	
	// valid method for constraint satisfaction
	public boolean valid(MainBoard board, int number, int[] position) {
		return false;
	}
}
