package test.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

class PetSequence{
	protected Pet[] pets=Pets.createArray(8);
}
public class NonCollectionSequence extends PetSequence{
	public Iterable iterable() {
		return new Iterable() {

			@Override
			public Iterator iterator() {
				// TODO Auto-generated method stub
				return new Iterator() {
					int i;
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
						
					}
					
				};
			}};
		
	}
	public List Randomized () {
		Random random=new Random(34);
		List list=new ArrayList(Arrays.asList(pets));
		Collections.shuffle(list, random);
		return list;
		
	}
	public List CollReversed() {
		List list=new ArrayList(Arrays.asList(pets));
		Collections.reverse(list);
		return list;
		
	}
	
	public Iterable reversed() {
		
		return new Iterable() {

			@Override
			public Iterator iterator() {
				// TODO Auto-generated method stub
				return new Iterator() {
					int i=pets.length-1;
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return i>=0;
					}

					@Override
					public Object next() {
						// TODO Auto-generated method stub
						return pets[i--];
					}

					@Override
					public void remove() {
						// TODO Auto-generated method stub
						
					}
					
				};
			}};
		
	}
	/*
	 * public static void main(String[] args) { NonCollectionSequence nc=new
	 * NonCollectionSequence(); InterfaceVsIterator.display(nc.iterable()); }
	 */
}
