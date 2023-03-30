package HomeWork_0320;

import java.util.Scanner;

public class StringUtilMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringUtil strU = new StringUtil();
        String str = new String();
        String str2 = new String();

        System.out.print("1.하나의 문자를 입력 대문자인가? : ");
        if(strU.isUpperChar(sc.next().charAt(0))){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        System.out.print("2.하나의 문자를 입력 소문자인가? :");
        if(strU.isLowerChar(sc.next().charAt(0))){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        System.out.print("3.두 개의 숫자를 입력받아 큰수 반환");
        int num01 = sc.nextInt();
        int num02 = sc.nextInt();
        System.out.println(strU.max(num01, num02));

        System.out.print("4.두 개의 숫자를 입력받아 작은수 반환");
        num01 = sc.nextInt();
        num02 = sc.nextInt();
        System.out.println(strU.min(num01, num02));

        System.out.print("5.문자열 입력받아 거꾸로 출력:");
        str = sc.nextLine();
        System.out.println(strU.reverseString(str));

        str = sc.nextLine();
        System.out.println(strU.reverseString(str));

        System.out.print("6.문자열 입력받아 대문자변경");
        str = sc.nextLine();
        System.out.println(strU.toUpperString(str));

        System.out.println("7.문자열 입력받아 소문자변경");
        str = sc.nextLine();
        System.out.println(strU.toLowerString(str));

        System.out.println("8.두개의 문자열을 입력받아 크기비교(1,0,-1)");
        str = sc.nextLine();
        str2 = sc.nextLine();
        System.out.println(strU.compareTo(str, str2)); // 왼쪽이크면 1 , 같으면 0, 오른쪽이크면 -1

        System.out.println("9.문자열 입력");

        System.out.print("문자열 입력:");
        str = sc.nextLine();
        System.out.print("검색할 문자열 입력");
        str2 = sc.nextLine();
        if(strU.endsWith(str, str2)){
            System.out.println(str2+"로 끝나는지 여부 판단:true");
        }else{
            System.out.println(str2+"로 끝나는지 여부 판단:false");
        }



        System.out.println("10.문자열 입력");

        System.out.print("문자열 입력:");
        str = sc.nextLine();
        System.out.print("검색할 문자열 입력:");
        str2 = sc.nextLine();

        System.out.println(str2+"은"+strU.indexOf(str, str2)+"번지에 위치함");

    }
}
