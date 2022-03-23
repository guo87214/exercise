package exercise.holding.exercise25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.mindview.util.Print;
import net.mindview.util.TextFile;

public class MapArrayListTest {
	public static Map<String,ArrayList<Integer>> getMap(String file,String reg){
		Map<String,ArrayList<Integer>> map=new LinkedHashMap<String,ArrayList<Integer>>();
		List<String> list=new ArrayList<String>(new TextFile(file,reg));
		Set<String> set=new HashSet<String>(new TextFile(file,reg));
		for(String s:set) {
			ArrayList<Integer> lt=new ArrayList<Integer>();
			int i=0;
			for(String s1:list) {
				i++;
				if(s.equals(s1)) {
					lt.add(i);
				}
			}
			map.put(s, lt);
		}
		return map;
	}		public static void main(String args[]) {
		
		Print.print(getMap("SetOperations.java","\\W+").toString());
		}
}
