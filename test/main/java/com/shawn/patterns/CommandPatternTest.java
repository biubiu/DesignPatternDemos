package com.shawn.patterns;

import com.command.demo.simple.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Shawn cao
 * Date: 15/2/2
 * Time: AM11:56
 */
public class CommandPatternTest {

    @Test
    public void test_remote_return_light_on(){
        SimpleRemoteControl control = new SimpleRemoteControl();
        LightOnCommand command = new LightOnCommand(new Light());

        control.setCommand(command);
        assertEquals("lights on", control.buttonWasPressed());

        control.setCommand(new GarageDoorOpenCommand(new Door()));

        assertEquals("roll up", control.buttonWasPressed());
    }
}
