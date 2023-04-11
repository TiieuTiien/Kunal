package recursion_1;

public class NumberOfSteps {
	public static void main(String[] args) {
		System.out.println(numberOfSteps(123));
	}

	static int numberOfSteps(int num) {
		return helper(num, 0);
	}

	static int helper(int num, int count) {
		if (num == 1) {
			return count + 1;
		}else if(num == 0){
            return count;
        }

		if (num % 2 == 0) {
			return helper(num / 2, count + 1);
		}

		return helper(num / 2, count + 2);
	}
}
