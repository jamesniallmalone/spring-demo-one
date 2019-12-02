package com.luv2code.springdemo.fortune;

import java.util.Random;

public class RandomFortune implements FortuneService {

	@Override
	public String getFortune() {
		String[] selection = new String[3];
		selection[0] = "You can do it, you can do it!";
		selection[1] = "Back to bed.";
		selection[2] = "Solid effort";
		
		Random rand = new Random();
		return selection[rand.nextInt(selection.length)];
	}

}
