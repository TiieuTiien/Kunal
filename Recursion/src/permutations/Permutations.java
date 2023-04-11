package permutations;

import java.util.ArrayList;

public class Permutations {
	public static void main(String[] args) {
//		permutations("", "abc");
//		System.out.println(permutationsList("", "abc"));
		
		System.out.println(permutationsCount("", "abcd"));
	
	}
	
	static void permutations(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		
		for(int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String l = p.substring(i, p.length());
			permutations(f + ch + l, up.substring(1));
		}
	}
	
	static ArrayList<String> permutationsList(String p, String up) {
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> ans = new ArrayList<>();
		
		char ch = up.charAt(0);
		
		for(int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String l = p.substring(i, p.length());
			ans.addAll(permutationsList(f + ch + l, up.substring(1)));
		}
		
		return ans;
	}

	static int permutationsCount(String p, String up) {
		if(up.isEmpty()) {
			return 1;
		}
		
		int count = 0;
		
		char ch = up.charAt(0);
		
		for(int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String l = p.substring(i, p.length());
			count = count + permutationsCount(f + ch + l, up.substring(1));
		}
		
		return count;
	}
	
}
