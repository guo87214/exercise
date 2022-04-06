package test.holding;

import java.util.ArrayList;
import java.util.Arrays;

import net.mindview.util.Print;

public class ArrayIsNotIterable {
	static<T>void test(Iterable<T> ib){
		for(T t:) {
			Print.print(t+" ");
		}
	}
	public static void main(String[] args) {
		/* test(new IterableClass()); */
		test(Arrays.asList(1,2,3));
		String[] strings= {"A","B","C"};
		/* test(Arrays.asList(strings)); */
		Iterable a=new ArrayList();
		Iterable b=(Iterable) new IterableClass();
	}
}
