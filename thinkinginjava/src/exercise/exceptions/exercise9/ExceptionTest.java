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
		System.out.println("&&&&&&&&&&&&&&&8881");
		// TODO: handle exception
	} catch (Exception2 e) {
		// TODO Auto-generated catch block
		System.out.println("&&&&&&&&&&&&&&&8882");
		e.printStackTrace();
	} catch (Exception3 e) {
		// TODO Auto-generated catch block
		System.out.println("&&&&&&&&&&&&&&&8883");
		e.printStackTrace();
	}
	//Exercise 13
	finally {
		System.out.println("&&&&&&&&&&&&&&&&&&&&&1233333");
	}
}
}
