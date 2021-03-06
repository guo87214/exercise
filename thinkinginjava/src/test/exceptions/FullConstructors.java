package test.exceptions;
class MyException extends Exception{
	public MyException() {}
	public MyException(String msg) {
		super(msg);
	}
}
public class FullConstructors {
	public static void f() throws MyException {
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}
	public static void g() throws MyException {
		System.out.println("Throwing MyExcpetion from g()");
		throw new MyException("Oringinated in g()");
	}
	public static void main(String[] args) {
		try {
			f();
		}catch(MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			g();
		}catch(MyException e) {
			e.printStackTrace(System.err);
		}
	}
}
