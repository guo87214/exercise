package exercise.holding.exercise12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Reverse {
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(0);
		ls.add(1);
		ls.add(2);
		ls.add(3);
		List<Integer> ls1=new ArrayList<Integer>();
		/*
		 * ListIterator li=ls.listIterator(); while(li.hasPrevious()) {
		 * ls1.add((Integer)(li.previous())); }
		 */
		/*
		 * for(int i=ls.size()-1;i>=0;i--) { ls1.add(ls.get(i)); }
		 */
		ListIterator li=ls.listIterator();
		while(li.hasNext()) {
			li.next();
		};
		while(li.hasPrevious()) {
			ls1.add((Integer)(li.previous()));
		}
		System.out.print(ls1.size());
	}}
