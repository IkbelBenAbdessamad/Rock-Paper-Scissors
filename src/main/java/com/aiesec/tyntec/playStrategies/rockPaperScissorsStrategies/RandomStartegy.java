package com.aiesec.tyntec.playStrategies.rockPaperScissorsStrategies;

import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.aiesec.tyntec.playStrategies.PlayStrategy;
import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
@Component
@Qualifier("RandomMethod")
public class RandomStartegy implements PlayStrategy {
	private final Random Random = new Random();
	private int answer;

	/**
	 * Return a random Player Descison according to the random value returned by getRandomFrom1to3() method
	 */
	@Override
	public PlayerDescison retrievePlayerDescision(int round) {

		int value = getRandomFrom1to3();
		switch (value) {
		case 1:
			return PlayerDescison.Rock;
		case 2:
			return PlayerDescison.Paper;
		default:
			return PlayerDescison.Scissors;

		}
	}

	/**
	 * Return a random variable range from 1-3
	 */
	public int getRandomFrom1to3() {
		answer = Random.nextInt(3) + 1;
		return answer;
	}

}
