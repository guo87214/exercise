package test.exceptions;

public class OnOffSwitch {
	private static Switch sw=new Switch();
	public static void f() throws OnOffException1,OnOffException2,Exception
	{
		throw new OnOffException1();
		
	}
	public static void main(String[] args) {
		try {
			//throw new RuntimeException();
			f();
			sw.off();
		}catch (OnOffException1 e) {
			// TODO: handle exception
			System.out.println("OnOffException1");
			sw.off();
		}catch(OnOffException2 e) {
			System.out.println("OnOffException2");
			sw.off();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
