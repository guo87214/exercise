package exercise.holding.exercise19;

import java.util.HashSet;
import java.util.LinkedHashSet;

import net.mindview.util.Print;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		hs.add("01");
		hs.add("02");
		hs.add("03");
		hs.add("04");
		lh.add("01");
		lh.add("02");
		lh.add("03");
		lh.add("04");
		
		for(String s:hs) {
			Print.print("HashSet的hashcode是："+s.hashCode()+" "+s);
			/* lh.add(s); */
		}
		for(String s:lh) {
			Print.print("LinkedHashSet的hashcode是："+s.hashCode()+" "+s);
			
		}
	}
}
