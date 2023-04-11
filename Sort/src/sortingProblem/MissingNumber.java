package sortingProblem;
//https://leetcode.com/problems/missing-number/

public class MissingNumber {
	
	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		
	}
	
    public static int missingNumber(int[] nums) {
		int i = 0;
		while(i<nums.length) {
			if(nums[i] < nums.length && nums[i]!=nums[nums[i]]) {
				swap(nums, i, nums[i]);
			}else
				i++;
		}
		
		// search for first missing number
		for(i = 0; i < nums.length; i++) {
			if(nums[i]!=i) {
				return i;
			}
		}
		
		return nums.length;
	}
	
	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
    public static int missingNumber2(int[] nums) {
    	
//		missingSort(nums);
        
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i]!=i) {
    			return i;
    		}
    	}
    	
    	return nums.length;
    }
}