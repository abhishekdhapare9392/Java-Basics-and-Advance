package test;

public class Twodrowarray {
	public static void main(String bhima[]) {
		int num_array[][] = new int[3][5];
		int i, j, k = 2;
		
		
		for(i=0; i < 3; i++) {
			for(j=0; j<5; j++) {
				num_array[i][j] = k;
				k = k + 3;
			}
		}
		
		for(i=0; i < 3; i++) {
			for(j=0; j<5; j++) {
				System.out.print(num_array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
