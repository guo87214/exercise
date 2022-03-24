package exercise.holding.exercise27;

import java.util.LinkedList;
import java.util.Queue;

public class Command1 {
	public Queue filQueue() {
		Queue q=new LinkedList<Command>();
		q.offer(new Command("a"));
		q.offer(new Command("b"));
		q.offer(new Command("c"));
		return q;
	}
}
