package com.questions;

import java.util.Stack;

public class QueueByStackRemove {
	private Stack<Integer> first;
	private Stack<Integer> second;
	
	public QueueByStackRemove() {
		first = new Stack<>();
		second = new Stack<>();
	}
	
	public void add(int item) throws Exception {
		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		
		first.push(item);
		
		while(!second.isEmpty()) {
			first.push(second.pop());
		}
	}
	
	public int remove() throws Exception {
		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		
		int removed = second.pop();
		
		while(!second.isEmpty()) {
			first.push(second.pop());
		}
		
		return removed;
	}
	
	public int peek() throws Exception{
		return first.peek();
	}
	
	public boolean isEmpty() {
		return first.isEmpty();
	}
	
	
	
}























