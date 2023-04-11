package subset;

public class Pow {
	public static void main(String[] args) {
		int a = 3;
		int n = 2;
		System.out.println(power2(a, n));
	}

	private static int power(int a, int n) {
		if (n == 0) {
			return 1;
		}

		if (a == 0) {
			return 0;
		}
		if (n % 2 == 0) {
			return power(a * a, n / 2);
		} else {
			return a * power(a * a, n / 2);
		}
	}

	static int power2(int a, int n) {
		if (n == 1) {
			return a;
		} else {
			int x = power2(a, n / 2);
			if (n % 2 == 0) {
				return x * x;
			} else {
				return x * x * a;
			}
		}
	}
}
