package test;

public class Switch {
	public static void main(String args[]) {
		String i = "0";
		String k = "0.5";
		
		switch(i) {
			case "0": 
				switch(k) {
					case "0.5": 
						System.out.println("Given number is " + k);
						break;
					default : 
						System.out.println("Given number is " + i);
						break;
				}
				break;
			case "1" : 
				switch(k) {
					case "1.5":
						System.out.println("Given number is " + k);
						break;
					default :
						System.out.println("Given number is " + i);
						break;
				}
				break;
			default:
				System.out.println("Given number is greater than 1.5");
				break;
				
		}
	}
}
