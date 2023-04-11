package recursion_1;

public class CountZero {
	public static void main(String[] args) {
		System.out.println(count(100060909));
	}
	
	static int count(int n) {
		return countZero(n, 0);
	}
	
	static int countZero(int n, int c) {
		if(n == 0) {
			return c;
		}else if(n%10 == 0) {
			return countZero(n/10, c += 1);
		}
		return countZero(n/10, c);
	}
}
