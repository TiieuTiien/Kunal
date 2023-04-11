package linkedList;

public class Main {
	public static void main(String[] args) {

		LL list1 = new LL();
		list1.insertLast(1);
		list1.insertFirst(2);
		list1.insertLast(4);
		list1.insertFirst(4);
		list1.insertLast(5);
		
		list1.display();
		
		list1.bubbleSort();
		
		list1.display();
		
//		LL list2 = new LL();
//		list2.insertLast(1);
//		list2.insertLast(3);
//		list2.insertLast(5);
//		list2.insertLast(7);
//		list2.insertLast(9);
//		
//		list2.display();
		
//		LL mergeList = LL.merge(list1, list2);
		
//		mergeList.display();

//		DLL list = new DLL();
//		list.insertFirst(3);
//		list.insertFirst(2);
//		list.insertFirst(8);
//		list.insertFirst(17);
//		list.insertLast(99);
//		list.insert(8, 65);
//		
//		list.display();
		
//		CLL list = new CLL();
//		list.insert(23);
//		list.insert(3);
//		list.insert(19);
//		list.insert(75);
//		list.display();
//		list.delete(19);
//		list.display();
	}
}
















