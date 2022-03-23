package exercise.holding.exercise22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.mindview.util.Print;
import net.mindview.util.TextFile;

public class WordClass {
	public String word;
	public Integer count;
	public WordClass(String word, Integer count) {
		super();
		this.word = word;
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "WordClass [word=" + word + ", count=" + count + "]";
	}

	public static void main(String args[]) {
		Set <String> wordSet=new HashSet<String>(new TextFile("SetOperations.java", "\\W+"));
		List<String> wordList=new ArrayList<String>(new TextFile("SetOperations.java","\\W+"));
		Set<WordClass> wordClassSet=new HashSet<WordClass>();
		for(String s:wordSet) {
			int i=0;
			for(String s1:wordList) {
				if(s.equals(s1)) {
					i++;
				}
			}
			wordClassSet.add(new WordClass(s,i));
		}
		Print.print(wordClassSet);
	}
}
