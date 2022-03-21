package exercise.holding.exercise21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.Print;
import net.mindview.util.TextFile;

public class MapTest {
	public static void main(String[] args) {
	    Set<String> words = new TreeSet<String>(
	      new TextFile("SetOperations.java", "\\W+"));
	    System.out.println(words);
	    HashMap<String,Integer> map=new HashMap<String,Integer>();
	    List<String>words1=new ArrayList<String>(new TextFile("SetOperations.java","\\W+"));
	    List<String> words2=new ArrayList<String>();
	    for(String s:words) {
	    	int i=0;
	    	for(String s1:words1) {
	    		if(s1.equals(s)) {
	    			i++;
	    		}
	    	}
	    	map.put(s, i);
	    	words2.add(s);
	    }
	    Collections.sort(words2,String.CASE_INSENSITIVE_ORDER);
	    Print.print(map);
	    Print.print(words2);
	   for(String s:words2) {
		 Print.print(s+"="+map.get(s));
	  }
}}
