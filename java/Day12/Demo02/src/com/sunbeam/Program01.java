package com.sunbeam;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program01 {

	public static void main(String[] args) {
		Map<Integer, String> studentMap = new HashMap<Integer, String>();
		studentMap.put(121, "Mukesh"); // Entry<Integer,String>
		studentMap.put(132, "Suresh");
		studentMap.put(143, "Anil");
		studentMap.put(154, "Ramesh");
		studentMap.put(165, "Ram");

		Set<Integer> keys = studentMap.keySet();
		for (Integer k : keys)
			System.out.print(k + ", ");

		System.out.println();
		Collection<String> values = studentMap.values();
		for (String value : values)
			System.out.print(value + ", ");

		System.out.println();

		Set<Map.Entry<Integer, String>> entries = studentMap.entrySet();
		for (Map.Entry<Integer, String> entry : entries)
			System.out.println(entry.getKey() + " - " + entry.getValue());

		System.out.println(studentMap);
	}

}
