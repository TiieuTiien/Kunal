package number;

import java.util.Arrays;

public class FlippingAnImage {
	public static void main(String[] args) {
		int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
		image = flipAndInvertImage(image);
		
		for (int[] is : image) {
			System.out.println(Arrays.toString(is));
		}
		
	}
	public static int[][] flipAndInvertImage(int[][] image) {
	   for (int[] row : image) {
		   for(int i = 0; i < (image[0].length + 1) / 2; i++) {
			   // swap
			   int temp = row[i] ^ 1;
			   row[i] = row[row.length - i - 1] ^ 1;
			   row[row.length - i - 1] = temp;
		   }
	   }
	   
	   return image;
	}
}
