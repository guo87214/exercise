package exercise.holding.exercise15;

import java.util.Stack;

public class StackEvaluate {
	public static void main(String [] args) {
		Stack<String> s=new Stack<String>();
		String str="+U+n+c--+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
		for(String st:str.split("")) {
			if(st.equals("+")) {
				continue;
			}
			if(st.equals("-")) {
				s.pop();
				continue;
			}
			s.push(st);
		}
	} 
}
