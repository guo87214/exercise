package test.exceptions;

class HoHumException extends Exception {
	public String toString() {
		return "A trivial exception";
	}
}

public class LostMessage {
	void f() throws VeryImportantException {
		System.out.print("&&&&&&&&&&&&&&10");
		throw new VeryImportantException();
	}

	void dispose() throws HoHumException {
		throw new HoHumException();
	}

	public static void main(String[] args) {
		LostMessage lm=new LostMessage();
		try {
			lm.f();
		} catch (VeryImportantException e) {
			// TODO Auto-generated catch block
			System.out.print("&&&&&&&&&&&&12");
		}finally {
			System.out.println("&&&&&&&&&&&&&&&11");
			
		}
		/*
		 * try { lm.f(); try { lm.dispose(); }finally {} }catch (Exception e) { // TODO:
		 * handle exception }
		 */
		/* lm.dispose(); */
		/*
		 * LostMessage lm=new LostMessage(); try { System.out.println("&&&&&&&&&1"); try
		 * { System.out.println("&&&&&&&&&2"); lm.f(); try {
		 * System.out.println("&&&&&&&&&3"); lm.f(); }finally {
		 * System.out.println("&&&&&&&&&4"); lm.dispose(); } }finally { try {
		 * System.out.println("&&&&&&&&&5"); lm.dispose(); } finally {
		 * System.out.println("&&&&&&&&6"); lm.f(); } }}catch (Exception e) { // TODO:
		 * handle exception System.out.println(e); try { lm.f(); } catch
		 * (VeryImportantException e1) { // TODO Auto-generated catch block
		 * System.out.println("&&&&&&&&&&&7"); }finally {
		 * System.out.println("&&&&&&&&&&&8"); } }
		 * 
		 * catch (VeryImportantException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
	}
}
