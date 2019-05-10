package me.gozdecki.solid.isp.good;

/*
 * Implementing the NonTouchUIComponent wipe out swipe and touch from here to it's specific interface TouchUIComponent 
 *   
 * */
public class DesktopComponent implements NonTouchUIComponent {

	public void mouseover(String event) {
		System.out.println("Mouse click Event Fired");

	}

	public void validate() {
		System.out.println("All UI is valid");
		
	}

}
