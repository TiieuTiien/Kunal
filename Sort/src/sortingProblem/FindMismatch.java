package sortingProblem;

public class FindMismatch {

	public int[] findErrorNums(int[] nums) {
		int i = 0;
		while(i<nums.length) {
			if(nums[i]!=nums[nums[i]] - 1 ) {
				swap(nums, i, nums[i]);
			}else
				i++;
		}
		
		// search for first missing number
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				return new int[] {nums[index], index+1}; 
			}
		}
		
		return new int[] {-1, -1};
	}

	static void swap(int[] nums, int first, int second) {
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
	}
}
