package com.command.demo.undo;

public interface Command {
	public void execute();
	public void undo();
}
