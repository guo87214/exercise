package exercise.holding.exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.mindview.util.Print;

public class Gerbil {
	int gerilNumber;
	String name;

	public Gerbil(int gn, String name1) {
		gerilNumber = gn;
		name = name1;
	}

	public void hop() {
		Print.print("gerilNumber:" + gerilNumber);
	}

	public static void main(String args[]) {
		//exercise 17
		Map<String,Gerbil> map=new HashMap<String,Gerbil>();
		map.put("a", new Gerbil(1,"a"));
		map.put("b", new Gerbil(2,"b"));
		map.put("c", new Gerbil(3,"c"));
		for(String s:map.keySet()) {
			map.get(s).hop();
		}
		/*exercise1
		 * List<Gerbil> gb=new ArrayList<Gerbil>(); Gerbil gb1=new Gerbil(0); Gerbil
		 * gb2=new Gerbil(1); Gerbil gb3=new Gerbil(3); gb.add(gb1); gb.add(gb2);
		 * gb.add(gb3);
		 * 
		 * for(Gerbil g:gb) { g.hop(); }
		 * 
		 * for(int i=0;i<gb.size();i++) { gb.get(i).hop(); }
		 */
	}
}
