package com.shawn.patterns;

import com.template.demo.CaffineBeverageWithHook;
import com.template.demo.Coffee;
import com.template.demo.Tea;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Shawn Cao
 */
public class TemplatePatternTest {

    @Test
    public void testMakingTeaAndCoffee() {
        CaffineBeverageWithHook beverageWithHook = new Tea();
        assertEquals(" Steeping the tea ",beverageWithHook.brew());
        assertEquals("lemon",beverageWithHook.addCondiments());

        beverageWithHook = new Coffee();
        assertEquals("Dripping coffee through filter", beverageWithHook.brew().trim());
        assertEquals("sugar and milk",beverageWithHook.addCondiments().trim());
    }
}
