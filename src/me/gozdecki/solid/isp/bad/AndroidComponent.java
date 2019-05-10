package me.gozdecki.solid.isp.bad;

/*
 * The mouseOver is forced in this class. Thus bad workaround in throwing an exception.
 *  
 * */
public class AndroidComponent implements Component {

	public void mouseover(String event) {
		throw new UnsupportedOperationException("Mouse click not supported");
	}

	public void touch(String event) {
		System.out.println("Touch Event Fired");
	}

	public void swipe(String event) {
		System.out.println("Swipe Event Fired");
	}

	public void validate() {
		System.out.println("All UI is valid");		
	}

}
