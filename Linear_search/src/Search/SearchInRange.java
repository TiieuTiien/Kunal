package Search;

public class SearchInRange {
	public static void main(String[] args) {
		int[] arr = { 12, 32, 1, 34, 62, 21, 15, 55 };
		int target = 12;
		System.out.println(searchInRange(arr, target, 2, 6));
	}

	static int searchInRange(int[] arr, int target, int start, int end) {
		if (arr.length == 0) {
			return -1;
		}

		for (int i = start; i < end; i++) {
			int element = arr[i];
			if (element == target) {
				return i;
			}
		}
		return -1;
	}
}
