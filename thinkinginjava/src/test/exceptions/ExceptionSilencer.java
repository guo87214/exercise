package test.exceptions;

import net.mindview.util.Print;

public class ExceptionSilencer {
	public static void f() {
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		try {
			System.out.println("bbbbbbbbbbbbb");
			//throw new RuntimeException();
			f();
		}finally {
			System.out.println("aaaaaaaaa");
			return;
			
		}
	}
}
