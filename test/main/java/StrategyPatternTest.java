
import com.strategy.demo.MallardDuck;
import com.strategy.demo.RedheadDuck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Shawn cao
 * Date: 15/1/26
 * Time: AM11:45
 */
public class StrategyPatternTest {

    @Test
    public void testDuckFly(){
        MallardDuck mallard = new MallardDuck();
        assertEquals("mallard duck can fly ", mallard.performFly(),"I'm flying");
        assertEquals("mallard duck cannot quack ", mallard.performQuack(),"silence");
    }

    @Test
    public void testDuckQuack(){
        RedheadDuck duck = new RedheadDuck();
        assertEquals("redhead duck can quack", duck.performQuack(),"Quack");
        assertEquals("redhead duck cannot flying", duck.performFly(),"I can't fly");

    }
}
