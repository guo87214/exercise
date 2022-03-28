package exercise.holding.exercise28;

import java.util.PriorityQueue;
import java.util.Random;

import net.mindview.util.Print;

public class PriorityQueueTest {
		public static void main(String args[]) {
			Random ran=new Random(1);
			PriorityQueue<Double> ps=new PriorityQueue<Double>(); 
			for(int i=0;i<10;i++) {
				ps.offer(ran.nextDouble());
			}
			Double d;
			while((d=ps.poll())!=null) {
				Print.print(d);
			}
			}
}
