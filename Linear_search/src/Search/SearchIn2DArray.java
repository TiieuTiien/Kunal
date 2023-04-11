package Search;

import java.util.Arrays;

public class SearchIn2DArray {
	public static void main(String[] args) {
		int[][] arr = { { 21, 14, 51, 62 }, // 0
				{ 12, 15, 61, 94 }, // 1
				{ 12, 51, 61, 37 },// 2
				// 0 1 2 3
		};
		int target = 94;
		int[] ans = search(arr, target);
		System.out.println(Arrays.toString(ans));
		System.out.println(max(arr));
	}

	private static int[] search(int[][] arr, int target) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return new int[] { row, col };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	static int max(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int[] ints : arr) {
			for (int element : ints) {
				if (element > max) {
					max = element;
				}
			}
		}

		return max;
	}
}
