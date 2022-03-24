package exercise.holding.exercise27;

import net.mindview.util.Print;

public class Command {
	public String str;
	
	public Command(String str) {
		super();
		this.str = str;
	}

	public void operation() {
		Print.print(str);
	}
}
