package exercise.holding.exercise14;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ListIterator<Integer> li=ll.listIterator();
		if(!li.hasNext()) {
			System.out.println("ll���ǿյģ�");
			//li.set(0);
			//li.add(0);
			//System.out.println("ll����"+li.next());
		}
		ll.add(0);
		ListIterator<Integer> li1=ll.listIterator();
		if(li1.hasNext()) {
			System.out.print("ll����"+li1.next());
		}
	
		
	}
}
