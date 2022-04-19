package exercise.exceptions.exercise4;

import net.mindview.util.Print;

class MyException extends Exception {
	public String ref;
	public MyException(String str) {
		super(str);
		ref=str;
	}
	public void f() {
		System.out.println(ref);
		
	}
	public void g() {
		System.out.println(","+ref);
	}
}
 public class MyExceptionTest{
	 public void f() throws MyException {
		 throw new MyException("test");
	 }
	 public void getF() {
		 try {
			 
				 f();
			 
				 flag=false;
			
		 }catch (MyException e) {
			// TODO: handle exception
			 flag=true;
		}
		 finally {
			 Print.print("^^^^^^^^^^^^^^7");
		 }
		 }
	 boolean flag=false;
	 public static void main(String args[]) {
			/*
			 * try { MyExceptionTest me=new MyExceptionTest(); me.f(); }catch (MyException
			 * e) { // TODO: handle exception e.f(); e.g(); e.printStackTrace(); }
			 */
		 
		 MyExceptionTest me=new MyExceptionTest();
		 do {
			 me.getF();
			 Print.print("&&&&&&&&&&&&&&&&&&&&&&7");
		 }while(me.flag);
	 }
 }
