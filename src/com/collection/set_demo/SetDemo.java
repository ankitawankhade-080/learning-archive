package com.collection.set_demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		set.add("Banana");
		set.add("Appel");
		set.add("Kiwi");
		set.add("Mango");

//		set.add(2,"Kiwi")   not allowed because insertion order is not preserved 

		set.add("Kiwi");// duplicates are not allowed

		System.out.println(set);

		System.out.println("Contains Mango??" + set.contains("Mango"));

		System.out.println("Size of set?" + set.size());

//		for(int i=0;i<set.size();i++) {
//			System.out.println(set.get);// not allowed because insertion order is not preserved
//		}

		// Using ForEach Loop

		for (String fruit : set) {
			System.out.println(fruit);
		}

		// Using Ierator

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
