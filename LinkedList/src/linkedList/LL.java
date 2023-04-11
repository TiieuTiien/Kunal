package linkedList;

import linkedList.MergeSort.ListNode;

public class LL {

	private Node head;
	private Node tail;

	private int size;

	public LL() {
		this.size = 0;
	}

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}

		size += 1;
	}

	public void insertLast(int val) {
		if (tail == null) {
			insertFirst(val);
			return;

		}

		Node node = new Node(val);
		tail.next = node;
		tail = node;

		size += 1;
	}

	public void insert(int val, int index) {
		if (index == 0) {
			insertFirst(val);
			return;
		}

		if (index == size) {
			insertLast(val);
			return;
		}

		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}

		Node node = new Node(val, temp.next);
		temp.next = node;

		size++;

	}
	
	// insert using recursion
	public void insertRec(int val, int index) {
		head = insertRec(val, index, head);
	}
	
	private Node insertRec(int val, int index, Node node) {
		if(index == 0) {
			Node temp = new Node(val, node);
			size++;
			return temp;
		}
		
		node.next = insertRec(val, --index, node.next);
		return node;
	}
	
	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		if(head == null) {
			tail = null;
		}
		
		size--;
		return val;
	}
	
	public int deleteLast() {
		if(size <= 1) {
			return deleteFirst();
		}
		
		Node secondNode = get(size - 2);
		int val = tail.value;
		tail = secondNode;
		tail.next = null;
		return val;
	}
	
	public int delete(int index) {
		if(index == 0) {
			return deleteFirst();
		}
		
		if(index == size - 1) {
			return deleteLast();
		}
		
		Node prev = get(index - 1);
		int val = prev.next.value;
		
		prev.next = prev.next.next;
		
		return val;		
	}
	
	public Node find(int value) {
		Node node = head;
		
		while(node != null) {
			if(node.value == value) {
				return node;
			}
			node = node.next;
		}
		
		return null;
	}

	public void bubbleSort() {
		bubbleSort(size - 1, 0);
		
	}
	
	// recursive reverse
	public void reverseList(Node node) {
		if(node == tail) {
			head = tail;
			return;
		}
		
		reverseList(node.next);
		
		tail.next = node;
		tail = node;
		tail.next = null;
	}
	
	// in place reverse linked list
	//	https://leetcode.com/problems/reverse-linked-list/
	public void reverse() {
		if(size < 2) {
			return;
		}
		
		Node prev = null;
		Node pres = head;
		Node next = pres.next;
		
		while(pres != null) {
			pres.next = prev;
			prev = pres;
			pres = next;
			if(next != null) {
				next = next.next;
			}
		}
		head = prev;
	}
	
	// https://leetcode.com/problems/reverse-linked-list-ii/
	public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) {
        	return head;
        }
        
        // skip the first left - 1 node
        ListNode current = head;
        ListNode prev = null;
        for(int i = 0; current != null && i < left - 1; i++) {
        	prev = current;
        	current = current.next;
        }
        
        ListNode last = prev;
        ListNode newEnd = current;
        
        // reverse between left and right
        ListNode next = current.next;
        for(int i = 0; current != null && i < right - left + 1; i++) {
        	current.next = prev;
        	prev = current;
        	current = next;
        	if(next != null) {
        		next = next.next;
        	}
        	
        	if(last != null) {
        		last.next = prev;
        	}else {
        		head = prev;
        	}
		}

		newEnd.next = current;
		return head;
        
    }
	
	public void bubbleSort(int row, int col) {
		if(row == 0) {
			return;
		}
		
		if(col < row) {
			Node first =  get(col);
			Node second = get(col+1);
			
			if(first.value > second.value) {
				// swap
				if(first ==  head) {
					head = second;
					first.next = second.next;
					second.next = first;
				}else if(second == tail) {
					get(col-1).next = second;
					tail = first;
					first.next = null;
					second.next = tail;
				}else {
					get(col-1).next = second;
					first.next = second.next;
					second.next = first;
				}
			}
			bubbleSort(row, col + 1);
		}else {
			bubbleSort(row - 1, 0);
		}
	}
	
	public Node get(int index) {
		Node node = head;
		
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		
		return node;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

	}
	
	// question
	public void duplicates() {
		Node node = head;
		
		while(node.next != null) {
			if(node.next != null && node.value == node.next.value) {
				node.next = node.next.next;
				size--;
			}else
				node = node.next;
		}
		
		tail = node;
		tail.next = null;
	}
	
	// merge
//	public Node mergeTwoLists(Node list1, Node list2) {
//        Node list = new Node();
//        Node node = list;
//        while(list1 != null && list2 != null){
//            if(list1.val < list2.val){
//                node.next = list1;
//                list1 = list1.next;
//                node = node.next;
//            }else{
//                node.next = list2;
//                list2 = list2.next;
//                node = node.next;
//            }
//        }
//
//        node.next = (list1 != null) ? list1 : list2;
//        return list.next;
//    }

}
