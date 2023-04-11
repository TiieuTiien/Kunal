package recursion_1;

public class NtoOne {
	public static void main(String[] args) {
		nToOne(10);
	}
	
	static void nToOne(int n) {
		if (n == 0) {
			return;
		}
		
		System.out.print(n + " ");
		nToOne(n-1);
	}
}
