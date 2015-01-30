import com.factory.demo.pizzastore.ChicagoStylePizzaStore;
import com.factory.demo.pizzastore.NYStylePizzaStore;
import com.factory.demo.pizzastore.Pizza;
import com.factory.demo.pizzastore.PizzaStore;
import com.factory.demo.pizzastoreWithIngredient.ChicagoPizzaStore;
import com.factory.demo.pizzastoreWithIngredient.NYPizzaStore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * User: Shawn cao
 * Date: 15/1/30
 * Time: PM2:53
 */
public class FactoryPatternTest {


    @Test
    public void test_store_making_diff_flavor_pizza(){

        Pizza pizza = new NYStylePizzaStore().orderPizza(PizzaStore.PizzaType.cheese);
        assertEquals("NY Style Sauce and Cheese Pizza",pizza.getName());

        pizza = new ChicagoStylePizzaStore().orderPizza(PizzaStore.PizzaType.cheese);
        assertEquals("Chicago cheese pizza", pizza.getName());
    }

    @Test
    public void test_store_with_diff_ingredients(){
        com.factory.demo.pizzastoreWithIngredient.PizzaStore nyStore = new NYPizzaStore();
        com.factory.demo.pizzastoreWithIngredient.PizzaStore chicagoStore = new ChicagoPizzaStore();

        com.factory.demo.pizzastoreWithIngredient.Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
