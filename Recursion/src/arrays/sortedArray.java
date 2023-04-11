package arrays;

public class sortedArray {
	public static void main(String[] args) {
		int[] arr = {1, 7, 5, 6};
		System.out.println(SortedArray(arr, 0));
	}

	private static boolean SortedArray(int[] arr, int i) {
		if(i == arr.length - 1) {
			return true;
		}
		return (arr[i] < arr[i+1]) && SortedArray(arr, i + 1);
	}
	
	
}
