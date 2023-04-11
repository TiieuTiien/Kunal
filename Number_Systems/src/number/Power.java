package number;

public class Power {
	public static void main(String[] args) {
		int base = 0;
		int power = 0;
		
		System.out.println(power(base, power));
		
	}

	private static int power(int base, int power) {
		int ans = 1;
		while(power > 0) {
			if((power & 1) == 1) {
				ans *= base;
			}
			base *= base;
			power >>= 1;
		}
		return ans;
	}
}
