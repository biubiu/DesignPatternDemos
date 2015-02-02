package com.command.demo.simple;

/**
 * User: Shawn cao
 * Date: 15/2/2
 * Time: AM11:54
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command){
        slot = command;
    }

    public String buttonWasPressed(){
        return slot.execute();
    }
}
