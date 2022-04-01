package test.holding;

import java.util.ArrayList;
import java.util.Iterator;

import net.mindview.util.Print;



public class IterableClass implements Iterator<String> {
	protected String[] words=("And that is how"+"we know the Each to be banana-shaped.").split(" ");
	
	public Iterator<String> iterator(){
		return new Iterator<String>() {
			private int index=0;
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index<words.length;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return words[index++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
			
		};
		}
	public static void main(String[] args) {
		for(String s:new IterableClass()) {
			Print.print(s+" ");
		}
	}
	

}
