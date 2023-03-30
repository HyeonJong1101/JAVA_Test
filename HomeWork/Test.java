package HomeWork;


public class Test {
	public static void main(String[] args){
		
		
		ex1();
		System.out.println();
		ex2();
		System.out.println();
		ex3();
		System.out.println();
		ex4();
		System.out.println();
		ex5();
		System.out.println();
		ex6();
		System.out.println();
		ex7();
		System.out.println();
		ex8();
		System.out.println();
		ex9();
		System.out.println();
		ex10();
		System.out.println();
		ex11();
		System.out.println();
		ex12();
		System.out.println();
		ex13();
		System.out.println();
		ex14();
		System.out.println();
		ex15();
		System.out.println();
		ex16();
		System.out.println();
		ex17();
		System.out.println();
		
	}
	
	static void ex1() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void ex2() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	static void ex3() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	static void ex4() {
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=i+4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	static void ex5() {
		for(int i=5; i>=1 ; i--) {
			for(int j=i; j<=i+4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	static void ex6() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void ex7() {
		for(int i=5; i>=1; i--) {
			for(int j=i; j>=1 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void ex8() {
		for(int i=5; i>=1; i--) {
			for(int k=1; k<=5-i; k++) {
				System.out.print(" ");
			}
			
			for(int j=i; j>=1 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void ex9() {
		for(int i=1; i<=5; i++) {
			for(int k=1; k<=5-i; k++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void ex10() {
		for(int i=1; i<=9; i++) {
			
			if(i<=5) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
			}else {
				for(int j=1; j<=10-i; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}

	static void ex11() {
		for(int i=1; i<=9; i++) {
			
			if(i<=5) {
				for(int j=1; j<=6-i; j++) {
					System.out.print("*");
				}
			}else {
				for(int j=1; j<=i-4; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}

	static void ex12() {
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int k=1; k<=i-1; k++) {
					System.out.print(" ");
				}
				
				for(int j=1; j<=6-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int k=1; k<=9-i; k++) {
					System.out.print(" ");
				}
				
				for(int j=1; j<=i-4; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
	}

	static void ex13() {
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				for(int j=1; j<=5-i; j++) {
					System.out.print(" ");
				}
				
				for(int k=1; k<=i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int j=1; j<=i-5; j++) {
					System.out.print(" ");
				}
				
				for(int k=1; k<=10-i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	static void ex14() {
		for(int i=0; i<=4; i++) {
			for(int k=1; k<=4-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void ex15() {
		for(int i=4; i>=0; i--) {
			for(int k=1; k<=4-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void ex16() {
		
		int space = 0;
		int star = 5;
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*star-1; k++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i<5) {
				space++;
				star--;
			}else {
				space--;
				star++;
			}
		}
		
		
		/*for(int i=0; i<=8; i++) {
			if(i<5) {
				for(int j=1; j<=i; j++) {
					System.out.print(" ");
				}
				for(int k=1; k<=9-(2*i); k++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int j=1; j<=8-i; j++) {
					System.out.print(" ");
				}
				for(int k=1; k<=2*i-7; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}*/
	}
	
	static void ex17() {
		int star =1; 
		for(int i=1; i<=9; i++) {
			
			for(int j=1; j<=9; j++) {
				if(j<=star || j>=10-star) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
			if(i<5) {
				star++;
			}else {
				star--;
			}
		}
	}
	
	
}

