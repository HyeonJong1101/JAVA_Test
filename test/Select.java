package test;

import java.util.Scanner;

public class Select {
	
	Scanner sc = new Scanner(System.in);
	public int num;
	
	public Select(){
		
	}
	
	public Select(int num){
		this.num = num;
	}
	
	public void c() {
		System.out.println("1.삼각형 2.정사각형 3.직사격형 4.원");
		System.out.print("면적을 구할 도형을 선택하세요 : ");
		num = sc.nextInt();
	}
	
}
