package HomeWork_0321;

public class Hw0321 {
	
	Hw0321(){
		
	}
	
	public static int checkChar(String strData, char ch) {
		int len = strData.length();
		int cnt = 0;
		for(int i=0; i<len; i++) {
			if(ch == strData.charAt(i)) {
				cnt++;
			}
		}
		
		return cnt;
	}
	
	public static String removeChar(String oriStr, char delChar) {
		int len = oriStr.length();
		String result = "";
		for(int i=0; i<len; i++) {
			if(delChar != oriStr.charAt(i)) {
				result += oriStr.charAt(i);
			}
		}
		
		return result;
	}
}
