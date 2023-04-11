package permutations;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dices {
	public static void main(String[] args) {
//		dice("", 4);
		System.out.println(diceArray("", 4));
//		System.out.println(diceArray("", 4, 6));
	}
	
	static void dice(String p, int target) {
		if(target == 0) {
			System.out.println(p);
			return;
		}
		
		for(int i = 1; i <= 6 && i <= target; i++){
			dice(p + i, target - i);
		}
	}
	
	static ArrayList<String> diceFace(String p, int target, int face) {
		if(target == 0) {  
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> ans = new ArrayList<>();
		
		for(int i = 1; i <= face && i <= target; i++){
			ans.addAll(diceFace(p + i, target - i, face));
		}
		
		return ans;
	}
//	private int mod = (int) Math.pow(10, 9) + 7;	//mod initialisation
//	static int diceFaceCount(String p, int target, int face) {
//		if(target == 0) {
//			return 1;
//		}
//		
//		int count = 0;
//		
//		for(int i = 1; i <= face && i <= target; i++){
//			count = (count + diceFaceCount(p + i, target - i, face) % mod)%mod;
//		}
//		
//		return count;
//	}
	
	
	static ArrayList<String> diceArray(String p, int target) {
		if(target == 0) {  
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> ans = new ArrayList<>();
		
		for(int i = 1; i <= 6 && i <= target; i++){
			ans.addAll(diceArray(p + i, target - i));
		}
		
		return ans;
	}
}
