package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeCount {
	public static void main(String[] args) {
//		pathDiagonal("", 3, 3);
		boolean[][] board = {
				{true, true, true},
				{true, true, true},
				{true, true, true},
				
		};
		
		int[][] path = new int[board.length][board[0].length];
		
		allPathPrint("", board, 0, 0, path, 1);
	}
// Magiccccccccccccc
	static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][]path, int step) {
		if(r == maze.length - 1 && c == maze[0].length - 1) {
			path[r][c] = step;
			for(int[] arr : path) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(p);
			System.out.println();
			return;
		}
		
		if(!maze[r][c]) {
			return;
		}
		
		// i am considering this block in my path
		maze[r][c] = false;
		path[r][c] = step;
		
		if(r < maze.length - 1 ) {
			allPathPrint(p + 'D', maze, r + 1, c, path, step + 1);
		}
		
		if(c < maze[0].length - 1) {
			allPathPrint(p + 'R', maze, r, c + 1, path, step + 1);
		}
		
		if(r > 0 ) {
			allPathPrint(p + 'U', maze, r - 1, c, path, step + 1);
		}
		
		if(c > 0) {
			allPathPrint(p + 'L', maze, r, c - 1, path, step + 1);
		}
		
		// this line is where the function will be over
		// before the function get removed, also remove the change that were made by that function
		maze[r][c] = true;
		path[r][c] = 0;
	}
	
	static int count(int r, int c) {
		if(r == 1 || c == 1) {
			return 1;
		}
		
		int left = count(r - 1, c);
		int right = count(r, c - 1);
		
		return left + right;
	}
	
	static void path(String p, int r, int c) {
		if(r == 1 && c == 1) {
			System.out.println(p);
			return;
		}
		
		if(r > 1) {
			path(p + 'D', r - 1, c);
		}
		
		if(c > 1) {
			path(p + 'R', r, c - 1);
		}
	}
	
	static ArrayList<String> pathArray(String p, int r, int c) {
		if(r == 1 && c == 1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> list = new ArrayList<>();
		
		if(r > 1 && c > 1) {
			list.addAll(pathArray(p + 'D', r - 1, c - 1));
		}
		
		if(r > 1) {
			list.addAll(pathArray(p + 'V', r - 1, c));
		}
		
		if(c > 1) {
			list.addAll(pathArray(p + 'H', r, c - 1));
		}
		
		return list;
	}

	static void pathDiagonal(String p, int r, int c) {
		if(r == 1 && c == 1) {
			System.out.println(p);
			return;
		}
		
		if(r > 1 && c > 1) {
			pathDiagonal(p + 'D', r - 1, c - 1);
		}
		
		if(r > 1) {
			pathDiagonal(p + 'V', r - 1, c);
		}
		
		if(c > 1) {
			pathDiagonal(p + 'H', r, c - 1);
		}
	}

	static void pathFourWay(String p, boolean[][] maze, int r, int c) {
		if(r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(p);
			return;
		}
		
		if(!maze[r][c]) {
			return;
		}
		
		// i am considering this block in my path
		maze[r][c] = false;
		
		if(r < maze.length - 1 ) {
			pathFourWay(p + 'D', maze, r + 1, c);
		}
		
		if(c < maze[0].length - 1) {
			pathFourWay(p + 'R', maze, r, c + 1);
		}
		
		if(r > 0 ) {
			pathFourWay(p + 'U', maze, r - 1, c);
		}
		
		if(c > 0) {
			pathFourWay(p + 'L', maze, r, c - 1);
		}
		
		// this line is where the function will be over
		// before the function get removed, also remove the change that were made by that function
		maze[r][c] = true;
	}

	static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
		if(r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(p);
			return;
		}
		
		if(!maze[r][c]) {
			return;
		}
		
		if(r < maze.length - 1 ) {
			pathRestrictions(p + 'D', maze, r + 1, c);
		}
		
		if(c < maze[0].length - 1) {
			pathRestrictions(p + 'R', maze, r, c + 1);
		}
	}
}