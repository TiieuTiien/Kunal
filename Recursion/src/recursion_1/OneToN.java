package recursion_1;

public class OneToN {
	public static void main(String[] args) {
		OneToN(5);
	}

	static void OneToN(int n) {
		if (n == 0) {
			return;
		}
		OneToN(n - 1);
		System.out.print(n + " ");
	}
}
