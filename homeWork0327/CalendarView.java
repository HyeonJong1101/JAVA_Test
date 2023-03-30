package homeWork0327;

import java.util.Scanner;

public class CalendarView {
	
	private Scanner sc;
	private CalendarUtil util;
	
	public CalendarView() {
		sc = new Scanner(System.in);
		util = new CalendarUtil();
	}
	
	public int choiceMenu(String msg) {
		System.out.println(msg);
		int type = sc.nextInt();
		sc.nextLine();
		
		return type;
	}
	
	public void process() {
		
		util = new CalendarUtil();
		
		while(true) {
			
			int type = choiceMenu("항목선택 1.연도 2.달 3.종료");
			int year,month;
			switch(type) {
			case 1 :
				year = choiceMenu("연도입력");
				util.showByYear(year);
				break;
			case 2 :
				year = choiceMenu("연도입력");
				month = choiceMenu("달 입력");
				util.showByMonth(year, month);
				break;
			case 3 :
				System.exit(0);
			}
		}
	}
	
}
