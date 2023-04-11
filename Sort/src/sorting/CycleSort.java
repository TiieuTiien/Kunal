package sorting;

import java.util.Arrays;

public class CycleSort {

	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		
		System.out.println(Arrays.toString(nums));		
	}
	
	public static void cycle(int[] arr) {
		int i = 0;
		while(i<arr.length) {
			int correct = arr[i]-1;
			if(arr[i]!=arr[correct]) {
				swap(arr, i, correct);
			}else
				i++;
		}
	}
	
	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
