package HomeWork_0324;

import java.util.Scanner;

public class Baseball {
	public static int[] arr = new int[3];
    public static int[] arr2 = new int[3];
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        random();
        baseball();
    }

    public static void random() { //중복수 안나오게하기

        int[] check = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int num = (int) (Math.random() * 10);
            
            while(true){
				check[num]++;
                if(check[num]>1){
                    check[num]--;
                    num = (int) (Math.random() * 10);
                }else{
                    break;
                }
            }

            arr[i] = num;
        }

    }

    public static void baseball() {
        int out = 0, cnt = 0;

        while (cnt != 6) {
            int strike = 0;
            int ball = 0;

            System.out.print("숫자입력 :");
            int num = sc.nextInt();;

            arr2[0] = num/100;
            arr2[1] = num%100/10;
            arr2[2] = num%100%10;


            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr2[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }

            if (strike == 0 && ball == 0) {
                out++;
                System.out.println(out + "out");
            } else {
                System.out.println(strike + "strike " + ball + "ball");
            }
            cnt++;

            if (strike == 3){
                System.out.println("정답입니다");
                break;
            }else if(out == 3){
                break;
            }

        }

        if(cnt==6 || out==3)
        System.out.println("정답은" + arr[0] + arr[1] + arr[2]);

    }
}
