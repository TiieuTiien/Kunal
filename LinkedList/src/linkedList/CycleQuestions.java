package linkedList;

public class CycleQuestions {

	class LL {
		int val;
		LL next;

		LL(int x) {
			val = x;
			next = null;
		}
	}

	// https://leetcode.com/problems/linked-list-cycle/
	public boolean hasCycle(LL head) {
		LL fast = head;
		LL slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow)
				return true;
		}

		return false;
	}
	
	// https://leetcode.com/problems/linked-list-cycle-ii/
	public LL detectCycle(LL head) {
		int length = 0;
		
		LL fast = head;
		LL slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow){
				length = lengthCycle(slow);
				break;
			}
		}

		// find the start node
		LL f = head;
		LL s = head;
		while(length > 0) {
			s = s.next;
			length--;
		}
		
		// keep moving both forward
		while(f != s) {
			f = f.next;
			s = s.next;
		}
		
		return f;
    }

	// find of the cycle
	public int lengthCycle(LL head) {
		LL fast = head;
		LL slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow){
				LL temp = slow;
				int length = 0;
				do {
					temp = temp.next;
					length++;
				}while(temp != slow);
				return length;
			}
		}

		return 0;
	}
	
	// https://leetcode.com/problems/happy-number/
	public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do {
        	slow = findSquare(slow);
        	fast = findSquare(findSquare(fast));
        }while(slow != fast);
        
        if(slow == 1) {
        	return true;
        }
        
        return false;
        
    }
	
	private int findSquare(int number) {
		int ans  = 0;
		while(number > 0) {
			int rem = number % 10;
			ans += rem * rem;
			number /= 10;
		}
		return ans;
	}
	
	// https://leetcode.com/problems/middle-of-the-linked-list/description/
    public LL middleNode(LL head) {
        if(head == null){
            return null;
        }

        LL slow = head;
        LL fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
}
