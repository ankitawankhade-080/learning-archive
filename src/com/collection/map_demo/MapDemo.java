package com.collection.map_demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Java");
		map.put(2, "JavaScript");
		map.put(3, "Python");
		map.put(4, "HTML");
		map.put(5, "CSS");

		System.out.println("Initial Map>>" + map);

		System.out.println("Key 2->" + map.get(2));

		map.put(2, "Angular");
		System.out.println("After Updating key 2->>" + map);

//		map.remove(3);
//		System.out.println("After Removing key 3->>"+map);

		System.out.println("Map Contains key 3 ?->>" + map.containsKey(3));

		System.out.println("Map Contaion Java?->>" + map.containsValue("Java"));

		Set<Integer> key = map.keySet();
		System.out.println("Keys all-->>" + key);

		System.out.println("Interating using foreach loop using keys[");
		for (Integer k : key) {
			System.out.println(k + "-" + map.get(k));
		}
		System.out.println("]");

		System.out.println("Interating using Iterator loop using keys[");
		Iterator<Integer> itr = key.iterator();
		while (itr.hasNext()) {
			Integer i=itr.next();
			System.out.println(map.get(i));
		}
		System.out.println("]");

		Collection<String> val = map.values();
		System.out.println("All Values-->" + val);
	}

}
