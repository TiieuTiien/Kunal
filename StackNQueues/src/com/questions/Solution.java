package com.questions;

import java.util.Stack;

class Solution {
	
	public static void main(String[] args) {
		String str = "))())(";
		System.out.println(minInsertions(str));
	}
	
    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ')') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == ')') {
                        stack.pop();
                        stack.pop();
                    } else {
                        stack.add(c);
                    }
                } else {
                    count++;
                    stack.add('(');
                    stack.add(c);
                }
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.add(c);
                    } else {
                        count++;
                        stack.pop();
                    }
                } else {
                    stack.add(c);
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

