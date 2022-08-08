package collection;

import java.util.TreeMap;

public class TreeMapdemo {
	public static void main(String[] args) {

		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("xndn", 100);
		map.put("vnf", 500);
		map.put("xnmk", 120);
		map.put("ponio", 400);
		map.put("nydn", 170);
		map.put("awdn", 1500);
		System.out.println(map);

		map.forEach((k, v) -> System.out.println(k + "   " + v));
	}

}
