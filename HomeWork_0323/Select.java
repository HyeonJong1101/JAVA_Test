package HomeWork_0323;

import java.util.Scanner;


//추상클래스
public abstract class Select {
	
	int h,b; // 높이(or한변의 길이 or반지름),밑변
	
    Scanner sc = new Scanner(System.in);
    public Select(){

    }


    // 추상메소드
    public abstract void info();

}
