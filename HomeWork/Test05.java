package HomeWork;
import java.util.Scanner;

public class Test05 {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int[][] primeArr = new int[10][20];
	        int[] arrLength = new int[10];

	        System.out.println("정수를 입력하세요. 0입력시 종료");
	        int cnt=0;
	        do{
	            primeArr[cnt][0] = sc.nextInt();	      

	            int cnt2=1;
	            for(int i=1; i<=primeArr[cnt][0]; i++){
	                if(primeArr[cnt][0]%i==0){
	                    primeArr[cnt][cnt2++] = i;
	                }
	            }

	            arrLength[cnt] = cnt2;
	        }while(primeArr[cnt][0] != 0 && ++cnt<10);

	        for(int i=0; i<cnt; i++){
	            System.out.print(primeArr[i][0]+"의 약수 : ");
	            for(int j=1; j<arrLength[i]; j++){
	                System.out.print(primeArr[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }
}
