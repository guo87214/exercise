package test.holding;

import java.util.ArrayList;
import java.util.Iterator;

import net.mindview.util.Print;



public class IterableClass implements Iterator<String> {
	protected String[] words=("And that is how"+"we know the Each to be banana-shaped.").split(" ");
	
	
	public static void main(String[] args) {
		while(new IterableClass().hasNext()) {
			
		}
		/*
		 * for(String s:new IterableClass()) {
		 * 
		 * }
		 */
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String next() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	

}
