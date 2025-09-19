package com.collection.list_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Appel");
		arr.add("Banana");
		arr.add("Orange");
		arr.add("Strawberry");
		arr.add("Mango");

		arr.add(2, "Grapes");

		System.out.println("Element at 1th Index =" + arr.get(1));

		arr.set(3, "kiwi");

//		arr.remove(0);
//		arr.remove("Strawberry");

		System.out.println(arr);
		System.out.println("Contaions Appel?" + arr.contains("Appel"));
		System.out.println("Contaions Strawberry?" + arr.contains("Strawberry"));

		System.out.println("Iterating Using For Loop");
		System.out.println("[[");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("]]");

		System.out.println("Iterating Using ForEach Loop");
		for (String fruit : arr) {
			System.out.println(fruit);
		}

		System.out.println("Iterating Using Iterator");
		Iterator<String> itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Collections.sort(arr);
		System.out.println("After Sorting>>" + arr);

		Collections.sort(arr, Collections.reverseOrder());
		System.out.println("After Reverse Sorting>>" + arr);

//		arr.clear();
//		System.out.println("List is empty?"+arr.isEmpty());

	}

}
