package test.exceptions;
class OneException extends Exception{
	public OneException(String s) {
		super(s);
	}
}
class TwoException extends Exception{
	public TwoException(String s) {
		super(s);
	}
}
public class RethrowNew {
	public static void f() throws OneException {
		System.out.println("originaing the exception in f()");
		throw new OneException("thrown from f()");
	}
	public static void main(String[] args) throws TwoException {
		try {
			f();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught in inner try,e.printStackTrace()");
			e.printStackTrace(System.out);
			throw new TwoException("from inner try");
		}
	}
}
