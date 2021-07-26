package com.ust.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {
// Set store only unique Value
	public static void main(String[] args) {
		Set<String> colorSet = new HashSet<>();
		String[] colorArray = { "red", "blue", "green", "orange", "gray", "red" };
		for (String color : colorArray) {
			System.out.println(colorSet.add(color));
//			colorSet.add(color);

		}
		System.out.println(colorSet);
		SortedSet<String> tree = new TreeSet<>(colorSet);
		System.out.println(tree);
		//[blue, gray, green, orange, red]
		System.out.println(tree.headSet("green"));
		System.out.println(tree.tailSet("green"));
		tree.add("pink");
		System.out.println(tree);
		System.out.println(tree.first());
		System.out.println(tree.last());

	}
	}
