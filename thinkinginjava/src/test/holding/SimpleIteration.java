package test.holding;

import java.util.Iterator;
import java.util.List;

import net.mindview.util.Print;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class SimpleIteration {
	public static void main(String[] args) {
		List<Pet> pets=Pets.arrayList(12);
		Iterator<Pet> it=pets.iterator();
		while(it.hasNext()) {
			Pet p=it.next();
			Print.print(p.id()+":"+p+" ");
		}
		System.out.println();
		for(Pet p:pets) {
			Print.print(p.id()+":"+p+" ");
		}
		System.out.println();
		it=pets.iterator();
		for(int i=0;i<6;i++) {
			
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(pets);
	}
}
