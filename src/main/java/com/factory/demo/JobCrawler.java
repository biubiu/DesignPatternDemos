package com.factory.demo;
import java.util.List;

import com.google.common.collect.Sets;

public abstract class JobCrawler {
	public Crawler process(String type,List<String> urls){
	 Crawler crawler;
	 crawler = createCrawler(type);
	 crawler.inject(Sets.newHashSet(urls));
	 crawler.fetch();
	 crawler.parse();
	 return crawler;
	}
	
	abstract Crawler createCrawler(String type);
}
