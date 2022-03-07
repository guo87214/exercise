package test.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import net.mindview.util.Print;
import typeinfo.pets.Cymric;
import typeinfo.pets.Hamster;
import typeinfo.pets.Mouse;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

public class ListFeatures {
	public static void main(String[] args) {
Random rand=new Random(47);
List<Pet> pets=Pets.arrayList(7);
Print.print("1:"+pets);
Hamster h=new Hamster();
pets.add(h);
Print.print("2:"+pets);
Print.print("3:"+pets.contains(h));
pets.remove(h);
Pet p=pets.get(2);
Print.print("4:"+p+" "+pets.indexOf(p));
Pet cymric=new Cymric();
Print.print("4.1:"+pets);
Pet cymric1=pets.get(2);
Pet cymric2=pets.get(5);
Print.print("5:"+pets.indexOf(cymric));
Print.print("5.1:"+pets.indexOf(cymric1));
Print.print("5.2:"+pets.indexOf(cymric2));
Print.print("6:"+pets.remove(cymric));
Print.print("7:"+pets.remove(p));
Print.print("8:"+pets);
pets.add(3,new Mouse());
Print.print("9:"+pets);
List<Pet> sub=pets.subList(1, 4);
Print.print("subList:"+sub);
Print.print("10:"+pets.containsAll(sub));
Collections.sort(sub);
Print.print("sorted subList:"+sub);
Print.print("11:"+pets.containsAll(sub));
Collections.shuffle(sub,rand);
Print.print("shuffled subList"+sub);
Print.print("12:"+pets.containsAll(sub));
List<Pet> copy=new ArrayList<Pet>(pets);
sub=Arrays.asList(pets.get(1),pets.get(4));
Print.print("sub:"+sub);
copy.retainAll(sub);
Print.print("13:"+copy);
copy=new ArrayList<Pet>(pets);
copy.remove(2);
Print.print("14:"+copy);
copy.removeAll(sub);
Print.print("15:"+copy);
copy.set(1, new Mouse());
Print.print("16:"+copy);
copy.addAll(2,sub);
Print.print("17:"+copy);
Print.print("18:"+pets.isEmpty());
pets.clear();
Print.print("19:"+pets);
Print.print("20:"+pets.isEmpty());
pets.addAll(Pets.arrayList(4));
Print.print("21:"+pets);
Object[] o=pets.toArray();
Print.print("22:"+o[3]);
Pet[] pa=pets.toArray(new Pet[0]);
Print.print("23:"+pa[3].id());
	}
}
