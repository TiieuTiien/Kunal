package number;

public class PowOfTwo {
	public static void main(String[] args) {
		int n = 0;
		
		System.out.println(isPowOfTwo(n));
	}

	private static boolean isPowOfTwo(int n) {
		return (n&(n-1)) == 0;
	}
}
