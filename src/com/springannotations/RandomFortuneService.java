package com.springannotations;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	
	private String[] data = {
		"a","b","c"	
	};
	
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
    
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
		
	}

}
