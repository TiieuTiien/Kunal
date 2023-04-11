package recursion_1;

public class ProductOfNToOne {
	public static void main(String[] args) {
		System.out.println(pOfNToOne(5));
	}

	static int pOfNToOne(int n) {
		if (n <= 1) {
			return 1;
		}
		return pOfNToOne(n - 1) * n;
	}
}
