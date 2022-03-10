package exercise.holding.exercise13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import innerclasses.controller.Event;

public class Controller {
	/*
	 * // A class from java.util to hold Event objects: private List<Event>
	 * eventList = new ArrayList<Event>(); public void addEvent(Event c) {
	 * eventList.add(c); } public void run() { while(eventList.size() > 0) // Make a
	 * copy so you're not modifying the list // while you're selecting the elements
	 * in it: for(Event e : new ArrayList<Event>(eventList)) if(e.ready()) {
	 * System.out.println(e); e.action(); eventList.remove(e); } }
	 */
	private List<Event> eventList=new LinkedList<Event>();
	public void addEvent(Event c) {
		eventList.add(c);
	}
	public void run() {
		while(!eventList.isEmpty()) {
		Iterator<Event> it=eventList.iterator();
		while(it.hasNext()) {
			Event e=it.next();
			if(e.ready()) {
				System.out.println(e);
				e.action();
				eventList.remove(e);
			}
		}
		}
	}
}
