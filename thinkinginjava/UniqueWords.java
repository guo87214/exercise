package test.holding;

import java.util.Set;
import java.util.TreeSet;

import net.mindview.util.TextFile;

public class UniqueWords {
	public static void main(String[] args) {
		//�ļ�·����Ĭ��������Ŀ����֮�£�����Ŀ�����ļ���֮�£������ĿΪ��thinkinginjava��,���ļ���������ļ���֮�£�
		Set<String> words=new TreeSet<String>(new TextFile("StackTest.java","\\W+"));
		System.out.println(words);
	}
}
