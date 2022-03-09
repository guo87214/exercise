package exercise.holding.exercise1;

import java.util.ArrayList;
import java.util.List;

import net.mindview.util.Print;

public class Gerbil {
	int gerilNumber;
public Gerbil(int gn) {
	gerilNumber=gn;
}

public void hop() {
	Print.print("gerilNumber:"+gerilNumber);
}
public static void main(String args[]) {
	List<Gerbil> gb=new ArrayList<Gerbil>();
	Gerbil gb1=new Gerbil(0);
	Gerbil gb2=new Gerbil(1);
	Gerbil gb3=new Gerbil(3);
	gb.add(gb1);
	gb.add(gb2);
	gb.add(gb3);
	/*
	 * for(Gerbil g:gb) { g.hop(); }
	 */
	for(int i=0;i<gb.size();i++) {
		gb.get(i).hop();
	}
}
}
