package exercise.holding.exercise31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import polymorphism.shape.Circle;
import polymorphism.shape.Shape;
import polymorphism.shape.Square;
import polymorphism.shape.Triangle;

public class RandomShapeGenerator implements Iterable{
	 private Random rand = new Random(47);
	public  List<Shape> ls=new ArrayList<Shape>();
	  public Shape next() {
	    switch(rand.nextInt(3)) {
	      default:
	      case 0: return new Circle();
	      case 1: return new Square();
	      case 2: return new Triangle();
	    }
	  }
	  public RandomShapeGenerator(int num) {
		  for(int i=0;i<num;i++) {
			  ls.add(next());
		  }
	  }
	  public static void main(String [] args) {
		  RandomShapeGenerator rs=new RandomShapeGenerator(8);
		  Iterator ir=rs.iterator();
		  while(ir.hasNext()) {
			  ( (Shape) ir.next()).draw();
		  }
	  }
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new Iterator() {
			int a;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return a<ls.size();
			}

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				return ls.get(a++);
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
}
