package HomeWork;
import java.util.Scanner;

public class hw02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = 50;

        System.out.println("1-100사이 숫자맞추기");
        System.out.print("내가 생각한숫자 : ");
        sc.nextInt();

        int min = 1;
        int max = 100;
        while(true){
            System.out.print("생각한 숫자가"+num+"입니까?(0:yes, 1:up, -1:down) =>");
            int check = sc.nextInt();
            if(check == 0) break;

            switch(check){
                case 1 :
                    min = num+1;
                    num = (min+max)/2;
                    break;
                case -1 :
                    max = num-1;
                    num = (min+max)/2;
                    break;
                default :
            }

        }



    }
}
