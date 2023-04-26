package com.questions;

import java.util.Stack;

//https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/
public class MinInsertions {

	public static void main(String[] args) {
		String str = "()))";
		System.out.println(minInsertions(str));
	}

	public static int minInsertions(String s) {
		Stack<Character> stack = new Stack<>();
		int count = 0;

		for (char ch : s.toCharArray()) {
			if (ch == ')') {
				if (!stack.isEmpty()) {
					if (stack.peek() == ')') {
						stack.pop();
						stack.pop();
					} else {
						stack.push(ch);
					}
				} else {
					count++;
					stack.push('(');
					stack.push(ch);
				}
			} else if(ch == '(') {
				if (!stack.isEmpty()) {
					if (stack.peek() == '(') {
						stack.push(ch);
					} else {
						count++;
						stack.pop();
					}
				} else {
					stack.push(ch);
				}
			}
		}

		while (!stack.isEmpty()) {
			if (stack.peek() == '(') {
				count += 2;
				stack.pop();
			} else {
				count++;
				stack.pop();
				stack.pop();
			}
		}
		
		return count;

	}

}
