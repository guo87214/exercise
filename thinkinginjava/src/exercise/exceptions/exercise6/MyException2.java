package exercise.exceptions.exercise6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class MyException2 extends Exception {
	public static Logger log=Logger.getLogger("MyException2");
	public MyException2() {
		StringWriter sw=new StringWriter();
		PrintWriter pw=new PrintWriter(sw);
		/* log.severe(pw.toString()); */
	}
	public static void main(String args[]) {
		try {
			throw new MyException1();
		}catch (MyException1 e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			throw new MyException2();
		}catch (MyException2 e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
