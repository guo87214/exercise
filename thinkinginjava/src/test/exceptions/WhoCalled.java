package test.exceptions;

import net.mindview.util.Print;

public class WhoCalled {
	static void f() {
		try {
			throw new Exception();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Print.print();
			for(StackTraceElement ste:e.getStackTrace()) {
				System.out.println(ste.getMethodName());
			}
		}
	}
	static void g() {
		f();
	}
	static void h() {
		g();
	}
	public static void main(String[] args) {
		f();
		System.out.println("&&&&&&&&&&&&&");
		g();
		System.out.println("***************");
		h();
	}
}
