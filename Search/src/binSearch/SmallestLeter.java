package binSearch;

public class SmallestLeter {
	public static void main(String[] args) {
		char[] arr = {'c', 'f', 'j'};
		char target = 'e';
		char ans = nextGreatestLetter(arr, target);
		System.out.println(ans);
	}
	
	//return the index of smallest no >= target
	static char nextGreatestLetter(char[] letters, char letter) {
		int start = 0;
		int end = letters.length-1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(letter<letters[mid]) {
				end=mid-1;
			}else{
				start=mid+1;
			}
		}
		return letters[start%letters.length];
	}
}
