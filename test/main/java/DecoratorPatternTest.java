import com.decorator.demo.buzzCoffee.*;
import com.decorator.demo.io.LowerCaseInputStream;
import org.junit.Test;

import java.io.*;

import static junit.framework.Assert.assertEquals;

/**
 * User: Shawn cao
 * Date: 15/1/29
 * Time: PM5:15
 */
public class DecoratorPatternTest {

    @Test
    public void test_coffee_without_condiment(){
        Beverage beverage = new HouseBlend();
        assertEquals(beverage.cost(), .89);
    }

    @Test
    public void test_coffee_with_condiments(){

        Beverage beverage = new Mocha(new Milk(new Espresso()));
        assertEquals(beverage.cost(), .20 + 0.33 + 1.99);
        assertEquals(beverage.getDescription(),"Espresso, milk, mocha tall");
    }

    @Test
    public void test_coffee_with_diff_size(){
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage) ;
        beverage.setSize(Beverage.Size.grande);
        beverage = new Mocha(beverage);
        assertEquals(beverage.cost(), .30 + .33 + 1.99,0.01);
        assertEquals(beverage.getDescription(),"Espresso, milk, mocha grande");
    }


    @Test
    public void test_lowercase_inputStream(){
        int c;
        try {
            StringBuilder sb = new StringBuilder();
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(this.getClass().getClassLoader().getResourceAsStream("text.txt")));
            while ((c = in.read()) > 0){
                sb.append((char)c);
            }

            assertEquals("redheadDuck duck = new redheadDuck();".toLowerCase().trim(),sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
