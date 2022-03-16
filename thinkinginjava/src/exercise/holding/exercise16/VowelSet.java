package exercise.holding.exercise16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

public class VowelSet {
	public static void main(String[] args) {
		/* Set<String> un=new TreeSet(new TextFile("UniqueWords.java","")); */
		String[] vow= {"a","e","i","o","u"};
		Set<String> vl=new HashSet<String>();
		List<String> ls=new ArrayList<String>(new TextFile("UniqueWords.java",""));
		System.out.print(ls);
		int anm=0;
		int enm=0;
		int inm=0;
		int onm=0;
		int unm=0;
		/*
		 * vowel.add("a"); vowel.add("e"); vowel.add("i"); vowel.add("o");
		 * vowel.add("u");
		 */
		for(String s:vow) {
			vl.add(s);
		}
		for(String s:ls) {
		if(s.equals("a")) {
			anm++;
			}
		else if(s.equals("e")) {
			enm++;
		}else if(s.equals("i")) {
			inm++;
		}else if(s.equals("o")) {
			onm++;
		}else if(s.equals("u")){
			unm++;
		}
		}
		System.out.print("该文件中有元音字母"+(anm+enm+inm+onm+unm)+"个；有a"+anm+"个，有e"
		+enm+"个，有i"+inm+"个，有o"+onm+"个，有u"+unm+"个！");
	}
}
