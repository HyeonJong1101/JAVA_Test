package test;

import java.util.Calendar;
import java.util.Scanner;

class Test {
	public static void main(String[] args) {

   int test = 1;
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		
		int n = 0;
		while (n != 3) {
			System.out.print("원하는 항목을 선택하세요(1.특정년도 2.특정월 3.종료)=> ");
			n = sc.nextInt();

			int year=0, month=0;
			switch (n) {
			case 1:
				System.out.println("년도를 선택하세요 : ");
				year = sc.nextInt();
				c.set(year, 1);
				System.out.println(year);
				
			case 2:
				System.out.println("년도를 선택하세요 : ");
				year = sc.nextInt();
				System.out.println("월을 선택하세요 : ");
				month = sc.nextInt();
			case 3:
				break;
			}

		}
		
		

	}
}