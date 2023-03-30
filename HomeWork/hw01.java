package HomeWork;
import java.util.Random;
import java.util.Scanner;

public class hw01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int min = 1, max = 100, num=0;
        int ranNum = (int)(Math.random()*100);
        
        //System.out.println(ranNum);
        int cnt = 5;
        while(true){
            System.out.print(min + "-" + max + " : ");
            num = sc.nextInt();

            if(num > ranNum && num<= max){ // 입력값이 랜덤수보다 크고, max값보다는 작거나 같을때 
                System.out.println(num+"보다 작은수입니다."+"\n기회는 총"+(cnt--)+"번 남았습니다.");
                max = num-1;
            }else if(num < ranNum && num >= min){ // 입력값이 랜덤수보다 작고, min값보다는 크거나 같을때
                System.out.println(num+"보다 큰수입니다."+"\n기회는 총"+(cnt--)+"번 남았습니다.");
                min = num+1;
            }else if(num == ranNum){
                System.out.println("축하합니다. 정답입니다");
                break;
            }else{ // 입력값이 예외일때 cnt 변화없음
            }

            if(cnt < 0){
                System.out.println("아쉽습니다. 기회를 소진하셨습니다");
                System.out.println("정답은["+ranNum+"]입니다");
                break;
            }
        }
    }
}
