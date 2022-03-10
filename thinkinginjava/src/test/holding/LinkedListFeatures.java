package test.holding;

import java.util.LinkedList;

import net.mindview.util.Print;
import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

public class LinkedListFeatures {
	public static void main(String[] args) {
		LinkedList<Pet> pets=new LinkedList<Pet>(Pets.arrayList(5));
		Print.print(pets);
		Print.print("pets.getFirst():"+pets.getFirst());
		Print.print("pets.element():"+pets.element());
		Print.print("pets.peek():"+pets.peek());
		Print.print("pets.remove():"+pets.remove());
		Print.print("pets.removeFirst():"+pets.removeFirst());
		Print.print("pets.poll():"+pets.poll());
		Print.print(pets);
		pets.addFirst(new Rat());
		Print.print("After addFirst():"+pets);
		pets.offer(Pets.randomPet());
		Print.print("After offer():"+pets);
		pets.add(Pets.randomPet());
		Print.print("After add():"+pets);
		pets.addLast(new Hamster());
		Print.print("After addLast():"+pets);
		Print.print("pets.removeLast():"+pets.removeLast());
	}
}
