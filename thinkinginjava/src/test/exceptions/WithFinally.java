package test.exceptions;

public class WithFinally {
	static Switch sw=new Switch();
	public static void main(String[] args) {
		try {
			try {
				throw new RuntimeException();
			}catch (Exception e) {
				// TODO: handle exception//Ʒ
				System.out.println("RuntimeException()");
			}
			sw.on();
			OnOffSwitch.f();
		}
		catch (OnOffException1 e) {
			// TODO Auto-generated catch block
			System.out.println("OnOffException2");
			e.printStackTrace();
		} 
		catch (OnOffException2 e) {
			// TODO: handle exception
			System.out.println("OnOffException1222");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			sw.off();
		}
	}
}
