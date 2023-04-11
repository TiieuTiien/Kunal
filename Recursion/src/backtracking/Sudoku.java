package backtracking;

import java.util.Iterator;

public class Sudoku {
	public static void main(String[] args) {
		int[][]  board = {
				{5,3,0,0,7,0,0,0,0},
				{6,0,0,1,9,5,0,0,0},
				{0,9,8,0,0,0,0,6,0},
				{8,0,0,0,6,0,0,0,3},
				{4,0,0,8,0,3,0,0,1},
				{7,0,0,0,2,0,0,0,6},
				{0,6,0,0,0,0,2,8,0},
				{0,0,0,4,1,9,0,0,5},
				{0,0,0,0,8,0,0,7,9}
		};
		
		if(solve(board)) {
			display(board);
		}else {
			System.out.println("Cannot solve sudoku!");
		}
		
	}

	static boolean solve(int[][] board) {
		int n = board.length;
		int row = -1;
		int col = -1;
		
		boolean emptyLeft = true;
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(board[i][j] == 0) {
					row = i;
					col = j;
					emptyLeft = false;
					break;
				}
			}
			
			// if you found some empty element in row, then break
			if(emptyLeft == false) {
				break;
			}
		}
		
		if 	(emptyLeft == true) {
			return true;
			// sudoku is solved
		}
		
		//backtracking
		for(int number = 1; number <= 9; number++) {
			if(isSafe(board, row, col, number)) {
				board[row][col] = number;
				if(solve(board)) {
					// found the answer
					return true;
				}else {
					// backtracking
					board[row][col] = 0;
				}
			}
		}
		
		return false;
		
	}
	
	static void display(int[][] board) {
		for(int[] row : board) {
			for(int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	
	
	
	static boolean isSafe(int [][] board, int row, int col, int num) {
		
		// check the row
		for(int i = 0; i < board.length; i++) {
			if(board[row][i] == num) {
				return  false;
			}
		}
		
		// check the col
		for(int[] nums : board) {
			if(nums[col] == num) {
				return false;
			}
		}
		
		int sqrt = (int)(Math.sqrt(board.length));
		int rowStart = row - row % sqrt;
		int colStart = col - col % sqrt;
		
		for (int r = rowStart; r < rowStart + sqrt; r++) {
			for (int c = colStart; c < colStart + sqrt; c++) {
				if(board[r][c] == num) {
					return false;
				}
			}
		}
		
		return true;
	}
}


