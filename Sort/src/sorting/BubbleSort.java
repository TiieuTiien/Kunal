package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {5, 2, 3, 4, 1};
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubble(int[] arr) {
		// run the steps n - 1 times
		for (int i = 0; i < arr.length; i++) {
			// for each step, max item will become at the last respective index
			for (int j = 1; j < arr.length - i; j++) {
				// swap if the item is smaller than the previous item
				if(arr[j] < arr[j-1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
}
