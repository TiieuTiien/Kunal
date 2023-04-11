package Search;

public class FindMin {
	public static void main(String[] args) {
		int[] arr = { 12, 32, 1, 34, 62, 21, 15, 55 };
		System.out.println(min(arr));
	}

	private static int min(int[] arr) {
		int min = arr[0];
		
		for (int i : arr) {
			if(i<min) {
				min = i;
			}
		}
		
		return min;
	}
}
