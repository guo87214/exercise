package exercise.exceptions.exercise1;

import net.mindview.util.Print;

class MyException extends Exception{
	public MyException(String args) {
		super(args);
	}
}
public class ExceptionTest {
	public void f() throws MyException {
		Print.print("f()");
		throw new MyException("MyException");
	}
	public static void main(String args[]) {
		/*exercise1
		 * try{ ExceptionTest et=new ExceptionTest(); et.f(); }catch(MyException me) {
		 * me.printStackTrace(); }finally { Print.print("Ω· ¯¡À£°"); }
		 */
		//exercise2
		/*
		 * try { ExceptionTest et=new ExceptionTest(); et=null; et.f(); }catch
		 * (Exception e) { // TODO: handle exception e.printStackTrace(); }
		 */
		//exercise3
		/*
		 * try{ExceptionTest[] et=new ExceptionTest[1]; Print.print(et[2]); }catch
		 * (Exception e) { // TODO: handle exception e.printStackTrace(); }
		 */
	}
}
