package homeWork0328;

import java.util.Arrays;

public class LottoView {
	
	public void start() {
		System.out.println("게임수 입력");
		
		int gameCnt = 10;
		for(int i=1; i<=gameCnt; i++) {
			System.out.println("게임"+i+":" + Arrays.toString(getLotto()));
		}
	}
	
	private int[] getLotto() {
		int[] arr = {1,2};
		return arr;
	}
}
