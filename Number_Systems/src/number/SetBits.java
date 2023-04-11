package number;

public class SetBits {
	public static void main(String[] args) {
		int n = 111;
		
		System.out.println(Integer.toBinaryString(n));
		
		System.out.println(setBits(n));
	}

	private static int setBits(int n) {
		int count = 0;
		
//		I don't really understand this but it works and someday i will figure that out
//		while(n > 0) {
//			count++;
//			n -= (n & -n);
//		}
		
		while(n > 0) {
			count++;
			n = n & (n - 1);
		}
		
		return count;
	}
}
