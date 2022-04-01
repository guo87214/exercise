package test.holding;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import net.mindview.util.Print;

public class ForEachCollections {
	public static void main(String[] args) {
		Collection<String> cs=new LinkedList<String>();
		Collections.addAll(cs,"Take the long way home".split(" "));
		for(String s:cs) {
			Print.print("'"+s+"'");
		}
	}
}
