package HomeWork;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		ex7(num);
		System.out.println();
		
		ex9(num);
		System.out.println();
		
		ex11(num);
		System.out.println();
	
		ex13(num);
		System.out.println();
		
		ex15(num);
		System.out.println();
		
		ex17(num);
		System.out.println();
	}
	
	static void ex7(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void ex9(int n) {
		int space = n-1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j<=space) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			space--;
			System.out.println();
		}
	}
	
	static void ex11(int n) {
		
		int star = n/2+1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			
			if(i<n/2+1) {
				star--;
			}else {
				star++;
			}
			
			System.out.println();
		}
	}
	
	static void ex13(int n) {
		
		int star = n/2+1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n/2+1; j++) {
				if(j<star) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			if(i<n/2+1) {
				star--;
			}else {
				star++;
			}
			
			System.out.println();
		}
	}
	
	static void ex15(int n) {
		
		int star = n;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*star-1; j++) {
				System.out.print("*");
			}
			star--;
			System.out.println();
		}
	}
	
	static void ex17(int n) {
		int star =1; 
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
				if(j<=star || j>=n+1-star) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
			if(i<n/2+1) {
				star++;
			}else {
				star--;
			}
		}
	}
	
}
