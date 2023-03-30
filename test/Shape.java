package test;

import java.util.Scanner;

public class Shape extends Select{
	
	Scanner sc = new Scanner(System.in);
	
	public Shape() {
		
	}
	
	public void select() {
		switch(num) {
		case 1:
			System.out.print("밑변의 길이를 입력하세요 : ");
			int len = sc.nextInt();
			System.out.print("높이의 길이를 입력하세요 : ");
			int height = sc.nextInt();
			System.out.printf("밑변%d,높이%d의 삼각형의 넓이는 %d입니다", len, height, len*height/2);
			break;
		case 2:
			System.out.print("한변의 길이를 입력하세요 : ");
			int len2 = sc.nextInt();
			System.out.printf("가로%d,세로%d의 정사각형의 넓이는 %d입니다", len2, len2, len2*len2);
			break;
		case 3:
			System.out.print("밑변의 길이를 입력하세요 : ");
			int len3 = sc.nextInt();
			System.out.print("높이의 길이를 입력하세요 : ");
			int height2 = sc.nextInt();
			System.out.printf("밑변%d,높이%d의 직사각형의 넓이는 %d입니다", len3, height2, len3*height2);
			break;
		case 4:
			System.out.print("반지름 길이를 입력하세요 : ");
			int len4 = sc.nextInt();
			System.out.printf("반지름%d의 원의 넓이는 %f입니다", len4, Math.PI*len4*len4);
			break;
		default :
			System.out.println("?");
			break;
		}
	}
	
	
	
}
