package linkedList;

public class MergeSort {

	public ListNode sortList(ListNode head) {
		if(head == null || head.next == null){
			return head;
		}
		
		ListNode mid = getMid(head);
		ListNode left = sortList(head);
		ListNode right = sortList(mid);
		
		return merge(left, right);
	}

	public ListNode merge(ListNode list1, ListNode list2) {
		ListNode list = new ListNode();
		ListNode node = list;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				node.next = list1;
				list1 = list1.next;
				node = node.next;
			} else {
				node.next = list2;
				list2 = list2.next;
				node = node.next;
			}
		}

		node.next = (list1 != null) ? list1 : list2;
		return list.next;
	}
	
	ListNode getMid(ListNode head) {
		ListNode midPrev = null;
		while(head != null && head.next != null) {
			midPrev = (midPrev == null) ? head : midPrev.next;
			head  = head.next.next;
		}
		ListNode mid = midPrev.next;
		midPrev.next = null;
		return mid;
	}

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

}
