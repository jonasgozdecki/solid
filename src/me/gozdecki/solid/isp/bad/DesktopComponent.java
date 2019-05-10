package me.gozdecki.solid.isp.bad;
/*
 * The touch and swipe methods are forcing to be used here. Thus bad workaround in throwing an exception.
 *  
 * */

public class DesktopComponent implements Component {

	public void mouseover(String event) {
		System.out.println("Mouse click Event Fired");
	}

	public void touch(String event) {
		throw new UnsupportedOperationException("touch not supported");
	}

	public void swipe(String event) {
		throw new UnsupportedOperationException("swipe not supported");
	}
	
	public void validate() {
		System.out.println("All UI is valid");		
	}

}
