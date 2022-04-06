package exercise.holding.exercise31;

import java.util.Iterator;
import java.util.Random;

import polymorphism.shape.Circle;
import polymorphism.shape.Shape;
import polymorphism.shape.Square;
import polymorphism.shape.Triangle;

public class RandomShapeGenerator implements Iterable{
	 private Random rand = new Random(47);
	  public Shape next() {
	    switch(rand.nextInt(3)) {
	      default:
	      case 0: return new Circle();
	      case 1: return new Square();
	      case 2: return new Triangle();
	    }
	  }
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String [] args) {
		
	}
}
