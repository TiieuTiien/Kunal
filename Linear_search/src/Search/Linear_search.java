package Search;

public class Linear_search {
	public static void main(String[] args) {
		int[] arr = { 12, 32, 1, 34, 62, 21, 15, 55 };
		int target = 21;
		int ans = linearSearch2(arr, target);
		System.out.println(ans);
	}

	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (element == target) {
				return i;
			}
		}
		return -1;
	}

	static int linearSearch2(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		for (int element : arr) {
			if (element == target) {
				return element;
			}
		}
		return -1;
	}

	static boolean linearSearch3(int[] arr, int target) {
		if (arr.length == 0) {
			return false;
		}

		for (int element : arr) {
			if (element == target) {
				return true;
			}
		}
		return false;
	}
}
