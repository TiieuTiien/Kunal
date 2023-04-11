package string;

public class Palindrome {
	
	public static void main(String[] args) {
		String str = "";
		
		System.out.println(palindrome(str));
		System.out.println(isPalindrome(str));
	}
	
	// while loop
	public static boolean palindrome(String str) {
		str = str.toLowerCase();
		int start = 0; 
		int end = str.length() - 1;
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		
		return true;
	}
	
	// for loop
	public static boolean isPalindrome(String str) {
		
		if(str == null || str.length() == 0) {
			return true;
		}
		
		str = str.toLowerCase();
		for(int i = 0; i <= str.length()/2; i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length() - i - 1);
			
			if(start != end) {
				return false;
			}
			
		}
		
		return true;
	}
}
