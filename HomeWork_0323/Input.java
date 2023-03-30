package HomeWork_0323;

import java.util.Scanner;

public class Input {

    public Input(){

    }
    public void io(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.삼각형\t2.직사각형\t3.정사각형\t4.원");
        System.out.print("도형을 고르시오 : ");
        int num = sc.nextInt();
        sc.nextLine();

        Select s = null;
        switch(num){
            case 1:
                s = new Triangle();
                break;
            case 2:
                s = new Rectangle();
                break;
            case 3:
                s = new Square();
                break;
            case 4:
                s = new Circle();
                break;
        }
        s.info();
    }

}
