package exercise.holding.exercise23;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import net.mindview.util.Print;

public class Statistics {
	public static void main(String[] args) {
	
		Random rand=new Random(1000);
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<1000;i++) {
			int a=rand.nextInt(20);
			Integer freq=map.get(a);
			map.put(a, freq==null?1:freq+1);
		}
		int a=0;
		for(Integer i:map.values()) {
			if(i>a) {
				a=i;
			}
		}
		Print.print(a+" "+Collections.max(map.values())+" "+Collections.min(map.values()));
	}
}
