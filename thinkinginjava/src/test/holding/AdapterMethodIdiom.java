package test.holding;

import java.util.Arrays;

import net.mindview.util.Print;

public class AdapterMethodIdiom {
	public static void main(String[] args) {
		ReversibleArrayList<String> ral=new ReversibleArrayList<String>(Arrays.asList("To be or not to be".split(" ")));
		for(String s:ral) {
			Print.print(s+" ");
		}
		for(String s:ral.reversed()) {
			Print.print(s);
		}
	}
}
