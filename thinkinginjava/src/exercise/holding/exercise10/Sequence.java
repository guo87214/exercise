package exercise.holding.exercise10;

import java.util.Arrays;
import java.util.Iterator;

import exercise.holding.exercise10.Sequence;
import net.mindview.util.Print;
import typeinfo.pets.Rodent;


	public class Sequence {
		  private Object[] items;
		  private int next = 0;
		  public Sequence(int size) { items = new Object[size]; }
		  public void add(Object x) {
		    if(next < items.length)
		      items[next++] = x;
		  }

			
			/*
			 * private class SequenceSelector implements Selector { private int i = 0;
			 * public boolean end() { return i == items.length; } public Object current() {
			 * return items[i]; } public void next() { if(i < items.length) i++; } }
			 * 
			 * public Selector selector() { return new SequenceSelector(); }
			 */
		  public static void main(String[] args) {
		    Sequence sequence = new Sequence(10);
		    for(int i = 0; i < 10; i++)
		      sequence.add(new Rodent(Integer.toString(i)));
		    
			/*
			 * Selector selector = sequence.selector(); while(!selector.end()) {
			 * System.out.print(selector.current() + " "); selector.next(); }
			 */
		    Iterator it=Arrays.asList(sequence.items).iterator();
		    while(it.hasNext()) {
		    	Print.print("Iterator±éÀúµ½£º"+it.next());
		    }
		  }
		}

