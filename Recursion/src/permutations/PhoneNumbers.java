package permutations;

import java.util.ArrayList;

public class PhoneNumbers {
	public static void main(String[] args) {
//		ArrayList<String> ans = padArray("", "12");
//		System.out.println(ans);
//		pad("", "23");
		System.out.println(letterCombinations(""));
	}
	
	static ArrayList<String> letterCombinations(String digits){
		return padArray("", digits);
	}
	
	static void pad(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		up.charAt(0);
		int digit = up.charAt(0) - '0'; // convert '2' into 2
		int fDigit = 0, lDigit = 0;
		
		if(digit >1 && digit < 7) {
			fDigit = (digit - 2) * 3;
			lDigit = (digit - 1) * 3;
		}else if(digit == 7) {
			fDigit = (digit - 2) * 3;
			lDigit = (digit - 1) * 3 + 1;			
		}else if(digit == 8) {
			fDigit = (digit - 2) * 3 + 1;
			lDigit = (digit - 1) * 3 + 1;
		}else {
			fDigit = (digit - 2) * 3 + 1;
			lDigit = (digit - 1) * 3 + 2;
		}
		
		for(int i = fDigit; i < lDigit; i++) {
			char ch = (char) ('a' + i);
			pad(p + ch, up.substring(1));
			
		}
	}
	
	static ArrayList<String> padArray(String p, String up) {
		if (up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		up.charAt(0);
		int digit = up.charAt(0) - '0'; // convert '2' into 2
		int fDigit = 0, lDigit = 0;
		
		if(digit >1 && digit < 7) {
			fDigit = (digit - 2) * 3;
			lDigit = (digit - 1) * 3;
		}else if(digit == 7) {
			fDigit = (digit - 2) * 3;
			lDigit = (digit - 1) * 3 + 1;			
		}else if(digit == 8) {
			fDigit = (digit - 2) * 3 + 1;
			lDigit = (digit - 1) * 3 + 1;
		}else {
			fDigit = (digit - 2) * 3 + 1;
			lDigit = (digit - 1) * 3 + 2;
		}
		
		ArrayList<String> ans = new ArrayList<>();
		
		for(int i = fDigit; i < lDigit; i++) {
			char ch = (char) ('a' + i);
			ans.addAll(padArray(p + ch, up.substring(1)));
			
		}
		
		return ans;
	}
	
	static int padCount(String p, String up) {
		if (up.isEmpty()) {
			return  1;
		}
		
		up.charAt(0);
		int digit = up.charAt(0) - '0'; // convert '2' into 2
		
		int count = 0;
		
		for(int i = (digit - 1) * 3; i < digit * 3; i++) {
			char ch = (char) ('a' + i);
			count = count + padCount(p + ch, up.substring(1));
		}
		
		return count;
	}
}
