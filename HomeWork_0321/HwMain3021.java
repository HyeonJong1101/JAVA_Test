package HomeWork_0321;

import java.util.Scanner;

public class HwMain3021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hw0321 pro = new Hw0321();
		
		String str = new String();
		String str2 = new String();
		char ch;
		
		//1
		System.out.print("입력스트링 : ");
		str = sc.nextLine();
		System.out.print("찾을문자 입력 : ");
		ch = sc.next().charAt(0);
		
		System.out.println(pro.checkChar(str, ch));
		sc.nextLine();
		
		//2
		System.out.print("입력스트링 : ");
		str2 = sc.nextLine();
		System.out.print("지울문자 입력 : ");
		ch = sc.next().charAt(0);
		
		System.out.println(pro.removeChar(str, ch));
		
	}
}
