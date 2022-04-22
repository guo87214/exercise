package test.exceptions;

import net.mindview.util.Print;

public class ExceptionMethods {
	public static void main(String[] args) {
		try {
			throw new Exception("My Exception");
		}catch (Exception e) {
			// TODO: handle exception
			Print.print("Caught Exception"+"\n"+"getMessage():"+e.getMessage()+"\n"
					+"getLocalizedMessage():"+e.getLocalizedMessage()+"\n"+"toString():"+e
					+"\n"+"printStackTrace():");
			e.printStackTrace(System.out);
		}
	}
}
