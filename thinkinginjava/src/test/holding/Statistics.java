package test.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import net.mindview.util.Print;

public class Statistics {
	public static void main(String[] args) {
		  Random rand=new Random(1000); Map<Integer,Integer> m=new
		  HashMap<Integer,Integer>(); for(int i=0;i<1000;i++) { int r=rand.nextInt(20);
		  Integer freq=m.get(r); m.put(r, freq==null?1:freq+1); }
		  System.out.println(m);
	}
}
