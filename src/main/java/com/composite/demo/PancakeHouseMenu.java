package com.composite.demo;

import java.util.ArrayList;

public class PancakeHouseMenu {
	ArrayList menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		//addItem("Vega", description, vegetarian, price)
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList getMenuItems(){
		return menuItems;
	}
		
}
