package exercise.exceptions.exercise8;

import exercise.exceptions.exercise4.MyExceptionTest;
import exercise.exceptions.exercise4.MyExceptionTest.MyException;

public class ExceptionTest {
	public void f() throws MyException  {
		throw new MyExceptionTest().new MyException("");
		}
	public static void main(String args[]) {
		try {
			ExceptionTest et=new ExceptionTest();
			et.f();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
