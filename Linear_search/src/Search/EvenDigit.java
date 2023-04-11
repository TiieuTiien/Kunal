package Search;

public class EvenDigit {
	public static void main(String[] args) {
		int[] num = { 12, 345, 2, 6, -127896 };
		System.out.println(digits2(12312));
	}

	static int findNumbers(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (even(num)) {
				count++;
			}
		}

		return count;
	}

	static int digits2(int num) {
		if (num < 0) {
			num += -1;
		}
		return (int) (Math.log10(num)) + 1;
	}

	static boolean even(int num) {
		int numberOfDigits = digits2(num);
		if (numberOfDigits % 2 == 0) {
			return true;
		}
		return false;
	}

	static int digits(int num) {
		if (num < 0) {
			num += -1;
		}
		if (num == 0) {
			return 1;
		}
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		return count;
	}
}
