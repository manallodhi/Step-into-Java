package LightBulb;

public class Bulb {

	private Boolean isOn = false ;
	
	void turnOn(){
		isOn = true ;
		System.out.println("The Bulb is on");
	}
	
	void turnOff(){
		isOn = false ;
		System.out.println("The Bulb is off");
	}
	
	void showStatus(){
    	System.out.println("Current State of Bulb : " + (isOn ? "On" : "Off"));
	}
}
