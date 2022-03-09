package exercise.holding.exercise11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import net.mindview.util.Print;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class IteratorTest {
	public static void StepThrough(Collection coll,Object[] ob) {
		for(Object o:ob) {
			coll.add(o);
		}
	Iterator it=coll.iterator();
	System.out.println("\n"+"Collection中的类"+coll.getClass()+"的元素：");
	while(it.hasNext()) {
		
		System.out.print(it.next()+"\t");
	}
	}
	public static void main(String arg[]) {
		Pet[] pl=Pets.createArray(10);
		/*
		 * ArrayList al=(ArrayList) Arrays.asList(pl);
		 * 
		 * LinkedList ll=(LinkedList) Arrays.asList(pl); Vector vc=(Vector)
		 * Arrays.asList(pl); HashSet hs=new HashSet(); hs.addAll(al); LinkedHashSet
		 * ls=new LinkedHashSet(); ls.addAll(al);
		 */
		
		StepThrough(new ArrayList(),pl);
		StepThrough(new LinkedList(),pl);
		StepThrough(new Vector(),pl);
		StepThrough(new HashSet(),pl);
		StepThrough(new LinkedHashSet(),pl);
	}
}
