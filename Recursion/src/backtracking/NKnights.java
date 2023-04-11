package backtracking;

public class NKnights {
	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		knight(board, 0, 0, 4);
	}
	
	static void knight(boolean[][] board, int row, int col, int knights) {
		if(knights == 0) {
			display(board);
			return;
		}
		
		if(row == board.length - 1 && col == board.length) {
			return;
		}
		
		if(col == board.length) {
			knight(board, row + 1, 0, knights);
			return;
		}
		
		if(isSafe(board, row, col)) {
			board[row][col] = true;
			knight(board, row, col + 1, knights - 1);
			board[row][col] = false;
		}
		
		knight(board, row, col + 1, knights);
		
		return;
	}	

	private static boolean isSafe(boolean[][] board, int row, int col) {
		if(isValid(board, row - 2, col - 1)) {
			if(board[row][col]) {
				return false;
			}
		}

		if(isValid(board, row - 2, col + 1)) {
			if(board[row][col]) {
				return false;
			}
		}

		if(isValid(board, row - 1, col - 2)) {
			if(board[row][col]) {
				return false;
			}
		}

		if(isValid(board, row - 1, col + 2)) {
			if(board[row][col]) {
				return false;
			}
		}
		
		return true;
	}
	
	// do not repeat your self
	static boolean isValid(boolean[][] board, int row, int col) {
		if(row >= 0 && col < board.length && col >= 0 && row < board.length) {
			return true;
		}
		return false;
	}

	private static void display(boolean[][] board) {
		for(boolean[] row : board) {		
			for(boolean element : row) {
				if(element) {
					System.out.print("K ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
