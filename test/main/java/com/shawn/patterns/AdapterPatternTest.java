package com.shawn.patterns;

import com.adapter.demo.Duck;
import com.adapter.demo.Turkey;
import com.adapter.demo.TurkeyAdapter;
import com.adapter.demo.WildTurkey;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * User: Shawn cao
 * Date: 15/2/3
 * Time: PM3:16
 */
public class AdapterPatternTest {

    @Test
    public void test_turkey_adapt_to_duck() {
        Turkey wildTurkey = new WildTurkey();
        Duck adapter = new TurkeyAdapter(wildTurkey);
        assertTrue(adapter.fly().toLowerCase().contains("fly"));
        assertTrue(adapter.quack().contains("gobble"));
    }
}
