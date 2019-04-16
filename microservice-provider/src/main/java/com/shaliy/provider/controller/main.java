package com.shaliy.provider.controller;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		String str = "abcddcba";
		List<String> list = new ArrayList();
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i, i + 1));
			if (list.contains(str.substring(i, i + 1))) {
				System.out.println("第一个出现两次的字母是" + str.substring(i, i + 1));
				break;
			} else {
				list.add(str.substring(i, i + 1));
			}
		}
	}
}
