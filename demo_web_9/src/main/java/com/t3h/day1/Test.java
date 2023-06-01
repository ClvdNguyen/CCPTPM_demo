package com.t3h.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		String start = "AACCGGTT";
		String end = "AACCGGTA";
		String[] bank = { "AACCGGTA" };
Map<String, String> a = new HashMap<>();

//		List<String> a = Arrays.asList("aaa");
//		a.add("b");
//		String[] input = {"eat","tea","tan","ate","nat","bat"};
//		
//		List<List<String>> ret = groupAnagrams(input);
//		
//		System.out.println(ret.toString());

	}

	public static int minMutation(String start, String end, String[] bank) {

		Queue<String> queue = new LinkedList<>();
		Set<String> seen = new HashSet<>();
		queue.add(start);
		seen.add(start);

		int steps = 0;

		while (!queue.isEmpty()) {
			int nodesInQueue = queue.size();
			for (int j = 0; j < nodesInQueue; j++) {
				String node = queue.remove();
				if (node.equals(end)) {
					return steps;
				}

				for (char c : new char[] { 'A', 'C', 'G', 'T' }) {
					for (int i = 0; i < node.length(); i++) {
						String neighbor = node.substring(0, i) + c + node.substring(i + 1);
						if (!seen.contains(neighbor) && Arrays.asList(bank).contains(neighbor)) {
							queue.add(neighbor);
							seen.add(neighbor);
						}
					}
				}
			}

			steps++;
		}

		return -1;
	}

	public static int minMutation2(String start, String end, String[] bank) {

		Queue<String> queue = new LinkedList<>();
		Set<String> seen = new HashSet<>();
		
		return -1;
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (String s : strs) {
			String key = makeKey(s);
			if (map.containsKey(key))
				map.get(key).add(s);
			else {
				List<String> tmp = new ArrayList<>();
				tmp.add(s);
				map.put(key, tmp);
			}
		}
		return new ArrayList<>(map.values());

	}

	public static String makeKey(String s) {
		char[] tmp = s.toCharArray();
		Arrays.sort(tmp);
		String key = new String(tmp);

		return key;
	}

}
