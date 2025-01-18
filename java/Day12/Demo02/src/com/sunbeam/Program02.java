package com.sunbeam;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program02 {

	public static void main(String[] args) {
		Map<Integer, String> studentMap = new LinkedHashMap<Integer, String>();
		studentMap.put(121, "Mukesh");
		studentMap.put(143, "Anil");
		studentMap.put(132, "Suresh");
		studentMap.put(165, "Ram");
		studentMap.put(154, "Ramesh");
		studentMap.put(176, "Ramesh"); // OK
		studentMap.put(null, "Nitin"); // OK
		studentMap.put(176, "Sham"); // If keys are same then values are replaced
		studentMap.put(190, null);
		studentMap.put(191, null); // Multiple null values are allowed

		System.out.println(studentMap);
	}

}
