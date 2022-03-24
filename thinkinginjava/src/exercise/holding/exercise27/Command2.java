package exercise.holding.exercise27;

import java.util.Queue;

public class Command2 {
	public void consume(Command1 c) {
		Command com;
		Queue q=c.filQueue();
		while((com=(Command) (q.peek()))!=null) {
			com.operation();
		}
	}
	public static void main(String [] str) {
		Command2 c=new Command2();
		c.consume(new Command1());
	} 
}
