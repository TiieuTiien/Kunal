package number;

public class Sieve {
	public static void main(String[] args) {
		int n = 37;
		boolean[] primes = new boolean[n+1];
		sieveOfErathoneses(n, primes);
	}
	
	// false in array means number is prime
	static void sieveOfErathoneses(int n, boolean[] primes) {
		for(int i = 2; i * i <= n; i++) {
			if(!primes[i]) {
				for(int j = i*i; j <= n; j+=i) {
					primes[j] = true;
				}
			}
		}
		
		for(int i = 2; i <= n; i++) {
			if(!primes[i]) {
				System.out.print(i + " ");
			}
		}
	}
}
