package sorting;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 2, 1};
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	static void quickSort(int[] nums, int low, int hi) {
		if(low >= hi) {
			return;
		}
		
		int s = low;
		int e = hi;
		int m = s + (e - s) / 2;
		int pivot = nums[m];
		
		while(s <= e) {
			
			// while it is already sorted no need to swap
			while(nums[s] < pivot) { 
				s++;
			}
			while(nums[e] > pivot) {
				e--;
			}
			
			if(s <= e) {
				int temp = nums[s];
				nums[s] = nums[e];
				nums[e] = temp;
				s++;
				e--;
			}
			
		}
		
		
		// now my pivot is at the correct index please sort two half
		quickSort(nums, low, e);
		quickSort(nums, s, hi);
	}
}






