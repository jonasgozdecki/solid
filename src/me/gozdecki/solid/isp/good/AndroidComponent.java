package me.gozdecki.solid.isp.good;

/*
 * Implementing the TouchUIComponent wipe out mouseOver from here where was forced to be used. 
 *   
 * */
public class AndroidComponent implements TouchUIComponent {

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
