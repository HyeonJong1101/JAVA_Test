package HomeWork_0320;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 :");
        int num01 = sc.nextInt();
        System.out.print("정수 :");
        int num02 = sc.nextInt();

        Calculator c = new Calculator(num01, num02);
        c.add();
        c.sub();
        c.mul();
        c.div();

        if(c.check(num01)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if(c.check(num02)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}