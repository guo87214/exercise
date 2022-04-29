package exercise.exceptions.exercise10;
class MyException1 extends Exception{}
class MyException2 extends Exception{}
public class TwoExceptionTest {
	public void f() throws MyException1 {
		throw new MyException1();
	}
	public void g() throws MyException2 {
		try{f();}catch (MyException1 e) {
			// TODO: handle exception
			throw new MyException2();
		}
	}
	public static void main(String args[]) {
		TwoExceptionTest te=new TwoExceptionTest();
		try {
te.f();			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			te.g();
		}catch (MyException2 e) {
			// TODO: handle exception
			e.printStackTrace();
			RuntimeException re=new RuntimeException(e);
			re.printStackTrace();
		}
	}
}
