package test;

public class Circle extends Square{

	Circle(){
		
	}
	
	@Override
	public void c() {
		super.c();
		if(num ==4) {
			System.out.println("원");
		}
	}
}
