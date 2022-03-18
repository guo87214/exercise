package test.holding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.mindview.util.Print;
import typeinfo.pets.Cat;
import typeinfo.pets.Cymric;
import typeinfo.pets.Dog;
import typeinfo.pets.Mutt;
import typeinfo.pets.Person;
import typeinfo.pets.Pet;
import typeinfo.pets.Pug;
import typeinfo.pets.Rat;

public class MapOfList {
	public static Map<Person,List<?extends Pet>> petPeople=new HashMap<Person,List<?extends Pet>>();
	static {
		petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"),new Mutt("Spot")));
		petPeople.put(new Person("Kate"),Arrays.asList(new Cat("Shackleton"),new Cat("Elsie May"),new Dog("Margrett")) );
		petPeople.put(new Person("Marilyn"), Arrays.asList(new Pug("Louie aks louis Snorkelstein Dupree"),new Cat("Stanford aks stinky el Negro"),
				new Cat("Pinkola")));
		petPeople.put(new Person("Isaac"), Arrays.asList(new Rat("Freckly")));
		
		}
	public static void main(String[] args) {
		Print.print("People:"+petPeople.keySet());
		Print.print("Pets:"+petPeople.values());
		for(Person person:petPeople.keySet()) {
			Print.print(person+"has:");
			for(Pet pet:petPeople.get(person)) {
				Print.print("  "+pet);
			}
		}
	}
}
