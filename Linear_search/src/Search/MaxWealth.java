package Search;

public class MaxWealth {
	// https://leetcode.com/problems/richest-customer-wealth/
	
	public static void main(String[] args) {
		
	}
	
	public int maximumWealth(int[][] accounts) {
		// person = row
		// account = col
		int ans = Integer.MIN_VALUE;
		for(int[] ints : accounts) {
			// when you start a new column take a new sum for that column
			int sum = 0;
			for(int anInt : ints) {
				sum += anInt;
			}
			// now we have sum account of person
			// check with overall ans
			if(sum>ans) {
				ans = sum;
			}
		}
		return ans;
	}
}
