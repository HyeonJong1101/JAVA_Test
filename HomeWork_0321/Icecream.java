package HomeWork_0321;

import java.util.Scanner;

public class Icecream {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int iceNum;
        int totalSum = 0;
        int cnt = 0;

        while(true) {
            System.out.print("아이스크림 몇개 구입할래? ");
            iceNum = sc.nextInt();
            sc.nextLine();

            String[][] arr = new String[2][iceNum];

            for(int i=0; i<iceNum; i++) {
                System.out.println("***"+(i+1)+"번째 아이스크림 구매 정보 입력***");
                System.out.print("아이스크림명 : ");
                arr[0][i] = sc.nextLine();
                System.out.print("아이스크가격 : ");
                arr[1][i] = sc.nextLine();
            }

            System.out.println("<총 "+iceNum+"개의 아이스크림 구매 정보 출력>");
            System.out.println("번호\t아이스크림명\t아이스크림가격");
            for(int i=0; i<arr[0].length; i++) {
                System.out.print(i+1+"\t");
                for(int j=0; j<arr.length; j++) {
                    System.out.print(arr[j][i]+"\t\t\t");
                }
                System.out.println();
            }

            int sum = 0;
            System.out.print("아이스크림가격 : ");
            for(int i=0; i<arr[0].length; i++){
                sum += Integer.parseInt(arr[1][i]);
            }
            System.out.println(sum);
            cnt++;
            totalSum += sum;

            System.out.print("계속구매할래? ");

            //if(sc.nextLine().equals("n")) break;
            char ch = sc.nextLine().charAt(0);
            if(ch == 'n') {
            	break;
            }
        }
        System.out.println("총"+cnt+"번의 구매정보 발생");
        System.out.println("총계: "+totalSum );

		
	}
}
