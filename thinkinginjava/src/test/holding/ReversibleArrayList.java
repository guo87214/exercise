package test.holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ReversibleArrayList<T> extends ArrayList<T> {
	public ReversibleArrayList(Collection<T> c) {
		super(c);
	}
	public Iterable<T> reversed(){
		return new Iterable<T>() {

			@Override
			public Iterator<T> iterator() {
				// TODO Auto-generated method stub
				return new Iterator() { int a=size()-1;
				  
				 @Override public boolean hasNext() { // TODO Auto-generated method stub
				  return a>=0; }
				  
				 @Override public Object next() { // TODO Auto-generated method stub return
				 return get(a--); }
				  
				  @Override public void remove() { // TODO Auto-generated method stub throw new
				 throw new  UnsupportedOperationException();
				 
				  };
			};
			
		};
	};
	/*
	 * public Iterator reversed(){ return new Iterator() { int a=size()-1;
	 * 
	 * @Override public boolean hasNext() { // TODO Auto-generated method stub
	 * return a>=0; }
	 * 
	 * @Override public Object next() { // TODO Auto-generated method stub return
	 * get(a--); }
	 * 
	 * @Override public void remove() { // TODO Auto-generated method stub throw new
	 * UnsupportedOperationException();
	 * 
	 * }};
	 * 
	 * }
	 */
}
}
