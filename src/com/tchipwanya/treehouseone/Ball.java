package com.tchipwanya.treehouseone;

import java.util.Random;

public class Ball {
	
	public String getAnAnswer(){
		String[] answers = { 
				"it is certain",
				"it is decidedly so",
				"All signs say yes",
				"My stars are not aligned",
				"My reply is no",
				"It is doubtful",
				"Better not to tell you now",
				"Concentrate and ask again",
				"Unable to answer now"};
		
		Random randomGenerator = new Random();
		
		int randomNumber = randomGenerator.nextInt(answers.length);
		String answer = answers[randomNumber];
		
		return answer;
	}

}
