package test;

class BoxD{
	int width;
	int height;
	int depth;
	
	BoxD(int w, int h, int d){
		System.out.println("Constructing Box");
		width = w;
		height = h;
		depth = d;
	}
	
	BoxD(){
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}
	
	int volume() {
		return width * height * depth;
	}
}

public class BoxDemo {
	public static void main(String args[]) {
		BoxD b1 = new BoxD(10, 20, 30);
		int vol = b1.volume();		
		System.out.println("Volume of box: " + vol);
		BoxD b2 = new BoxD();
		int vol1 = b2.volume();
		System.out.println("Volume of box: " + vol1);
		
	}
}
