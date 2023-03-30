package homeWork0327;

import java.util.Calendar;

public class CalendarUtil {

	private Calendar c;
	
	public CalendarUtil() {
		c = Calendar.getInstance();
	}
	
	public void showByYear(int year) {

		for(int month = 1; month <=12; month++) {
			showByMonth(year, month);
		}
	}
	
	public void showByMonth(int year, int month) {
		
		System.out.println(year+"년" +month+"월 ");
		
		c.set(year, month-1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK);
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		showByDay(week, lastday);
	}
	
	private void showByDay(int week, int lastday) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int cnt=0;
		
		for(int i=1; i< week; i++) {
			System.out.print("\t");
			cnt++;
		}
		for(int day=1; day<=lastday; day++) {
			System.out.print(day+"\t");
			cnt++;
			if(cnt%7 ==0) System.out.println();
		}
		if(cnt%7 != 0) System.out.println();
	}
}
