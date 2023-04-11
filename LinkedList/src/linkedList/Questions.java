package linkedList;

import java.util.List;

import linkedList.CycleQuestions.LL;

public class Questions {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	// https://leetcode.com/problems/reverse-linked-list/
	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode prev = null;
		ListNode pres = head;
		ListNode next = pres.next;

		while (pres != null) {
			pres.next = prev;
			prev = pres;
			pres = next;
			if (next != null) {
				next = next.next;
			}
		}
		return prev;
	}

	// https://leetcode.com/problems/reverse-nodes-in-k-group/
	// its also reversing the < k end times -> modify it accordingly
	public ListNode reverseAlternateKGroup(ListNode head, int k) {
		if (k <= 1 || head == null) {
			return head;
		}

		// skip the first left - 1 node
		ListNode current = head;
		ListNode prev = null;

		while (current != null) {
			ListNode last = prev;
			ListNode newEnd = current;

			// reverse between left and right
			ListNode next = current.next;
			for (int i = 0; current != null && i < k; i++) {
				current.next = prev;
				prev = current;
				current = next;
				if (next != null) {
					next = next.next;
				}

				if (last != null) {
					last.next = prev;
				} else {
					head = prev;
				}
			}

			newEnd.next = current;

			// Skip the k nodes
			for (int i = 0; current != null && i < k; i++) {
				prev = current;
				current = current.next;
			}

		}
		return head;

	}

	// https://leetcode.com/problems/rotate-list/
	public ListNode rotateRight(ListNode head, int k) {
		if (k <= 0 || head == null || head.next == null) {
			return head;
		}
		
		ListNode last = head;
		int length = 1;
		while(last.next != null) {
			last = last.next;
			length++;
		}
		
		last.next = head;
		int rotations = k % length;
		int skip = length - rotations;
		ListNode newLast = head;
		
		for(int i = 0; i < skip - 1; i++) {
			newLast = newLast.next;
		}
		
		head = newLast.next;
		newLast.next = null;
		
		return head;
		
	}
	
//	public ListNode rotateRight(ListNode head, int k) {
//		if(head == null) {
//			return head;
//		}
//		int length = 0;
//		ListNode check = head;
//		ListNode last = head;
//		while(check != null) {
//			length++;
//			check = check.next;
//			if(check != null) {
//				last = last.next;
//			}
//		}
//		check = head;
//		if(k % length > 0) {
//			last.next = head;
//		}
//		for(int i = 1; i < k % length; i++) {
//			check = check.next;
//		}
//		head = check.next;
//		check.next = null;
//		return head;		
//	}

	// https://leetcode.com/problems/reverse-linked-list-ii/
	public ListNode reverseBetween(ListNode head, int left, int right) {
		if (left == right) {
			return head;
		}

		// skip the first left - 1 node
		ListNode current = head;
		ListNode prev = null;
		for (int i = 0; current != null && i < left - 1; i++) {
			prev = current;
			current = current.next;
		}

		ListNode last = prev;
		ListNode newEnd = current;

		// reverse between left and right
		ListNode next = current.next;
		for (int i = 0; current != null && i < right - left + 1; i++) {
			current.next = prev;
			prev = current;
			current = next;
			if (next != null) {
				next = next.next;
			}

			if (last != null) {
				last.next = prev;
			} else {
				head = prev;
			}
		}

		newEnd.next = current;
		return head;

	}

	// https://leetcode.com/problems/middle-of-the-linked-list/description/
	public ListNode middleNode(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		return slow;
	}

	// https://leetcode.com/problems/palindrome-linked-list/
	public boolean isPalindrome(ListNode head) {
		ListNode mid = middleNode(head);
		ListNode headSecond = reverseList(head);
		ListNode rereverseHead = headSecond;

		// compare both the halves
		while (head != null && headSecond != null) {
			if (head.val != headSecond.val) {
				break;
			}
			head = head.next;
			headSecond = headSecond.next;
		}

		reverseList(rereverseHead);

		return head == null || headSecond == null;
	}

	// https://leetcode.com/problems/reorder-list/
	public void reorderList(ListNode head) {
		if (head == null || head.next == null) {
			return;
		}

		ListNode mid = middleNode(head);

		ListNode hS = reverseList(mid);
		ListNode hF = head;

		// rearange
		ListNode temp = head;
		while (hF != null || hS != null) {
			temp = hF.next;
			hF.next = hS;
			hF = temp;

			temp = hS.next;
			hS.next = hF;
			hS = temp;
		}

		if (hF != null) {
			hF.next = null;
		}

	}

}
