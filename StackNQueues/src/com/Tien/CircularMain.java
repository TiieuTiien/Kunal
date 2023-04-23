package com.Tien;

public class CircularMain {
	
	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue(5);
		
		queue.insert(3);
		queue.insert(6);
		queue.insert(5);
		queue.insert(19);
		queue.insert(1);
		
		queue.display();
		
		try {
			System.out.println(queue.remove());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		queue.insert(133);
		
		queue.display();
	}
}
