package test;

class Box{
	int width;
	int height;
	int depth;
	
	void volume() {
		System.out.println("Volume is : " + width * height * depth);
	}
	
	void setDim(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
}

public class ClassObject {
	public static void main(String args[]) {
		Box b1 = new Box();
		
		b1.setDim(10, 20, 15);
		
		Box b2 = new Box();
		
		b2.setDim(56, 33, 98);
		
		b1.volume();
		b2.volume();
		
	}
}
