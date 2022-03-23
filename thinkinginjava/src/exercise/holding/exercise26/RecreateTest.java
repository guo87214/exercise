package exercise.holding.exercise26;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import exercise.holding.exercise25.MapArrayListTest;
import net.mindview.util.Print;
import net.mindview.util.TextFile;

public class RecreateTest {
	public static void main(String args[]) {
		Set<String> set=new LinkedHashSet<String>(new TextFile("SetOperations.java","\\W+"));
		Map<String,ArrayList<Integer>> map1=MapArrayListTest.getMap("SetOperations.java", "\\W+");
		Map<String,ArrayList<Integer>> map=new LinkedHashMap<String,ArrayList<Integer>>();
		for(String s:set) {
			map.put(s, map1.get(s));
		}
		Print.print(map1+"\n"+map);
	}
}
