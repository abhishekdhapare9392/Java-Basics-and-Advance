package test;

public class Twodpyramid {
	public static void main(String rushi[]) {
		int i, j, k = 1, num_array[][] = new int[4][];
		
		num_array[0] = new int[1];
		num_array[1] = new int[2];
		num_array[2] = new int[3];
		num_array[3] = new int[4];
		
		for(i = 0; i < 4; i++) {
			for(j=0; j < i+1; j++) {
				num_array[i][j] = k;
				k++;
			}
		}
		
		for(i=0; i<4; i++) {
			for(j=0; j < i+1; j++) {
				System.out.print(num_array[i][j]);
			}
			System.out.println();
		}
	}
}
