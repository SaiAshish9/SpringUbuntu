package com.springannotations;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "sad";
	}

}
