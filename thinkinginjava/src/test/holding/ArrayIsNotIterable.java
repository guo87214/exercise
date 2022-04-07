package test.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.mindview.util.Print;

public class ArrayIsNotIterable {
	static<T>void test(Iterable<T> ib){
		for(T t:ib) {
			Print.print(t+" ");
		}
	}
	static <T> void test(List<T> li) {
		for(T t:li) {
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
