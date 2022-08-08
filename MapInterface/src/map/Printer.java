package map;

import java.io.Serializable;

public class Printer<T> {

	T thingsToPrint;

	public Printer(T thingsToPrint) {
		this.thingsToPrint = thingsToPrint;
	}

	public void print() {
		System.out.println(thingsToPrint);
	}

}
