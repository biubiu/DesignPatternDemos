package com.command.demo;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControl(){
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		//Command noCommand = new NoCommand();
	}
}
