package test.holding;

import java.util.Map;

import net.mindview.util.Print;

public class EnvironmentVariables {
	public static void main(String[] args) {
		for(Map.Entry entry:System.getenv().entrySet()) {
			Print.print(entry.getKey()+":"+entry.getValue());
		}
	}
}
