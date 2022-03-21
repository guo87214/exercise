package exercise.holding.exercise18;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import net.mindview.util.Print;

public class HashMapTest {
	public static void main(String[] args) {
		/*
		 * Map<Integer,String> hs=new HashMap<Integer,String>(); hs.put(2, "2");
		 * hs.put(3, "03"); hs.put(1, "01"); hs.put(4, "04"); for(Integer
		 * in:hs.keySet()) { Print.print("hashcode:"+in.hashCode()+"/t"+in); }
		 */
		HashMap<String,Integer> hs=new HashMap<String,Integer>();
		LinkedHashMap<String,Integer> lh=new LinkedHashMap<String,Integer>();
		hs.put("01", 1);
		hs.put("02", 2);
		hs.put("04", 4);
		hs.put("03", 3);
		lh.put("02", 2);
		lh.put("01", 1);
		lh.put("03", 3);
		lh.put("04", 4);
		Print.print(hs);
		Print.print(lh);
		for(String s:hs.keySet()) {
			Print.print("key hashcode:"+s.hashCode()+" value hashcode:"+hs.get(s).hashCode());
			/* lh.put(s, hs.get(s)); */
		}
		for(String s:lh.keySet()) {
			Print.print("key hashcode:"+s.hashCode()+" value hashcode:"+lh.get(s).hashCode());
		}
	}
}
