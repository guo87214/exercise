package test.holding;

import java.util.ArrayList;
import java.util.Iterator;

import net.mindview.util.Print;



public class IterableClass implements Iterable<String> {
	protected String[] words=("And that is how"+"we know the Each to be banana-shaped.").split(" ");
	
	
	public static void main(String[] args) {
		
		
		 for(String s:new IterableClass()) {
		 
		 }
		 
	}
	
	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new Iterator() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
	

}
