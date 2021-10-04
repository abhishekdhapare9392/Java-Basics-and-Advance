package test;

public class Forloop {
	public static void main(String args[]) {
		int num_array[] = { 36, 32, 45, 80 };
		int i;
		for(i=0; i < 4; i++) {
			System.out.println(i + " => " + num_array[i]);
		}
		System.out.println();
		int c = 10, j;
		for(j=0; j < 4; j++) {
			num_array[j] = c;
			System.out.println(j + " => " + num_array[j]);
			c = c+10;
		}
	}
}
