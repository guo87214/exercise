package test.exceptions;

class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}
abstract class Inning{
	public Inning()throws BaseballException{}
	public void event()throws BaseballException{}
	public abstract void atBat()throws Strike,Foul;
	public void walk() {}
}
class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoul extends Foul{}
interface Storm{
	public void event();
	public void rainHard()throws RainedOut;
}
public class StormyInning extends Inning implements Storm{
	public StormyInning(){}
	public StormyInning(String s) {
		
	}
	@Override
	public void rainHard() throws RainedOut {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atBat() throws Strike, Foul {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		try {
			StormyInning si=new StormyInning();
			si.atBat();
		}catch (PopFoul e) {
			// TODO: handle exception
			System.out.println("Pop foul");
		}catch (RainedOut e) {
			// TODO: handle exception
			System.out.println("Rained out");
		}catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
		try {
			Inning i=new StormyInning();
			i.atBat();
		}catch (Strike e) {
			// TODO: handle exception
			System.out.println("Strike");
		}catch(Foul e) {
			System.out.println("Foul");
		}catch(RainedOut e) {
			System.out.println("Rained out");
		}catch(BaseballException e) {
			System.out.println("Generic baseball exception");
		}
	}
}
