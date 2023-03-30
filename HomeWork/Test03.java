package HomeWork;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		/*ex01();
		System.out.println();
		
		ex02();
		System.out.println();
		
		ex03();
		System.out.println();*/
		
		ex04();
		System.out.println();
		
		/*ex05();
		System.out.println();
		
		ex06();
		System.out.println();
		
		ex07();
		System.out.println();

		ex08();
		System.out.println();*/
	}
	
	static void ex01() {
		
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
	}
	
	static void ex02() {
		
		for(int i=1; i<=50; i++) {
			System.out.print(2*i-1+" ");
		}
	}

	static void ex03() {
		
		for(int i=50; i>=1; i--) {
			System.out.print(2*i+" ");
		}
	}
	
	static void ex04() {
		
		int height = 0;
		int count = 0;
		/*while(true) {
			height += 5;
			count++;
			
			if(height<50) {
				height -= 1; 
			}else if(height<100){
				height -= 2;
			}else {
				break;
			}
			System.out.println("["+count+"시간후] 달팽이가 올라간 총 높이 : " + height + "M");
			
		}
		System.out.print("탈출한시간 : " + count);
		*/
		
		
		while(height < 100) {
			height += height<50 ? 4 : 3;
			count++;
			System.out.println("["+count+"시간후] 달팽이가 올라간 총 높이 : " + height + "M");
		}
		
	}
	
	static void ex05() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2~9사이의 단을 입력: ");
		int dan = sc.nextInt();
		
		System.out.println("***"+dan+"단***");
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
	
	static void ex06() {
		
		for(int i=2; i<=9; i++) {
			System.out.println("***"+i+"단***");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
	
	static void ex07() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작단을 입력: ");
		int start = sc.nextInt();
		
		System.out.println("종료단을 입력: ");
		int end = sc.nextInt();
		
		if(start>end) {
			int num = start;
			start = end;
			end = num;
		}
		
		for(int i=start; i<=end; i++) {
			System.out.println("***"+i+"단***");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
	
	static void ex08() {
		/*
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=9; j++) {
				for(int k=3*i-1; k<=3*i+1; k++) {
					if(k>=10) {
						break;
					}
					System.out.print(k+"*"+ j + "=" + k*j +" ");
				}
				System.out.println();
			}
		}
		*/
		
		for(int i=2; i<=8; i+=3) {
			for(int j=1; j<=9; j++) {
				for(int k=i; k<=i+2; k++) {
					if(k>=10) break;
					System.out.print(k+"*"+j+"="+k*j+" ");
				}
				System.out.println();
			}
		}
		
		
	}

}
