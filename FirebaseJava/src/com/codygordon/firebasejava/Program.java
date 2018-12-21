package com.codygordon.firebasejava;

import com.codygordon.firebasejava.Config.Config;

public class Program {

	public static void main(String[] args) {
		String tag = "Document_URL";
		String value = Config.getElementValue(tag);
		System.out.println(value);
	}
}