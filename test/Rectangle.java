package test;

public class Rectangle extends Triangle{

	Rectangle(){
		
	}
	
	@Override
	public void c() {
		super.c();
		if(num ==2) {
			System.out.println("직사각형");
		}
	}
}
