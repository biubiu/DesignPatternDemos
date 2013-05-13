package com.command.demo;

public class GarageDoorOpenCommand implements Command{
	GarageDoor garageDoor;
	public GarageDoorOpenCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	@Override
	public void execute() {
		garageDoor.up();
	}
}

class GarageDoor{
	public GarageDoor() {}
	public void up() {
		System.out.println("garage up ");
	}
	public void down() {
		System.out.println("garage down");
	}
	public void stop() {
		System.out.println("garage stop");
	}
	
	public void LightOn(){
		System.out.println("garage lights on");
	}
	public void LightDown(){
		System.out.println("garage lights down");
	}
}
