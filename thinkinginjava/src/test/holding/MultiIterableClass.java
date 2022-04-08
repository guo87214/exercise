package test.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import holding.IterableClass;
import net.mindview.util.Print;

public class MultiIterableClass extends IterableClass {
	public Iterable<String> reversed(){
		return new Iterable<String>() {

			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<String>() {
					int i=words.length-1;
					@Override
					public boolean hasNext() {
						// TODO Auto-generated method stub
						return i>=0;
					}

					@Override
					public String next() {
						// TODO Auto-generated method stub
						return words[i--];
					}

					@Override
					public void remove() {
						// TODO Auto-generated method stub
						
					}
					
				};
			}
			
		};
		
	}
	public static void main(String[] args) {
		MultiIterableClass mic=new MultiIterableClass();
		
		  for(String s:mic.reversed()) { System.out.print(s+" "); }
		  System.out.println(); 
			
			  for(String s:mic.randomized()) { System.out.print(s+" "); }
			  System.out.println(); 
				
				  for(String s:mic.randomized1()) { System.out.print(s+" "); }
				  System.out.println();
				 
				 
		 
					
					  for(String s:mic) { System.out.print(s+" "); }
					 
	}
	public Iterable<String> randomized1(){
		return new Iterable<String>() {

			
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<String>() {
				 Random ra=new Random(100); 
				 
				 Integer[] in1=new Integer[words.length];
				 int i;
				 {
					 Integer[] in=new Integer[words.length];
					 List<Integer> list=new ArrayList<Integer>();
				 for(int i=0;i<words.length;i++) {
					 list.add(i);
				 }
				 
				 for(int i=0;i<words.length;i++) {
					 int index;
					 do {
						 index=ra.nextInt(words.length);
					 }while(index>=list.size());
					 in1[i]=list.get(index);
					 list.remove(index);
				 }
				 }
				  public boolean hasNext() { // TODO Auto-generated method stub
				  
				  return i<words.length; }
				  
				 public String next() { 
					 // TODO Auto-generated method stub return
					 
				 return words[in1[i++]]; }
				  
				 public void remove() { // TODO Auto-generated method stub
				  
				  }
				  
				   };
			
			
		};
	
	};
	}
	public Iterable<String> randomized(){
		return new Iterable<String>() {

			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stubC
				List<String> shuffled=new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(shuffled,new Random(47));
				 return shuffled.iterator(); 
			}

			
			 
			
		};
	}
}
