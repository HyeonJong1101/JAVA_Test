package HomeWork_0322;

import java.util.Scanner;

public class SelectMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.삼각형 2.정사각형 3.직사격형 4.원");
		System.out.print("면적을 구할 도형을 선택하세요 : ");
		
		Select s = new Select(sc.nextInt());
		Shape sh = new Shape();
		
		sh.select();
	}
}
