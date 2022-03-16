package test.holding;

import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

public class UniqueWords {
	public static void main(String[] args) {
		//文件路径，默认下是项目名称之下，即项目名称文件夹之下，如该项目为“thinkinginjava”,该文件即在这个文件夹之下！
		Set<String> words=new TreeSet<String>(new TextFile("StackTest.java","\\W+"));
		System.out.println(words);
	}
}
