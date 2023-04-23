package com.Tien;

public class CircularQueue {
	protected int[] data;	
	private static final int DEFAULT_SIZE = 10;
	
	protected int end = 0;
	protected int front = 0;
	private int size = 0;
	
	public CircularQueue() {
		this(DEFAULT_SIZE);
	}
	
	public CircularQueue(int size) {
		this.data = new int[size];
	}

	protected boolean isFull() {
		return end == data.length; // ptr is at last index
	}
	
	private boolean isEmpty() {
		return end == -1;
	}
	
	public boolean insert(int item) {
		if(isFull()) {
			return false;
		}
		data[end++] = item;
		end %= data.length;
		size++;;
		return true;
	}
	
	public int remove() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		
		int removed = data[front++];
		front = front % data.length;
		size--;
		return removed;
	}
	
	public int front() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		
		return data[front];
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Empty");
			return;
		}
		int i = front;
		
		do {
			System.out.print(data[i] + " -> ");
			i++;
			i %= data.length;
		}while(i != end);
		System.out.println("END");
	}

}
