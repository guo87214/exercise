package exercise.exceptions.exercise6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class MyException1 extends Exception {
	public static Logger log=Logger.getLogger("MyException1");
	public MyException1() {
		StringWriter sw=new StringWriter();
		PrintWriter pw=new PrintWriter(sw);
		log.severe(pw.toString());
	}
}
