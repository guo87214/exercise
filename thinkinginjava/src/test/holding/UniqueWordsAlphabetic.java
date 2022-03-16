package test.holding;

import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

public class UniqueWordsAlphabetic {
	public static void main(String[] args) {
		Set<String> words=new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("StackTest.java","\\W+"));
		System.out.println(words);
	}
}
