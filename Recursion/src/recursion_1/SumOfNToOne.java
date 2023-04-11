package recursion_1;

public class SumOfNToOne {
	public static void main(String[] args) {
		System.out.println(sum(1));
	}

	static int sum(int n) {
		if (n == 1) {
			return 1;
		}
		return sum(n - 1) + n;
	}
}
