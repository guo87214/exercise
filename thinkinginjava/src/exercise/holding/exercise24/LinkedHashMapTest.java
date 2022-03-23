package exercise.holding.exercise24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.mindview.util.Print;

public class LinkedHashMapTest {
public static void main(String[] args) {
	Map<String,Integer> map=new LinkedHashMap<String,Integer>();
	map.put("Map", 1);
	map.put("String", 2);
	map.put("Integer", 3);
	map.put("map", 4);
	map.put("new", 5);
	Object[] o=map.keySet().toArray();
	Print.print(o[0]);
	Map<String,Integer> map1=new LinkedHashMap<String,Integer>();
	Arrays.sort(o);Arrays.sort(o, new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			String s1=(String)o1;
			String s2=(String)o2;
			return s1.compareToIgnoreCase(s2);
		}
		
	});
	Print.print(o[0]);
	for(Object b:o) {
		map1.put((String)b, map.get(b));
	}
	Print.print(map1.toString());
	
}
}
