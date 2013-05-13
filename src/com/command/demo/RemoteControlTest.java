package com.command.demo;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		Light light = new Light();
		Command command = new LightOnCommand(light);
		remoteControl.setCommand(command);
		remoteControl.buttonPressed();
	}
}
