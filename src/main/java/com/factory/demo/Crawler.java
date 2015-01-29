package com.factory.demo;

import java.util.HashSet;
import java.util.regex.Pattern;

public abstract class Crawler {
	
	public abstract void inject(HashSet<String> urls);
	public abstract void fetch();
	public abstract void parse();
	
}
