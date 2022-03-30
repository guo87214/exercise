package test.holding;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.mindview.util.Print;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class InterfaceVsIterator {
	public static void display(Iterator<Pet> it) {
		while(it.hasNext()) {
			Pet p=it.next();
			Print.print(p.id()+":"+p+" ");
		}
	}
	public static void display(Collection<Pet> pets) {
		for(Pet p:pets) {
			Print.print(p.id()+":"+p+" ");
		}
		Print.print();
	}
	public static void main(String[] args) {
		Integer i=0;
		Object i1=i;
		Integer i2=(Integer)i1;
		Print.print(i2.getClass().equals(i));
		/*
		 * List<Pet> petList=Pets.arrayList(8); Set<Pet> petSet=new
		 * HashSet<Pet>(petList); Map<String,Pet> petMap=new
		 * LinkedHashMap<String,Pet>(); String[]
		 * names=("Ralph,Eric,Robin,Lacey,"+"Britney,Sam,Spot,Fluffy").split(",");
		 * for(int i=0;i<names.length;i++) { petMap.put(names[i], petList.get(i)); }
		 * display(petList); display(petSet); display(petList.iterator());
		 * display(petSet.iterator()); Print.print(petMap);
		 * Print.print(petMap.keySet()); display(petMap.values());
		 * display(petMap.values().iterator());
		 */
		/*
		 * String s="1"; String q="2";
		 * Print.print(s.getClass().equals(q.getClass())+"  "+String.class.equals(s.
		 * getClass()));
		 */
		/*
		 * int[] i=new int[0]; i[1]=5; i[7]=9; for(int a:i) { Print.print(a); }
		 */
	}
}
