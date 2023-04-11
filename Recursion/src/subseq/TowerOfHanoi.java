package subseq;

class TowerOfHanoi {
	static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
		if (n == 0) {
			return;
		}
		towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
		System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
		towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
	}
	
	static void pm(int start, int end) {
		System.out.println(start + "->" + end);
	}
	
	static void toh(int n, int start, int end) {
		if(n == 1) {
			pm(start, end);
		}else {
			int other = 6 - (start + end);
			toh(n - 1, start, other);
			pm(start, end);
			toh(n - 1, other, end);
		}
	}

	// Driver code
	public static void main(String args[]) {
		int N = 4;

		// A, B and C are names of rods
		toh(3, 1, 3);
	}
}
