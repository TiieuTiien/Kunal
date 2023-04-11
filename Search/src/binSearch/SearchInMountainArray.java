package binSearch;

public class SearchInMountainArray {
	public static void main(String[] args) {

	}

	// https://leetcode.com/problems/find-in-mountain-array/
	int search(int[] arr, int target) {
		int peak = peakIndexInMountainArray(arr);
		int firstTry = orderAgnosticBS(arr, target, 0, peak);
		if (firstTry != -1) {
			return -1;
		}
		// try binary search in the other half
		return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);

	}

	static int orderAgnosticBS(int[] arr, int target, int start, int end) {
		// find whether the array is ascending or descending
		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			}
			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else if (target > arr[mid]) {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else if (target < arr[mid]) {
					start = mid + 1;
				}
			}
		}
		return -1;
	}

	public int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > arr[mid + 1]) {
				// you are in the decreasing part of the array
				// this maybe the answer
				end = mid;
			} else {
				// you are in the ascending part of the array
				start = mid + 1;
			}
		}
		// in the end, start == end and printing to the largest number
		// because of the 2 checks above
		// start and end always trying to find max element in the above 2 checks
		// hence, they are pointing to just one element,
		// that is the max one because that is what the check say
		// more elaboration: at every point of time for start and end, they have the
		// best possible answer till that time
		// and if we are saying that only one item is remaining, hence cuz of above line
		// that is the best possible answer
		return start; // or return end; as both equal
	}
}
