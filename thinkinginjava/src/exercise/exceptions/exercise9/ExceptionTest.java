package exercise.exceptions.exercise9;

public class ExceptionTest {
public void f() throws Exception1,Exception2,Exception3 {
	throw new Exception1();
}
public static void main(String args[]) {
	try {
	ExceptionTest et=new ExceptionTest();
	et.f();
	}catch (Exception1 e) {
		// TODO: handle exception
	} catch (Exception2 e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (Exception3 e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
