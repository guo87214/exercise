package test.holding;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
public class CollectionSequence implements Collection{
	private Pet[] pets=Pets.createArray(8);
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return pets.length;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return pets.length==0;
	}

	@Override
	public boolean contains(Object o) {
		boolean f=true;
		Pet p=(Pet)o;
		for(Pet pet:pets) {
			if(pet.equals(p)) {
				f=true;
				break;
			}else {
				f=false;
			}
		}
		// TODO Auto-generated method stub
		return f;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new Iterator(){
			private int i=0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return i<pets.length;
			}

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				return pets[i++];
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
			
		};
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		boolean b=true;
		Pet[] pets1=(Pet[])c.toArray();
		if(pets1.length<=pets.length) {
		for(Pet p:pets1) {
			for(Pet p1:pets) {
				if(p.equals(p1)) {
					b=true;
					p=null;
					break;
				}else {
					b=false;
				}
			}
			if(!b) {
				break;
			}
		}
		}else {
			b=false;
		}
		return b;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		boolean b=true;
		Pet[] pets1=(Pet[])c.toArray();
		if(pets1.length<=pets.length) {
		for(Pet p:pets1) {
			for(Pet p1:pets) {
				if(p.equals(p1)) {
					b=true;
					break;
				}else {
					b=false;
				}
			}
			if(!b) {
				break;
			}
		}
		}else {
			b=false;
		}
		return b;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		pets= null;
	}
	
}
/*
 * public class CollectionSequence extends AbstractCollection<Pet>{ private
 * Pet[] pets=Pets.createArray(8);
 * 
 * @Override public Iterator<Pet> iterator() { // TODO Auto-generated method
 * stub
 * 
 * return new Iterator<Pet>() { private int index=0; public boolean hasNext() {
 * return index<pets.length; } public Pet next() { return pets[index++]; }
 * public void remove() { throw new UnsupportedOperationException(); } };
 * 
 * }
 * 
 * @Override public int size() { // TODO Auto-generated m ethod stub
 * 
 * return pets.length; } public static void main(String[] args) { //²âÊÔ
 * CollectionSequence c=new CollectionSequence();
 * InterfaceVsIterator.display(c); InterfaceVsIterator.display(c.iterator()); }
 * }
 */