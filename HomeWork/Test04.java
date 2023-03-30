package HomeWork;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		ex01();
		System.out.println();
		
		ex02();
		System.out.println();
		
		ex03();
	}
	
	static void ex01() { //입력:정수, 출력:홀짝으로 나눠서 출력
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("num"+(i+1)+" : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("<짝수>");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				System.out.print(arr[i]+"\t");
			}
		}
		
		System.out.println();
		
		System.out.println("<홀수>");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 1) {
				System.out.print(arr[i]+"\t");
			}
		}
	}
	
	static void ex02() { // 입력 : 0~99 사이정수, 출력:숫자5개 +숫자 반대로
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		int count = 0;
		while(count<5) {
			System.out.print("num"+(count+1)+" : ");
			arr[count] = sc.nextInt();
			
			if(arr[count]>=0 && arr[count]<=99) {
				count++;
			}
		}
		
		System.out.println("PRINT");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println();
		System.out.println("REVERSE");
		for(int i=1; i<arr.length+1; i++) {
			System.out.print(arr[arr.length-i]%10*10+arr[arr.length-i]/10+"\t");
		}
		
	}
	
	static void ex03() { // 입력:점수, 출력:학점,촐점,평균,에러
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"'성적 : ");
			arr[i] = sc.nextInt();
		}
		
		int count = 0, sum = 0;
		System.out.println("\n"+"<PRINT>");
		System.out.println("번호"+"\t"+"성적"+"\t"+"학점");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=90 && arr[i]<=100) {
				System.out.println((i+1)+"\t"+arr[i]+"\t"+"A");
				sum += arr[i];
			}else if(arr[i]>=80 && arr[i]<=89) {
				System.out.println((i+1)+"\t"+arr[i]+"\t"+"B");
				sum += arr[i];
			}else if(arr[i]>=70 && arr[i]<=79) {
				System.out.println((i+1)+"\t"+arr[i]+"\t"+"C");
				sum += arr[i];
			}else if(arr[i]>=60 && arr[i]<=69) {
				System.out.println((i+1)+"\t"+arr[i]+"\t"+"D");
				sum += arr[i];
			}else if(arr[i]>=0 && arr[i]<=59) {
				System.out.println((i+1)+"\t"+arr[i]+"\t"+"F");
				sum += arr[i];
			}else {
				System.out.println((i+1)+"\t"+"ERROR");
				count++;
			}
		}
		
		System.out.println("\n"+"5명 입력 중["+count+"]회 에러발생");
		System.out.println("총점 : "+sum+"점");
		System.out.println("평균 : "+(double)sum/arr.length+"점");
		
	}
}
