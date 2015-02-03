package com.adapter.demo;

public class WildTurkey implements Turkey{


	@Override
	public String fly() {
        String fly = "Flying with a long distance";
        System.out.println(fly);
        return fly;
	}

	@Override
	public String gobble() {
        String gobble = " Gobble gobble";
        System.out.println(gobble);
        return gobble;
	}

}
