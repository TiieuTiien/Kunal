package arrays;

import java.util.ArrayList;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {1, 7, 5, 5, 5, 6};
		ArrayList<Integer> list = findAllIndex2(arr, 5, 0);
		System.out.println(list.toString());
	}
	
	static boolean linearSearch(int[] arr, int target, int index) {
		if(index == arr.length - 1) {
			return false;
		}
		return arr[index] == target || linearSearch(arr, target, index + 1);
	}
	
	static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
		if(index == arr.length) {
			return list;
		}
		
		if(arr[index]==target) {
			list.add(index);
		}
		
		return findAllIndex(arr, target, index + 1, list);
	}
	
	static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		if(index == arr.length) {
			return list;
		}
		
		// this will contain answer for that function call only
		if(arr[index]==target) {
			list.add(index);
		}
		
		ArrayList<Integer> ansFromBellowsCalls = findAllIndex2(arr, target, index + 1);
		
		list.addAll(ansFromBellowsCalls);
		
		return list;
	}
}
