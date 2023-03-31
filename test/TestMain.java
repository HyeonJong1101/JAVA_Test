package test;

import java.util.HashMap;
import java.util.Map;

public class TestMain {
	public static void main(String[] args) {
		Map<String, String> test1 = new HashMap<>();

		test1.put("A", "12");
		test1.put("B", "13");
		System.out.println(test1.get("A"));
		
		
		System.out.println(test1.put("A", "11"));
		
		System.out.println(test1.containsKey("A"));
		if(test1.get("B").equals("12")) {
			
		}
		
	}
}
