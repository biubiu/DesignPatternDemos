package com.shawn.patterns;

import com.iterator.demo.*;
import org.junit.Test;

/**
 * @author Shawn Cao
 */
public class IteratorPatternTest {

    @Test
    public void testDinnerAndPanHousePrintWithIterator(){

        Waitress waitress = new Waitress(new DinnerMenu(),new PancakeHouseMenu());
        waitress.printAll();
    }

    private static class Waitress{
        Menu dinerMenu;
        Menu pancakeMenu;

        public Waitress(Menu dinerMenu, Menu pancakeMenu) {
            this.dinerMenu = dinerMenu;
            this.pancakeMenu = pancakeMenu;
        }

        public void printAll(){
            printMenu(pancakeMenu.createIterator());
            System.out.println("----------------");
            printMenu(dinerMenu.createIterator());
        }

        private void printMenu(Iterator<MenuItem> iterator){
            while (iterator.hasNext()){
                MenuItem menuItem =  iterator.next();
                System.out.println(menuItem.toString());
            }
        }
    }
}
